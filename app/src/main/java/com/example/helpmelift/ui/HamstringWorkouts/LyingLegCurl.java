package com.example.helpmelift.ui.HamstringWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class LyingLegCurl extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hamstrings_lying_leg_curl);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView l_legcurl_video= (VideoView) findViewById(R.id.lyinglegcurlvid);
        l_legcurl_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hamstrings_lying_leg_curl);

        mediaController.setAnchorView(l_legcurl_video);
        l_legcurl_video.setMediaController(mediaController);

        l_legcurl_video.start();
    }
}