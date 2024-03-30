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
import com.example.helpmelift.databinding.FragmentQuadsExercisesBinding;


public class QuadsExercisesFragment extends Fragment {

    private FragmentQuadsExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Back_Squats);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Leg_Press);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Leg_Extensions);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Hack_Squats);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Back Squats"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Leg Press"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Leg Extensions"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Hack Squats"));

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