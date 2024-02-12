package com.example.helpmelift.ui.MuscleGroups.ui.MuscleExercises;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.helpmelift.R;
import com.example.helpmelift.databinding.FragmentMuscleExercisesBinding;

public class MuscleExercisesFragment extends Fragment {

    private FragmentMuscleExercisesBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_muscle_exercises, container, false);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}