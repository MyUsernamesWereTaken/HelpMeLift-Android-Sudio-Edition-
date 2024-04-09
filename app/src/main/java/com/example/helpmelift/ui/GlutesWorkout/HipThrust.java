package com.example.helpmelift.ui.GlutesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class HipThrust extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glutes_hip_thrust);


        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView hipthrust_video= (VideoView) findViewById(R.id.hipthrustvid);
        hipthrust_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.glutes_hip_thrust);

        mediaController.setAnchorView(hipthrust_video);
        hipthrust_video.setMediaController(mediaController);

        hipthrust_video.start();
    }
}