package com.example.helpmelift;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.databinding.ActivityBicepMusclesBinding;

public class BicepMuscle extends AppCompatActivity {

    private ActivityBicepMusclesBinding binding;
    private String muscleSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep_muscles);

        String muscleSelection = getIntent().getStringExtra("Muscle");
        this.muscleSelected = muscleSelection;
        ((TextView)findViewById(R.id.muscleSelected)).setText(muscleSelection);

    }



}