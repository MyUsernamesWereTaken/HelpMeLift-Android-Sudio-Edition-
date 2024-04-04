package com.example.helpmelift.ui.CalvesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Standing_Calf_Raises extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calf_standing_raises);

        MediaController mediaController = new MediaController(this);
        VideoView standing_Calf_Raise_video= (VideoView) findViewById(R.id.Standing_Calf_Raises_Vid);
        //single_standing_Calf_Raise_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.calf_standing_raises);

        mediaController.setAnchorView(standing_Calf_Raise_video);
        standing_Calf_Raise_video.setMediaController(mediaController);

        standing_Calf_Raise_video.start();
    }
}