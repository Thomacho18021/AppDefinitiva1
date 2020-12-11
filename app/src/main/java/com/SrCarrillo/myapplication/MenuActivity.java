package com.SrCarrillo.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageButton btnRadio, btnBiblia, btnProgramas, btnImagenes, btnRRSS ,btnValoranos;
    private String titulo;
    private String password;

    //FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.abs_layout);







        //mAuth = FirebaseAuth.getInstance();
        //FirebaseUser user = mAuth.getCurrentUser();



        btnRadio = findViewById(R.id.btnRadio);
        btnBiblia = findViewById(R.id.btnBiblia);
        btnProgramas = findViewById(R.id.btnProgramas);
        btnImagenes = findViewById(R.id.btnImagenes);
        btnRRSS = findViewById(R.id.btnRRSS);
        btnValoranos = findViewById(R.id.btnValoranos);

        btnRadio.setOnClickListener(this);
        btnBiblia.setOnClickListener(this);
        btnProgramas.setOnClickListener(this);
        btnImagenes.setOnClickListener(this);
        btnRRSS.setOnClickListener(this);
        btnValoranos.setOnClickListener(this);




        Bundle data = this.getIntent().getExtras();
        //password = data.getString("password");
        Toast.makeText(this,"Bienvenido", Toast.LENGTH_LONG).show();


    }
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_actions, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle presses on the action bar items
        switch (item.getItemId()) {
            case R.id.ABCerrarSesion:
                //mAuth.signOut();
                ir_a(MainActivity.class);
                return true;
            case R.id.ABSalir:
                finishAffinity();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
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
            case R.id.btnBiblia:
                ir_a(BibliaActivity.class);
                break;
            case R.id.btnProgramas:
                ir_a(ProgramasActivity.class);
                break;
            case R.id.btnImagenes:
                ir_a(ImgVersiculosActivity.class);
                break;
            case R.id.btnRRSS:
                ir_a(RedesActivity.class);
                break;
            case R.id.btnValoranos:
                ir_a(ValoranosActivity.class);
                break;
        }
    }
}