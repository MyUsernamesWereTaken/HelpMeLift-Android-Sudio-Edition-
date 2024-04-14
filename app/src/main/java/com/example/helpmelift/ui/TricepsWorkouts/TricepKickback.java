package com.example.helpmelift.ui.TricepsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class TricepKickback extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_tricep_kickback);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView TricepKickbacks_video= (VideoView) findViewById(R.id.TricepKickbacksvid);
        TricepKickbacks_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.triceps_tricep_kickback);

        mediaController.setAnchorView(TricepKickbacks_video);
        TricepKickbacks_video.setMediaController(mediaController);

        TricepKickbacks_video.start();
    }
}