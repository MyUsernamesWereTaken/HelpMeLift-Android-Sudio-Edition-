package com.example.helpmelift.ui.CalvesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Donkey_Raises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calf_donkey_raises);

        MediaController mediaController = new MediaController(this);
        VideoView donkey_raises_video= (VideoView) findViewById(R.id.Donkey_Raises_Vid);
        //standing_Calf_Raise_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.calf_standing_raises);

        mediaController.setAnchorView(donkey_raises_video);
        donkey_raises_video.setMediaController(mediaController);

        donkey_raises_video.start();
    }
}