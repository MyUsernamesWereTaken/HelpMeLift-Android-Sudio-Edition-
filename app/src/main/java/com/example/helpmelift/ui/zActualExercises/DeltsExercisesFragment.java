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
import com.example.helpmelift.databinding.FragmentDeltsExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.DeltWorkout.Bent_Over_Rear_Delt_Flys;
import com.example.helpmelift.ui.DeltWorkout.Dumbbell_Shoulder_Press;
import com.example.helpmelift.ui.DeltWorkout.Lateral_Raises;
import com.example.helpmelift.ui.DeltWorkout.Overhead_Press;

public class DeltsExercisesFragment extends Fragment {

    private FragmentDeltsExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentDeltsExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button BentOverRearDeltFlys = root.findViewById(R.id.Bent_Over_Rear_Delt_Flys);
        Button ShoulderPress = root.findViewById(R.id.Dumbbell_Shoulder_Press);
        Button LateralRaises = root.findViewById(R.id.Lateral_Raises);
        Button OverheadPress = root.findViewById(R.id.Overhead_Press);

        BentOverRearDeltFlys.setOnClickListener(v1 -> glimpseBORDF(requireContext()));
        ShoulderPress.setOnClickListener(v2 -> glimpseShoulderPress(requireContext()));
        LateralRaises.setOnClickListener(v3 -> glimpseLateralRaises(requireContext()));
        OverheadPress.setOnClickListener(v4 -> glimpseOverheadPress(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseBORDF(Context context) {
        Intent intent = new Intent(context, Bent_Over_Rear_Delt_Flys.class);
        startActivity(intent);
    }

    private void glimpseShoulderPress(Context context) {
        Intent intent = new Intent(context, Dumbbell_Shoulder_Press.class);
        startActivity(intent);
    }

    private void glimpseLateralRaises(Context context) {
        Intent intent = new Intent(context, Lateral_Raises.class);
        startActivity(intent);
    }

    private void glimpseOverheadPress(Context context) {
        Intent intent = new Intent(context, Overhead_Press.class);
        startActivity(intent);
    }

}