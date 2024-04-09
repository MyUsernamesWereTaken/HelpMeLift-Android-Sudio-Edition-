package com.example.helpmelift.ui.GlutesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class HipAbduction extends AppCompatActivity {

    //VIDEO NOT FOUND
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glutes_hip_abduction);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView HipAbduction_video= (VideoView) findViewById(R.id.HipAbductionvid);
        //HipAbduction_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.glutes_hip_abduction);

        mediaController.setAnchorView(HipAbduction_video);
        HipAbduction_video.setMediaController(mediaController);

        HipAbduction_video.start();
    }
}