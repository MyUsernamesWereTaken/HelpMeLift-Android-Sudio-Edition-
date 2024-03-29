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
import com.example.helpmelift.databinding.FragmentTrapsExercisesBinding;

public class TrapsExercisesFragment extends Fragment {

    private FragmentTrapsExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Dumbbell_Shrugs);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Face_Pulls);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Chest_Supported_Rows);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Upright_Row);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Dumbbell Shrugs"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Face Pulls"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Chest Supported Rows"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Upright_Row"));

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