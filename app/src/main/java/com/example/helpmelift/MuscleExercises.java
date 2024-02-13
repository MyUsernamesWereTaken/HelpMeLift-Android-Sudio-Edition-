package com.example.helpmelift;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.databinding.ActivityMuscleExercisesBinding;

public class MuscleExercises extends AppCompatActivity {

    private ActivityMuscleExercisesBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_exercises);
    }

}