package com.example.helpmelift.ui.TricepsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class OverheadTricepExtension extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_overhead_tricep_extension);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView TricepExtension_video= (VideoView) findViewById(R.id.TricepExtensionvid);
        TricepExtension_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.triceps_overhead_tricep_extension);

        mediaController.setAnchorView(TricepExtension_video);
        TricepExtension_video.setMediaController(mediaController);

        TricepExtension_video.start();
    }
}