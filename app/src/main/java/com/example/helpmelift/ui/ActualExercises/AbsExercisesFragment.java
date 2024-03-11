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
import com.example.helpmelift.databinding.FragmentAbsExercisesBinding;
import com.example.helpmelift.viewWorkout;


public class AbsExercisesFragment extends Fragment {

    private FragmentAbsExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Crunches);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Situp);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Lsit);
        Button bentoverflys = binding.getRoot().findViewById(R.id.RussianTwists);

        overheadpressButton.setOnClickListener(v1 -> glimpseCrunches(requireContext(), "Crunches"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseSitup(requireContext(), "Sit-up"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseLsit(requireContext(), "L-sit"));
        bentoverflys.setOnClickListener(v4 -> glimpseRussiantwist(requireContext(), "Russian Twist"));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseCrunches(Context context, String workout) {
        Intent intent = new Intent(context, viewWorkout.class);
        intent.putExtra("Exercise", workout);
        startActivity(intent);
    }

    private void glimpseSitup(Context context, String workout) {
        Intent intent = new Intent(context, viewWorkout.class);
        intent.putExtra("Exercise", workout);
        startActivity(intent);
    }

    private void glimpseLsit(Context context, String workout) {
        Intent intent = new Intent(context, viewWorkout.class);
        intent.putExtra("Exercise", workout);
        startActivity(intent);
    }

    private void glimpseRussiantwist(Context context, String workout) {
        Intent intent = new Intent(context, viewWorkout.class);
        intent.putExtra("Exercise", workout);
        startActivity(intent);
    }

}