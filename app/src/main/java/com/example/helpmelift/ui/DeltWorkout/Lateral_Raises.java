package com.example.helpmelift.ui.DeltWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Lateral_Raises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delts_lateral_raises);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView lateralRaises_video= (VideoView) findViewById(R.id.LateralRaisesvid);
        lateralRaises_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.delt_lateral_raises);

        mediaController.setAnchorView(lateralRaises_video);
        lateralRaises_video.setMediaController(mediaController);

        lateralRaises_video.start();
    }
}