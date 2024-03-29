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

public class CalvesExercisesFragment extends Fragment {

    private FragmentCalvesExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.StandingCalfRaises);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.SingleStandingCalfRaises);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Donkey_Raises);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Box_Jump);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Standing Calf Raises"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Single Standing Calf Raises"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Donkey Raises"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Box Jump"));

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