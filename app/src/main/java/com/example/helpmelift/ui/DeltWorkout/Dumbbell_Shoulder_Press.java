package com.example.helpmelift.ui.DeltWorkout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import com.example.helpmelift.R;

public class Dumbbell_Shoulder_Press extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delts_dumbbell_shoulder_press);

        MediaController mediaController = new MediaController(this);
        VideoView crunch_video= (VideoView) findViewById(R.id.dbshoulderpressvid);
        crunch_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.delt_db_shoulder_press);

        mediaController.setAnchorView(crunch_video);
        crunch_video.setMediaController(mediaController);

        crunch_video.start();
    }
}