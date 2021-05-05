package com.example.ourqul;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {
    VideoView videoView;
    int currentPosition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView=findViewById(R.id.surahVideoView);

        String surahName;
        Bundle extra=getIntent().getExtras();
        surahName=extra.getString("surahName");
        if (surahName.equals("surahkafiroonvideo")) {
            getSupportActionBar().setTitle("Surah Al-Kafiroon");
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.surahkafiroonvideo);
        }
        if (surahName.equals("surahfalaqvideo")) {
            getSupportActionBar().setTitle("Surah Al-Falak");
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.surahfalaqvideo);
        }
        if (surahName.equals("surahnasvideo")) {
            getSupportActionBar().setTitle("Surah Al-Nas");
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.surahnasvideo);
        }
        if (surahName.equals("surahikhlasvideo")) {
            getSupportActionBar().setTitle("Surah Al-Ikhlas");
            videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.surahikhlasvideo);
        }
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
    }


}