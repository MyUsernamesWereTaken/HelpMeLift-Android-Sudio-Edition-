package com.example.helpmelift;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.databinding.ActivityMuscleExercisesBinding;
import com.example.helpmelift.ui.MuscleGroups.MuscleGroupsFragment;

public class MuscleExercises extends AppCompatActivity {

    private ActivityMuscleExercisesBinding binding;
    private String muscleSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muscle_exercises);

        String muscleSelection = getIntent().getStringExtra("Muscle");
        this.muscleSelected = muscleSelection;
        ((TextView)findViewById(R.id.muscleSelected)).setText(muscleSelection);

        if(this.muscleSelected.equals("Deltoids")){
            binding.setDeltsChosen(true);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Abs")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(true);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Biceps")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(true);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Calves")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(true);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Glutes")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(true);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Forearms")) {
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(true);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Chest")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(true);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Triceps")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(true);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Hamstring")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(true);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Quadriceps")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(true);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Trapezius")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(true);
            binding.setLatsChosen(false);
        }else if(this.muscleSelected.equals("Latissimus Dorsi")){
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(true);
        }else{
            binding.setDeltsChosen(false);
            binding.setAbsChosen(false);
            binding.setBicepsChosen(false);
            binding.setCalvesChosen(false);
            binding.setGlutesChosen(false);
            binding.setForearmsChosen(false);
            binding.setChestChosen(false);
            binding.setTricepsChosen(false);
            binding.setHamstringsChosen(false);
            binding.setQuadsChosen(false);
            binding.setTrapsChosen(false);
            binding.setLatsChosen(false);
        }
    }



}