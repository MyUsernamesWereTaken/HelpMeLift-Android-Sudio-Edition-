package com.example.helpmelift;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.databinding.ActivityGlutesMusclesBinding;

public class GlutesMuscle extends AppCompatActivity {

    private ActivityGlutesMusclesBinding binding;
    private String muscleSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glutes_muscles);

        String muscleSelection = getIntent().getStringExtra("Muscle");
        this.muscleSelected = muscleSelection;
        ((TextView)findViewById(R.id.muscleSelected)).setText(muscleSelection);

    }



}