package com.example.helpmelift.ui.TricepsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class TricepPushdown extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_tricep_pushdown);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView TricepPushdown_video= (VideoView) findViewById(R.id.TricepPushdownvid);
        TricepPushdown_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.triceps_tricep_pushdown);

        mediaController.setAnchorView(TricepPushdown_video);
        TricepPushdown_video.setMediaController(mediaController);

        TricepPushdown_video.start();
    }
}