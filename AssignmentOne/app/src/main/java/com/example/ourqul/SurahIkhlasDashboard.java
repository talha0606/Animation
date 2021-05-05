package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurahIkhlasDashboard extends AppCompatActivity {
    Button readButton;
    Button audioButton;
    Button videoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_ikhlas_dashboard);
        getSupportActionBar().setTitle("Surah Al-Ikhlas");
        readButton=findViewById(R.id.surahIkhlasReadButton);
        audioButton=findViewById(R.id.surahIkhlasAudioButton);
        videoButton=findViewById(R.id.surahIkhlasVideoButton);

        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahIkhlas.class));
            }
        });
        audioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahIkhlasAudio.class));
            }
        });
        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VideoActivity.class);
                intent.putExtra("surahName","surahikhlasvideo");
                startActivity(intent);
            }
        });
    }
}