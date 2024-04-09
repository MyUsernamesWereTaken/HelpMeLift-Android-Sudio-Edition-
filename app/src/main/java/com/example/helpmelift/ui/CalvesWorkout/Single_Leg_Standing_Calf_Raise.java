package com.example.helpmelift.ui.CalvesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Single_Leg_Standing_Calf_Raise extends AppCompatActivity {


    //VIDEO NOT FOUND
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calf_raise_single_leg);

        MediaController mediaController = new MediaController(this);
        VideoView single_standing_Calf_Raise_video= (VideoView) findViewById(R.id.Single_Standing_Calf_Raises_Vid);
        //single_standing_Calf_Raise_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.calf_standing_raises);

        mediaController.setAnchorView(single_standing_Calf_Raise_video);
        single_standing_Calf_Raise_video.setMediaController(mediaController);

        single_standing_Calf_Raise_video.start();
    }
}