package com.example.helpmelift.ui.BicepWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Standing_Bicep_Curl_bb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep_standing_bb_curls);

        MediaController mediaController = new MediaController(this);
        VideoView bb_curl_video= (VideoView) findViewById(R.id.Standing_Bicep_Curl_Barbell_Vid);
        bb_curl_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.bicep_standing_curls_bb);

        mediaController.setAnchorView(bb_curl_video);
        bb_curl_video.setMediaController(mediaController);

        bb_curl_video.start();
    }
}