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
import com.example.helpmelift.databinding.FragmentForearmsExercisesBinding;
import com.example.helpmelift.viewWorkout;

public class ForearmsExercisesFragment extends Fragment {

    private FragmentForearmsExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Hammer_Curls);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Forearm_Curls_Db);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Farmer_Carries);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Forearm_Curls_Cable);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Hammer Curls"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Forearm Curls (Dumbbell)"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Farmer Carries"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Forearm Curls (Cable)"));

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