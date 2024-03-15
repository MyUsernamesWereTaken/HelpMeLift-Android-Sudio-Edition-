package com.example.helpmelift.ui.ActualExercises;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.helpmelift.R;
import com.example.helpmelift.databinding.FragmentTricepExercisesBinding;
import com.example.helpmelift.viewWorkout;


public class TricepExercisesFragment extends Fragment {

    private FragmentTricepExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.SkullCrushers);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Tricep_Kickback);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Overhead_Tricep_Extensions);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Tricep_Pushdown);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "SkullCrushers"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Tricep Kickback"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Overhead Tricep Extensions"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Tricep Pushdown"));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseworkout(Context context, String workout) {
        Intent intent = new Intent(context, viewWorkout.class);
        intent.putExtra("Exercise", workout);
        startActivity(intent);
    }

}