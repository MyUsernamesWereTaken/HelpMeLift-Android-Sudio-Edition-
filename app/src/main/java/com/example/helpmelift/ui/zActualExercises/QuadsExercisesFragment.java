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
import com.example.helpmelift.databinding.FragmentQuadsExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.QuadsWorkouts.BackSquat;
import com.example.helpmelift.ui.QuadsWorkouts.HackSquats;
import com.example.helpmelift.ui.QuadsWorkouts.LegExtensions;
import com.example.helpmelift.ui.QuadsWorkouts.LegPress;


public class QuadsExercisesFragment extends Fragment {

    private FragmentQuadsExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentQuadsExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button BackSquat = root.findViewById(R.id.Back_Squats);
        Button HackSquat = root.findViewById(R.id.Hack_Squats);
        Button LegExtensions = root.findViewById(R.id.Leg_Extensions);
        Button LegPress = root.findViewById(R.id.Leg_Press);

        BackSquat.setOnClickListener(v1 -> glimpseBackSquat(requireContext()));
        HackSquat.setOnClickListener(v2 -> glimpseHackSquat(requireContext()));
        LegExtensions.setOnClickListener(v3 -> glimpseLegExtensions(requireContext()));
        LegPress.setOnClickListener(v4 -> glimpseLegPress(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseBackSquat(Context context) {
        Intent intent = new Intent(context, BackSquat.class);
        startActivity(intent);
    }

    private void glimpseHackSquat(Context context) {
        Intent intent = new Intent(context, HackSquats.class);
        startActivity(intent);
    }

    private void glimpseLegExtensions(Context context) {
        Intent intent = new Intent(context, LegExtensions.class);
        startActivity(intent);
    }

    private void glimpseLegPress(Context context) {
        Intent intent = new Intent(context, LegPress.class);
        startActivity(intent);
    }
}