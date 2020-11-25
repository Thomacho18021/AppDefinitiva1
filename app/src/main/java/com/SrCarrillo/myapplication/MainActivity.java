package com.SrCarrillo.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.FirebaseUiUserCollisionException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public static final int REQUEST_CODE= 96207;

    private EditText txtEmail, txtContrasena;
    private Button btnRegistrar, btnIniciarSesion;
    private ProgressDialog progressDialog;



    //Declarar objeto FirebaseAuth
    private FirebaseAuth firebaseAuth;
    FirebaseAuth.AuthStateListener mAuthStateListener;
    /*List<AuthUI.IdpConfig> provider = Arrays.asList(
            new AuthUI.IdpConfig.FacebookBuilder().build(),
            new AuthUI.IdpConfig.GoogleBuilder().build(),
            new AuthUI.IdpConfig.EmailBuilder().build(),
            new AuthUI.IdpConfig.PhoneBuilder().build()
    );*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();
        /*mAuthStateListener = new FirebaseAuth.AuthStateListener() {
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

        txtEmail = findViewById(R.id.txtEmail);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        progressDialog = new ProgressDialog(this);

        btnRegistrar.setOnClickListener(this);
        btnIniciarSesion.setOnClickListener(this);
    }


    private void RegistrarUsuario() {
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

    }

    private void LoginUsuario() {
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

        progressDialog.setMessage("Realizando Login...");
        progressDialog.show();

        //Inicio de Sesion
        firebaseAuth.signInWithEmailAndPassword(email, contrasena).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    int pos = email.indexOf("@");
                    String user = email.substring(0,pos);
                    Toast.makeText(MainActivity.this, "Bienvenido ", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplication(),MenuActivity.class);
                    intent.putExtra(RegistrateActivity.usuario,user);
                    startActivity(intent);
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
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRegistrar:
                RegistrarUsuario();
                break;
            case R.id.btnIniciarSesion:
                LoginUsuario();
                break;
        }
    }
}


