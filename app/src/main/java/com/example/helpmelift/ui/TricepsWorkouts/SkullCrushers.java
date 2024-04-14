package com.example.helpmelift.ui.TricepsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class SkullCrushers extends AppCompatActivity {

    //VIDEO NOT FOUND
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triceps_skull_crushers);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView skullcrushers_video= (VideoView) findViewById(R.id.SkullCrushersvid);
        //skullcrushers_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.triceps_skullcrushers);

        mediaController.setAnchorView(skullcrushers_video);
        skullcrushers_video.setMediaController(mediaController);

        skullcrushers_video.start();
    }
}