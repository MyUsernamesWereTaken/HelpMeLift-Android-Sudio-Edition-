package com.example.helpmelift;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.R;
import com.example.helpmelift.databinding.ActivityAbsCrunchesBinding;

public class Crunches extends AppCompatActivity {

    private ActivityAbsCrunchesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abs_crunches);


        String exercise = getIntent().getStringExtra("Exercise");
        ((TextView)findViewById(R.id.exercises)).setText(exercise);

        //VideoView crunch_video= findViewById(R.id.crunchesvid);
        //crunch_video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.crunches);
    }

}
