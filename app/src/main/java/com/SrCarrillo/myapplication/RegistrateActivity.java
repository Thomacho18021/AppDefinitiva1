package com.SrCarrillo.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
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

public class RegistrateActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String usuario="names";
    private TextView tieneCuenta;
    private Button btnRegister;
    private EditText txtUsuario, txtCorreo, txtContra, txtConfirmContra;
    private ProgressDialog mProgressBar;

    FirebaseAuth mAuth;

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


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                verificarCredenciales();
            }
        });
        mAuth = FirebaseAuth.getInstance();
        mProgressBar = new ProgressDialog(RegistrateActivity.this);

    }

    public void verificarCredenciales(){
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
    }
    private void showError(EditText input, String s){
        input.setError(s);
        input.requestFocus();
    }

    @Override
    public void onClick(View v) {

    }
}