package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurahFalakDashboard extends AppCompatActivity {
    Button readButton;
    Button audioButton;
    Button videoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_falak_dashboard);
        getSupportActionBar().setTitle("Surah Al-Falak");
        readButton=findViewById(R.id.surahFalakReadButton);
        audioButton=findViewById(R.id.surahFalakAudioButton);
        videoButton=findViewById(R.id.surahFalakVideoButton);

        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahFalak.class));
            }
        });
        audioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahFalakAudio.class));
            }
        });
        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VideoActivity.class);
                intent.putExtra("surahName","surahfalaqvideo");
                startActivity(intent);
            }
        });
    }
}