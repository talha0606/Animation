package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SurahKafironDashboard extends AppCompatActivity {
    Button readButton;
    Button audioButton;
    Button videoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_kafiron_dashboard);
        getSupportActionBar().setTitle("Surah Al-Kafiron");
        readButton=findViewById(R.id.surahKafironReadButton);
        audioButton=findViewById(R.id.surahKafironAudioButton);
        videoButton=findViewById(R.id.surahKafironVideoButton);

        readButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahKafiron.class));
            }
        });
        audioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahKafironAudio.class));
            }
        });
        videoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getApplicationContext(),VideoActivity.class);
                intent.putExtra("surahName","surahkafiroonvideo");
                startActivity(intent);
            }
        });
    }
}