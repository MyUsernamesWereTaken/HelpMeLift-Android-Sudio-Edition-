package com.example.helpmelift.ui.LatsWorkout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.helpmelift.R;

public class PendlayRows extends AppCompatActivity {

    //VIDEO NOT FOUND
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lats_pendlay_rows);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView PendlayRow_video= (VideoView) findViewById(R.id.PendlayRowvid);
        //PendlayRow_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lats_pendlay_row);

        mediaController.setAnchorView(PendlayRow_video);
        PendlayRow_video.setMediaController(mediaController);

        PendlayRow_video.start();
    }
}