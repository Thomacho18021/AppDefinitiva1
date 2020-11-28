package com.SrCarrillo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RedesActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageButton btnFbMPA, btnFbCCS, btnIgMPA, btnIgCCS,  btnYtMPA, btnWsMPA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redes);

        btnFbMPA = findViewById(R.id.btnFbMPA);
        btnFbCCS = findViewById(R.id.btnFbCCS);
        btnIgMPA = findViewById(R.id.btnIgMPA);
        btnIgCCS = findViewById(R.id.btnIgCCS);
        btnYtMPA = findViewById(R.id.btnYtMPA);
        btnWsMPA = findViewById(R.id.btnWsMPA);

        btnFbMPA.setOnClickListener(this);
        btnFbCCS.setOnClickListener(this);
        btnIgMPA.setOnClickListener(this);
        btnIgCCS.setOnClickListener(this);
        btnYtMPA.setOnClickListener(this);
        btnWsMPA.setOnClickListener(this);



    }
    public void RRSS(String link){
        Uri uri = Uri.parse(link);
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnFbMPA:
                String FbMPA = "https://www.facebook.com/ministerio.puertaabierta.1/";
                RRSS(FbMPA);
                break;
            case R.id.btnFbCCS:
                String FbCCS = "https://www.facebook.com/Cada-Coraz%C3%B3n-Sanado-101732991665181";
                RRSS(FbCCS);
                break;
            case R.id.btnIgMPA:
                String IgMPA = "https://www.instagram.com/ministerio.puerta.abierta/";
                RRSS(IgMPA);
                break;
            case R.id.btnIgCCS:
                String IgCCS = "https://www.instagram.com/cadacorazonsanado/";
                RRSS(IgCCS);
                break;
            case R.id.btnYtMPA:
                String YtMPA = "https://www.youtube.com/MinisterioPuertaAbiertaChile/";
                RRSS(YtMPA);
                break;
            case R.id.btnWsMPA:
                String WsMPA = "http://www.ministeriopuertaabierta.com/";
                RRSS(WsMPA);
                break;
        }
    }
}