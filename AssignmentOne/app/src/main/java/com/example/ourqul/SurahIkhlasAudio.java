package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurahIkhlasAudio extends AppCompatActivity {
    Button playAudio;
    Button pauseAudio;
    Button stopeAudio;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_ikhlas_audio);
        getSupportActionBar().setTitle("Surah Al-Ikhlas");
        mediaPlayer= MediaPlayer.create(SurahIkhlasAudio.this,R.raw.surahikhlas);
        playAudio =findViewById(R.id.surahIkhlasPlayButton);
        pauseAudio =findViewById(R.id.surahIkhlasPauseButton);
        stopeAudio =findViewById(R.id.surahIkhlasStopButton);

        playAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mediaPlayer.isPlaying()==false)
                    mediaPlayer.start();

            }
        });
        pauseAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()==true)
                    mediaPlayer.pause();
            }
        });
        stopeAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()==true) {
                    mediaPlayer.pause();
                    mediaPlayer.seekTo(0);
                }
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mediaPlayer.isPlaying()==true)
            mediaPlayer.stop();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        if(mediaPlayer.isPlaying()==true)
            mediaPlayer.stop();
    }

    @Override
    protected void onPause() {
        super.onPause();
        if(mediaPlayer.isPlaying()==true)
            mediaPlayer.pause();
    }
}