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
import com.example.helpmelift.databinding.FragmentHamstringExercisesBinding;

public class HamstringExercisesFragment extends Fragment {

    private FragmentHamstringExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Lying_Leg_Curl);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Seated_Leg_Curl);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Romanian_Deadlift_Barbell);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Deadlift);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Lying Leg Curl"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Seated Leg Curl"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Romanian_Deadlift (Barbell)"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Deadlifts (Any Variation)"));

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