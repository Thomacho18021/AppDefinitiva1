package com.SrCarrillo.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.io.IOException;

public class RadioActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private ImageView imgPlayPause;
    boolean conectado;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        imgPlayPause = findViewById(R.id.imgPlayPause);
        progressBar = findViewById(R.id.progressBar);
        progressBar.setIndeterminate(true);
        conectado = conectar();

        imgPlayPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    imgPlayPause.setImageResource(R.drawable.ic_play);
                }else{
                    mediaPlayer.start();
                    imgPlayPause.setImageResource(R.drawable.ic_pause);
                }
            }
        });
    }
    public boolean conectar(){
        Toast.makeText(getApplicationContext(),"Intentado conectar",Toast.LENGTH_LONG).show();


        String url = "http://stm3.miradio.com.es:12036/"; // your URL here
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepareAsync();// might take long! (for buffering, etc)
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mediaPlayer) {
                    Toast.makeText(getApplicationContext(),"Conectado",Toast.LENGTH_LONG).show();
                    progressBar.setVisibility(View.GONE);
                    imgPlayPause.setEnabled(true);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}