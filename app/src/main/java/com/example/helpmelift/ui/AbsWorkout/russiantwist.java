package com.example.helpmelift.ui.AbsWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class russiantwist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_russiantwist);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView russiaTwist_video= (VideoView) findViewById(R.id.russiantwistvid);
        russiaTwist_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ab_russiantwists);

        mediaController.setAnchorView(russiaTwist_video);
        russiaTwist_video.setMediaController(mediaController);

        russiaTwist_video.start();
    }
}