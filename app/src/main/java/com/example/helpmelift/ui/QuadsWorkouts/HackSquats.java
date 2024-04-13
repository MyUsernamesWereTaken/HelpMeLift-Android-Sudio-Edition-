package com.example.helpmelift.ui.QuadsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class HackSquats extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quads_hack_squats);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView BackSquat_video= (VideoView) findViewById(R.id.BackSquatvid);
        BackSquat_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.quads_hack_squat);

        mediaController.setAnchorView(BackSquat_video);
        BackSquat_video.setMediaController(mediaController);

        BackSquat_video.start();
    }
}