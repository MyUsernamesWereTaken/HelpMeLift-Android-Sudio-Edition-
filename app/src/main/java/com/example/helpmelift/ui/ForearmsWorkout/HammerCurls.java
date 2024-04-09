package com.example.helpmelift.ui.ForearmsWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class HammerCurls extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forearms_hammer_curls);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView crunch_video= (VideoView) findViewById(R.id.Hammer_Curlsvid);
        crunch_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.forearms_hammer_curls);

        mediaController.setAnchorView(crunch_video);
        crunch_video.setMediaController(mediaController);

        crunch_video.start();
    }
}