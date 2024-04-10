package com.example.helpmelift.ui.HamstringWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class DeadLifts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamstrings_deadlifts);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView deadlifts_video= (VideoView) findViewById(R.id.deadliftsvid);
        deadlifts_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hamstrings_deadlift);

        mediaController.setAnchorView(deadlifts_video);
        deadlifts_video.setMediaController(mediaController);

        deadlifts_video.start();
    }
}