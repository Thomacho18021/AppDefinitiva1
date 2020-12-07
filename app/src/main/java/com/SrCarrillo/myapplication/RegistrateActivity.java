package com.SrCarrillo.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.UUID;

public class RegistrateActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String usuario="names";
    private TextView tieneCuenta;
    private Button btnRegister;
    private EditText txtUsuario, txtCorreo, txtContra, txtConfirmContra;
    private ProgressDialog mProgressBar;

    FirebaseDatabase database;
    DatabaseReference reference;

    //FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);

        /*String user = getIntent().getStringExtra("names");
        txtBienvenida.setText("Bienvenido "+user);*/

        btnRegister = findViewById(R.id.btnRegister);
        tieneCuenta = findViewById(R.id.alreadyHaveAccount);

        txtUsuario = findViewById(R.id.inputUsername);
        txtCorreo = findViewById(R.id.inputEmail);
        txtContra = findViewById(R.id.inputPassword);
        txtConfirmContra = findViewById(R.id.inputConfirmPassword);
        database = FirebaseDatabase.getInstance();
        reference = database.getReference();


        btnRegister.setOnClickListener(this);
        tieneCuenta.setOnClickListener(this);
        //mAuth = FirebaseAuth.getInstance();
        mProgressBar = new ProgressDialog(RegistrateActivity.this);

    }
    public void alerta(String m){
        Toast.makeText(this,m,Toast.LENGTH_LONG).show();
        return;
    }
    public void registro(){
        String id = UUID.randomUUID().toString();
        String nombreUsuario = txtUsuario.getText().toString().trim();
        String email = txtCorreo.getText().toString().trim();
        String password = txtContra.getText().toString().trim();
        reference.child("usuarios").addValueEventListener(new ValueEventListener() {
            Usuario userObtenido;
            boolean userExiste = false;
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot: snapshot.getChildren()){
                    userObtenido = dataSnapshot.getValue(Usuario.class);
                    if(email.equals(userObtenido.getEmail())){
                        userExiste = true;
                        alerta("Correo ya Existe");
                        return;
                    }
                    if(nombreUsuario.equals(userObtenido.getNombreUsuario())){
                        userExiste = true;
                        alerta("Nombre de Usuario ya existe");
                        return;
                    }
                }
                if(userExiste == false){
                    if(txtContra.getText().toString().trim().equals(txtConfirmContra.getText().toString().trim())==false){
                        alerta("Las contraseñas no cooinciden");
                        txtContra.setText("");
                        txtConfirmContra.setText("");
                        return;
                    }
                }
                Usuario usuario = new Usuario(id,nombreUsuario,email,password);
                reference.child("usuarios").child(usuario.getId()).setValue(usuario, new DatabaseReference.CompletionListener() {
                    @Override
                    public void onComplete(@Nullable DatabaseError error, @NonNull DatabaseReference ref) {
                        alerta(usuario.getEmail()+" Registrado Correctamente");
                        ir_a(MainActivity.class);
                    }
                });
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
    }

    /*public void verificarCredenciales(){
        String username = txtUsuario.getText().toString();
        String email = txtCorreo.getText().toString();
        String password = txtContra.getText().toString();
        String confirmPass = txtConfirmContra.getText().toString();
        if(username.isEmpty() || username.length() < 5){
            showError(txtUsuario,"Username no valido");
        }else if (email.isEmpty() || !email.contains("@")){
            showError(txtCorreo,"Email no valido");
        }else if (password.isEmpty() || password.length() < 6){
            showError(txtContra,"Clave no valida minimo 6 caracteres");
        }else if (confirmPass.isEmpty() || !confirmPass.equals(password)){
            showError(txtConfirmContra,"Clave no valida, no coincide.");
        }else{
            //Mostrar ProgressBar
            mProgressBar.setTitle("Proceso de Registro");
            mProgressBar.setMessage("Registrando usuario, espere un momento");
            mProgressBar.setCanceledOnTouchOutside(false);
            mProgressBar.show();
            //Registrar usuario
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        //ocultar progressBar
                        mAuth.signOut();
                        mProgressBar.dismiss();
                        Intent intent = new Intent(RegistrateActivity.this, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                        Toast.makeText(getApplicationContext(),"Registrado Correctamente", Toast.LENGTH_LONG).show();

                    }else{
                        Toast.makeText(getApplicationContext(), "No se ha registrado", Toast.LENGTH_LONG).show();
                    }
                }
            });
            //Exitoso -> Mostrar toast
            //redireccionar - intent a login
            Intent intent = new Intent(RegistrateActivity.this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            //ocultar progressBar
            mProgressBar.dismiss();
        }
    }*/
    private void showError(EditText input, String s){
        input.setError(s);
        input.requestFocus();
    }
    private void ir_a(Class c){
        Intent i = new Intent(RegistrateActivity.this,c);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnRegister:
                registro();
                break;
            case R.id.alreadyHaveAccount:
                ir_a(MainActivity.class);
                break;

        }
    }
}