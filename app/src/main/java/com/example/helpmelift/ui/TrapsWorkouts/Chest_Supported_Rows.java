package com.example.helpmelift.ui.TrapsWorkouts;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.R;

public class Chest_Supported_Rows extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lats_chest_supported_rows);

        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        MediaController mediaController = new MediaController(this);
        VideoView ChestSupportedRows_video= (VideoView) findViewById(R.id.ChestSupportedRowsvid);
        ChestSupportedRows_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.lats_row);

        mediaController.setAnchorView(ChestSupportedRows_video);
        ChestSupportedRows_video.setMediaController(mediaController);

        ChestSupportedRows_video.start();
    }
}