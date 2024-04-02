package com.example.helpmelift.ui.CalvesWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class Box_Jump extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calf_box_jump);

        MediaController mediaController = new MediaController(this);
        VideoView box_jump_video= (VideoView) findViewById(R.id.box_jump_Vid);
        box_jump_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.calf_box_jump);

        mediaController.setAnchorView(box_jump_video);
        box_jump_video.setMediaController(mediaController);

        box_jump_video.start();
    }
}