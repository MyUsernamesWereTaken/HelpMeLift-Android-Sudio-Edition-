package com.example.helpmelift.ui.TrapsWorkouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class DumbbellShrugs extends AppCompatActivity {

    //VIDEO NOT FOUND
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_traps_dumbbell_shrugs);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView DbShrugs_video= (VideoView) findViewById(R.id.DbShrugsvid);
        //DbShrugs_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.);

        mediaController.setAnchorView(DbShrugs_video);
        DbShrugs_video.setMediaController(mediaController);

        DbShrugs_video.start();
    }
}