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
import com.example.helpmelift.databinding.FragmentBicepExercisesBinding;
import com.example.helpmelift.databinding.FragmentCalvesExercisesBinding;
import com.example.helpmelift.ui.BicepWorkout.Incline_Bicep_Curl;
import com.example.helpmelift.ui.BicepWorkout.Standing_Bicep_Curl_bb;
import com.example.helpmelift.ui.BicepWorkout.Standing_Bicep_Curl_db;
import com.example.helpmelift.ui.BicepWorkout.Waiter_Curl;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;

public class CalvesExercisesFragment extends Fragment {

    private FragmentCalvesExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentCalvesExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button StandingCalfRaises = root.findViewById(R.id.StandingCalfRaises);
        Button SingleStandingCalfRaises = root.findViewById(R.id.SingleStandingCalfRaises);
        Button DonkeyRaises = root.findViewById(R.id.Donkey_Raises);
        Button BoxJump = root.findViewById(R.id.Box_Jump);

        StandingCalfRaises.setOnClickListener(v1 -> glimpseStandingCalfRaises(requireContext()));
        SingleStandingCalfRaises.setOnClickListener(v2 -> glimpseSingleStandingCalfRaises(requireContext()));
        DonkeyRaises.setOnClickListener(v3 -> glimpseDonkeyRaises(requireContext()));
        BoxJump.setOnClickListener(v4 -> glimpseBoxJump(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseStandingCalfRaises(Context context) {
        Intent intent = new Intent(context, Standing_Calf_Raises.class);
        startActivity(intent);
    }

    private void glimpseSingleStandingCalfRaises(Context context) {
        Intent intent = new Intent(context, Single_Leg_Standing_Calf_Raise.class);
        startActivity(intent);
    }

    private void glimpseDonkeyRaises(Context context) {
        Intent intent = new Intent(context, Donkey_Raises.class);
        startActivity(intent);
    }

    private void glimpseBoxJump(Context context) {
        Intent intent = new Intent(context, Box_Jump.class);
        startActivity(intent);
    }

}