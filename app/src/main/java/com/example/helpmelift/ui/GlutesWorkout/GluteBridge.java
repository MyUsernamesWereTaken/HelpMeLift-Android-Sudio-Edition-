package com.example.helpmelift.ui.GlutesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class GluteBridge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glutes_glute_bridge);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView GluteBridge_video= (VideoView) findViewById(R.id.Glute_Bridgevid);
        GluteBridge_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.glutes_glute_bridge);

        mediaController.setAnchorView(GluteBridge_video);
        GluteBridge_video.setMediaController(mediaController);

        GluteBridge_video.start();
    }
}