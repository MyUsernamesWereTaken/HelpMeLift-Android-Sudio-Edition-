package com.example.helpmelift.ui.HamstringWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class RomanianDeadlift extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamstrings_romanian_deadlift);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView rdl_video= (VideoView) findViewById(R.id.rdlvid);
        rdl_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hamstrings_romanian_deadlifts);

        mediaController.setAnchorView(rdl_video);
        rdl_video.setMediaController(mediaController);

        rdl_video.start();
    }
}