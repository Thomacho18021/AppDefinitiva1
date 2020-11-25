package com.SrCarrillo.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class RegistrateActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String usuario="names";
    TextView txtBienvenida;
    private Button btnCerrarSesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrate);


        txtBienvenida = findViewById(R.id.txtBienvenida);
        btnCerrarSesion = findViewById(R.id.btnCerrarSesion);
        String user = getIntent().getStringExtra("names");
        txtBienvenida.setText("Bienvenido "+user);

        btnCerrarSesion.setOnClickListener(this);


    }
    public void cerrarSesion(){

    }


    @Override
    public void onClick(View v) {
        cerrarSesion();
    }
}