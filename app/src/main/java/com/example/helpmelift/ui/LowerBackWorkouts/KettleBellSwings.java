package com.example.helpmelift.ui.LowerBackWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class KettleBellSwings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowerback_kettle_bell_swings);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView KettleBellSwings_video= (VideoView) findViewById(R.id.KettleBellSwingsvid);
        KettleBellSwings_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lowerback_kettlebell_swings);

        mediaController.setAnchorView(KettleBellSwings_video);
        KettleBellSwings_video.setMediaController(mediaController);

        KettleBellSwings_video.start();
    }
}