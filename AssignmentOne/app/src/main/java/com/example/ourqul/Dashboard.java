package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Dashboard extends AppCompatActivity {
    Button surahKafironButton;
    Button surahIkhlasButton;
    Button surahFalakButton;
    Button surahNasButton;
    Button surahKafironDashboardButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        //getSupportActionBar().setTitle("Dashboard");
        getSupportActionBar().hide();
        surahKafironButton=findViewById(R.id.surahKafironButton);
        surahIkhlasButton=findViewById(R.id.surahIkhlasButton);
        surahFalakButton=findViewById(R.id.surahFalakButton);
        surahNasButton=findViewById(R.id.surahNasButton);
        surahKafironButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahKafironDashboard.class));
            }
        });
        surahIkhlasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SurahIkhlasDashboard.class));
            }
        });
        surahFalakButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahFalakDashboard.class));
            }
        });
        surahNasButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SurahNasDashboard.class));
            }
        });

    }
}