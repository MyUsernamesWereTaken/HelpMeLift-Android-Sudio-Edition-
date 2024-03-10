package com.example.helpmelift;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.helpmelift.databinding.ActivityDeltsMusclesBinding;

public class DeltMuscle extends AppCompatActivity {

    private ActivityDeltsMusclesBinding binding;
    private String muscleSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delts_muscles);

        String muscleSelection = getIntent().getStringExtra("Muscle");
        this.muscleSelected = muscleSelection;
        ((TextView)findViewById(R.id.muscleSelected)).setText(muscleSelection);

    }



}