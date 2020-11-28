package com.SrCarrillo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnRadio, btn2, btn3, btn4, btnRRSS ,btnValoranos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        btnRadio = findViewById(R.id.btnRadio);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btnRRSS = findViewById(R.id.btnRRSS);
        btnValoranos = findViewById(R.id.btnValoranos);

        btnRadio.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btnRRSS.setOnClickListener(this);
        btnValoranos.setOnClickListener(this);

    }
    private void ir_a(Class c){
        Intent i = new Intent(MenuActivity.this,c);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnRadio:
                ir_a(RadioActivity.class);
                break;
            case R.id.btn2:
            case R.id.btn3:
            case R.id.btn4:
            case R.id.btnRRSS:
                ir_a(RedesActivity.class);
                break;
            case R.id.btnValoranos:
                ir_a(ValoranosActivity.class);
                break;
        }
    }
}