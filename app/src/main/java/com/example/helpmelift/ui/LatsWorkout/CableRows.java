package com.example.helpmelift.ui.LatsWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class CableRows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lats_cable_rows);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView cableRow_video= (VideoView) findViewById(R.id.cableRowvid);
        cableRow_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lats_cable_rows);

        mediaController.setAnchorView(cableRow_video);
        cableRow_video.setMediaController(mediaController);

        cableRow_video.start();
    }
}