package com.example.helpmelift.ui.GlutesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class HipAdduction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glutes_hip_adduction);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView HipAdduction_video= (VideoView) findViewById(R.id.HipAdductionvid);
        HipAdduction_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.glutes_hip_adduction);

        mediaController.setAnchorView(HipAdduction_video);
        HipAdduction_video.setMediaController(mediaController);

        HipAdduction_video.start();
    }
}