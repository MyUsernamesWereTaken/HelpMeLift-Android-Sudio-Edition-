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
import com.example.helpmelift.databinding.FragmentBicepExercisesBinding;

public class BicepExercisesFragment extends Fragment {

    private FragmentBicepExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Standing_Bicep_CurlDumbbell);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Standing_Bicep_CurlBarbell);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Incline_Bicep_Curl);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Waiter_Curls);

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
//        Intent intent = new Intent(context, .class);
//        intent.putExtra("Exercise", workout);
//        startActivity(intent);
    }

}