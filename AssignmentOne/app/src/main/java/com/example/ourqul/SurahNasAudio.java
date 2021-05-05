package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurahNasAudio extends AppCompatActivity {
    Button playAudio;
    Button pauseAudio;
    Button stopeAudio;
    MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_nas_audio);getSupportActionBar().setTitle("Surah Al-Falak");
        mediaPlayer= MediaPlayer.create(SurahNasAudio.this,R.raw.surahnas);
        playAudio =findViewById(R.id.surahNasPlayButton);
        pauseAudio =findViewById(R.id.surahNasPauseButton);
        stopeAudio =findViewById(R.id.surahNasStopButton);

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