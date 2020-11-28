package com.SrCarrillo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class ValoranosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_valoranos);


        Button btnEnviar = findViewById(R.id.btnEnviar);
        final EditText txtNombre = findViewById(R.id.txtNombre);
        final EditText txtComentario = findViewById(R.id.txtComentario);
        final RatingBar ratingBar = findViewById(R.id.ratingBar);

        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail(txtNombre.getText().toString()+":\n"+txtComentario.getText().toString()+"\n"+ratingBar.getRating()+" Estrellas");
            }
        });
    }
    public void enviarEmail(String mensaje){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);


        String mailto = "mailto:ThomasCarrilloGonzalez@gmail.com" +
                "?cc=" + " " +
                "&body=" + Uri.encode(mensaje);

        emailIntent.setData(Uri.parse(mailto));
        emailIntent.putExtra(Intent.EXTRA_EMAIL, "thomascarrillogonzalez@gmail.com"); // * configurar email aquí!
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "App Ministerio Puerta Abierta - Opinión");
        emailIntent.putExtra(Intent.EXTRA_TEXT, mensaje);

        try {
            startActivity(Intent.createChooser(emailIntent, "Enviar email."));
            Log.i("EMAIL", "Muchas Gracias por ayudarnos, Bendiciones");
        }
        catch (android.content.ActivityNotFoundException e) {
            Toast.makeText(getApplication(), "NO existe ningún cliente de email instalado!", Toast.LENGTH_LONG).show();
        }

    }
}