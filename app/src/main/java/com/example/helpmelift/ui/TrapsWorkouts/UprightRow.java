package com.example.helpmelift.ui.TrapsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class UprightRow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traps_upright_row);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView UprightRow_video= (VideoView) findViewById(R.id.UprightRowvid);
        UprightRow_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.traps_uprightrows);

        mediaController.setAnchorView(UprightRow_video);
        UprightRow_video.setMediaController(mediaController);

        UprightRow_video.start();
    }
}