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



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);

        database = FirebaseDatabase.getInstance();
        reference = database.getReference();

        txtOlvContra = findViewById(R.id.txtOlvContra);
        txtRegistrate = findViewById(R.id.txtRegistrate);

        txtEmail = findViewById(R.id.txtEmail);
        txtContrasena = findViewById(R.id.txtContrasena);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
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


