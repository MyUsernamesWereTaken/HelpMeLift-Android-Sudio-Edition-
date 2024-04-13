package com.example.helpmelift.ui.LowerBackWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class GoodMornings extends AppCompatActivity {

    //VIDEO NOT FOUND
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lowerback_good_mornings);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView GoodMornings_video= (VideoView) findViewById(R.id.GoodMorningsvid);
        //GoodMornings_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.hamstrings_deadlift);

        mediaController.setAnchorView(GoodMornings_video);
        GoodMornings_video.setMediaController(mediaController);

        GoodMornings_video.start();
    }
}