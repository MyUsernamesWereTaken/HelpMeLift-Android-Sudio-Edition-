package com.example.helpmelift;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.databinding.ActivityMuscleExercisesBinding;

public class MuscleExercises extends AppCompatActivity {

    private ActivityMuscleExercisesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_exercises);

        String muscleSelection = getIntent().getStringExtra("Muscle");
        ((TextView)findViewById(R.id.muscleSelected)).setText(muscleSelection);
    }



}