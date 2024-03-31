package com.example.helpmelift.ui.AbsWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class lsit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_lsit);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercise)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView lsit_video= (VideoView) findViewById(R.id.lsitvid);
        lsit_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ab_lsit);

        mediaController.setAnchorView(lsit_video);
        lsit_video.setMediaController(mediaController);

        lsit_video.start();
    }
}