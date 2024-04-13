package com.example.helpmelift.ui.LatsWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class LatPulldown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lats_lat_pulldown);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView LatPulldown_video= (VideoView) findViewById(R.id.LatPulldownvid);
        LatPulldown_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lats_row);

        mediaController.setAnchorView(LatPulldown_video);
        LatPulldown_video.setMediaController(mediaController);

        LatPulldown_video.start();
    }
}