package com.example.helpmelift.ui.BicepWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Incline_Bicep_Curl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep_incline_curl);


        MediaController mediaController = new MediaController(this);
        VideoView sitting_curl_video= (VideoView) findViewById(R.id.Incline_Bicep_Curl_Vid);
        sitting_curl_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.bicep_standing_curls_db);

        mediaController.setAnchorView(sitting_curl_video);
        sitting_curl_video.setMediaController(mediaController);

        sitting_curl_video.start();
    }
}