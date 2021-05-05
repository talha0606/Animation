package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurahNasDashboard extends AppCompatActivity {
    Button readButton;
    Button audioButton;
    Button videoButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_nas_dashboard);
        getSupportActionBar().setTitle("Surah Al-Nas");
        readButton=findViewById(R.id.surahNasReadButton);
        audioButton=findViewById(R.id.surahNasAudioButton);
        videoButton=findViewById(R.id.surahNasVideoButton);

        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahNas.class));
            }
        });
        audioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahNasAudio.class));
            }
        });
        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VideoActivity.class);
                intent.putExtra("surahName","surahnasvideo");
                startActivity(intent);
            }
        });
    }
}