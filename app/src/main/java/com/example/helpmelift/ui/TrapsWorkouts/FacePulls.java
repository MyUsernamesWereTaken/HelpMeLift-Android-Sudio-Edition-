package com.example.helpmelift.ui.TrapsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class FacePulls extends AppCompatActivity {

    //VIDEO NOT FOUND
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traps_face_pulls);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView FacePulls_video= (VideoView) findViewById(R.id.FacePullsvid);
        //FacePulls_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.);

        mediaController.setAnchorView(FacePulls_video);
        FacePulls_video.setMediaController(mediaController);

        FacePulls_video.start();
    }
}