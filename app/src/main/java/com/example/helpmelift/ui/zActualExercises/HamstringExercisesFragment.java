package com.example.helpmelift.ui.zActualExercises;

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
import com.example.helpmelift.databinding.FragmentHamstringExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.HamstringWorkouts.DeadLifts;
import com.example.helpmelift.ui.HamstringWorkouts.LyingLegCurl;
import com.example.helpmelift.ui.HamstringWorkouts.RomanianDeadlift;
import com.example.helpmelift.ui.HamstringWorkouts.SeatedLegCurl;


public class HamstringExercisesFragment extends Fragment {

    private FragmentHamstringExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentHamstringExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button Deadlifts = root.findViewById(R.id.Deadlift);
        Button LyingLegCurl = root.findViewById(R.id.Lying_Leg_Curl);
        Button RDL = root.findViewById(R.id.Romanian_Deadlift_Barbell);
        Button SeatedLegCurl = root.findViewById(R.id.Seated_Leg_Curl);

        Deadlifts.setOnClickListener(v1 -> glimpseDeadlifts(requireContext()));
        LyingLegCurl.setOnClickListener(v2 -> glimpseLyingLegCurl(requireContext()));
        RDL.setOnClickListener(v3 -> glimpseRDL(requireContext()));
        SeatedLegCurl.setOnClickListener(v4 -> glimpseSeatedLegCurl(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseDeadlifts(Context context) {
        Intent intent = new Intent(context, DeadLifts.class);
        startActivity(intent);
    }

    private void glimpseLyingLegCurl(Context context) {
        Intent intent = new Intent(context, LyingLegCurl.class);
        startActivity(intent);
    }

    private void glimpseRDL(Context context) {
        Intent intent = new Intent(context, RomanianDeadlift.class);
        startActivity(intent);
    }

    private void glimpseSeatedLegCurl(Context context) {
        Intent intent = new Intent(context, SeatedLegCurl.class);
        startActivity(intent);
    }
}