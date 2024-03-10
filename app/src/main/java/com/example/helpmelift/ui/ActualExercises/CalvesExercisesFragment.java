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
import com.example.helpmelift.databinding.FragmentCalvesExercisesBinding;
import com.example.helpmelift.viewWorkout;

public class CalvesExercisesFragment extends Fragment {

    private FragmentCalvesExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Overhead_Press);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Dumbbell_Shoulder_Press);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Lateral_Raises);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Bent_Over_Rear_Delt_Flys);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Overhead Press"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Dumbbell Shoulder Press"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Lateral Raises"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Bent Over Rear Delt Flys"));

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