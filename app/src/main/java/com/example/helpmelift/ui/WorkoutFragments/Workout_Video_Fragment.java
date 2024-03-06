package com.example.helpmelift.ui.WorkoutFragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.example.helpmelift.databinding.FragmentWorkoutVideoBinding;
import com.example.helpmelift.R;

public class Workout_Video_Fragment extends Fragment {

    private FragmentWorkoutVideoBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_workout_video, container, false);
    }
}