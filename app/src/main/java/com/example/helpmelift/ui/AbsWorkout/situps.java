package com.example.helpmelift.ui.AbsWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class situps extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_situps);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercise)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView situp_video= (VideoView) findViewById(R.id.situpvid);
        situp_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.ab_situps);

        mediaController.setAnchorView(situp_video);
        situp_video.setMediaController(mediaController);

        situp_video.start();
    }
}