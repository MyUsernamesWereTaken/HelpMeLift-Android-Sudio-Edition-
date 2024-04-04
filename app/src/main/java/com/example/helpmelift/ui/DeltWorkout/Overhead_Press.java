package com.example.helpmelift.ui.DeltWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Overhead_Press extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delts_overhead_press);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView crunch_video= (VideoView) findViewById(R.id.OverheadPressvid);
        crunch_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.delt_overhead_press);

        mediaController.setAnchorView(crunch_video);
        crunch_video.setMediaController(mediaController);

        crunch_video.start();
    }
}