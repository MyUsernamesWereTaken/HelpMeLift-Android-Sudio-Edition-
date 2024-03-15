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
import com.example.helpmelift.databinding.FragmentLowerbackExercisesBinding;
import com.example.helpmelift.viewWorkout;


public class LowerBackExercisesFragment extends Fragment {

    private FragmentLowerbackExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Prisoner_Back_Extensions);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Deadlifts);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Good_Mornings);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Kettlebell_Swings);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Prisoner Back Extensions"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Deadlifts"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Good Mornings"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Kettlebell Swings"));

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