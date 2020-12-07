package com.SrCarrillo.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiUserCollisionException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int REQUEST_CODE= 96207;

    private EditText txtEmail, txtContrasena;
    private Button btnIniciarSesion,btnGoogle, btnFacebook;
    private TextView txtOlvContra, txtRegistrate;
    private ProgressDialog progressDialog;

    FirebaseDatabase database;
    DatabaseReference reference;



    //Declarar objeto FirebaseAuth
    /*private FirebaseAuth firebaseAuth;
    FirebaseAuth.AuthStateListener mAuthStateListener;
    List<AuthUI.IdpConfig> provider = Arrays.asList(
            new AuthUI.IdpConfig.FacebookBuilder().build(),
            new AuthUI.IdpConfig.GoogleBuilder().build(),
            new AuthUI.IdpConfig.EmailBuilder().build(),
            new AuthUI.IdpConfig.PhoneBuilder().build()
    );*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();


        /*firebaseAuth = FirebaseAuth.getInstance();
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser  user = firebaseAuth.getCurrentUser();
                if(user!= null){
                    Toast.makeText(MainActivity.this,"Iniciaste Sesion", Toast.LENGTH_SHORT).show();
                }else{
                    startActivityForResult(AuthUI
                            .getInstance()
                            .createSignInIntentBuilder()
                            .setAvailableProviders(provider)
                            .setIsSmartLockEnabled(false)
                            .build(),
                            REQUEST_CODE);

                }
            }
        };*/
        txtOlvContra = findViewById(R.id.txtOlvContra);
        txtRegistrate = findViewById(R.id.txtRegistrate);

        txtEmail = findViewById(R.id.txtEmail);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        /*btnGoogle = findViewById(R.id.btnGoogle);
        btnFacebook = findViewById(R.id.btnFacebook);*/
        progressDialog = new ProgressDialog(this);

        txtRegistrate.setOnClickListener(this);
        btnIniciarSesion.setOnClickListener(this);
    }
    public void alerta(String m){
        Toast.makeText(this,m,Toast.LENGTH_LONG).show();
    }
    public void inicioSesion(){
        String email = txtEmail.getText().toString().trim();
        String password = txtContrasena.getText().toString().trim();
        reference.child("usuarios").addValueEventListener(new ValueEventListener() {
            Usuario userObtenido;
            boolean userExiste = false;
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot: snapshot.getChildren()){
                    userObtenido = dataSnapshot.getValue(Usuario.class);
                    if (userObtenido.getEmail().equals(email)){
                        userExiste = true;
                        if(userObtenido.getPassword().equals(password)){
                            alerta("Sesion Iniciada Correctamente");
                            ir_a(MenuActivity.class);
                        }else{
                            txtContrasena.setError("Contraseña Incorrecta");

                        }
                    }
                }
                if(userExiste == false){
                    alerta("Email No registrado");
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        alerta("Iniciando Sesion...");
    }

    /*@Override
    protected void onStart() {
        FirebaseUser user = firebaseAuth.getCurrentUser();
        if(user != null){
            SharedPreferences prefs = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
            String password_guardada = prefs.getString("password","");
            Intent i = new Intent(MainActivity.this,MenuActivity.class);
            i.putExtra("password",password_guardada);
            i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(i);
        }
        super.onStart();
    }*/

 /*private void RegistrarUsuario() {
        String email = txtEmail.getText().toString().trim();
        String contrasena = txtContrasena.getText().toString().trim();

        if (TextUtils.isEmpty(email)) {
            txtEmail.setError("Casilla Vacia");
            return;
        }
        if (TextUtils.isEmpty(contrasena)) {
            txtContrasena.setError("Casilla Vacia");
            return;
        }

        progressDialog.setMessage("Realizando registro...");
        progressDialog.show();


        //crear nuevo usuario
        firebaseAuth.createUserWithEmailAndPassword(email, contrasena).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(MainActivity.this, "Email Registrado", Toast.LENGTH_LONG).show();
                } else {
                    if (task.getException() instanceof FirebaseUiUserCollisionException) {
                        Toast.makeText(MainActivity.this, "Usuario Ya Registrado", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Registro Fallido", Toast.LENGTH_LONG).show();
                    }
                }
                progressDialog.dismiss();
            }
        });

    }*/

   /* private void LoginUsuario() {
        String email = txtEmail.getText().toString().trim();
        String contrasena = txtContrasena.getText().toString().trim();

        if (email.isEmpty() ) {
            showError(txtEmail, "Email inválido");
            return;
        }
        if (contrasena.isEmpty() || contrasena.length()<6) {
            showError(txtContrasena, "Contraseña inválida");
            return;
        }

        progressDialog.setTitle("Login");
        progressDialog.setMessage("Realizando Login...");
        progressDialog.show();

        //Inicio de Sesion
        firebaseAuth.signInWithEmailAndPassword(email, contrasena).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    progressDialog.dismiss();

                    SharedPreferences prefs = getSharedPreferences("MyPreferences", Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = prefs.edit();
                    editor.putString("password",contrasena);
                    editor.commit();
                    int pos = email.indexOf("@");
                    String user = email.substring(0,pos);
                    Toast.makeText(MainActivity.this, "Bienvenido ", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplication(),MenuActivity.class);
                    intent.putExtra("password",contrasena);
                    intent.putExtra(RegistrateActivity.usuario,user);
                    startActivity(intent);
                } else {
                    if (task.getException() instanceof FirebaseUiUserCollisionException) {
                        Toast.makeText(MainActivity.this, "Usuario Ya Registrado", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "Registro Fallido", Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }*/
    private void showError(EditText input, String s){
        input.setError(s);
        input.requestFocus();
    }
    private void ir_a(Class c){
        Intent i = new Intent(MainActivity.this,c);
        startActivity(i);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtRegistrate:
                ir_a(RegistrateActivity.class);
                break;
            case R.id.btnIniciarSesion:
                inicioSesion();
                break;
        }
    }
}


