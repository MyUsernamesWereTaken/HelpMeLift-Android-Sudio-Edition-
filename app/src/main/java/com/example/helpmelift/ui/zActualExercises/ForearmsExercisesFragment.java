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
import com.example.helpmelift.databinding.FragmentForearmsExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.ForearmsWorkout.FarmerCarries;
import com.example.helpmelift.ui.ForearmsWorkout.ForearmCurls_cables;
import com.example.helpmelift.ui.ForearmsWorkout.ForearmCurls_db;
import com.example.helpmelift.ui.ForearmsWorkout.HammerCurls;


public class ForearmsExercisesFragment extends Fragment {

    private FragmentForearmsExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentForearmsExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button FarmerCarries = root.findViewById(R.id.Farmer_Carries);
        Button ForearmCableCurls = root.findViewById(R.id.Forearm_Curls_Cable);
        Button ForearmDBCurls = root.findViewById(R.id.Forearm_Curls_Db);
        Button HammerCurls = root.findViewById(R.id.Hammer_Curls);

        FarmerCarries.setOnClickListener(v1 -> glimpseFarmerCarries(requireContext()));
        ForearmCableCurls.setOnClickListener(v2 -> glimpseForearmCableCurls(requireContext()));
        ForearmDBCurls.setOnClickListener(v3 -> glimpseForearmDBCurls(requireContext()));
        HammerCurls.setOnClickListener(v4 -> glimpseHammerCurls(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseFarmerCarries(Context context) {
        Intent intent = new Intent(context, FarmerCarries.class);
        intent.putExtra("Exercise", "Farmer Carries");
        startActivity(intent);
    }

    private void glimpseForearmCableCurls(Context context) {
        Intent intent = new Intent(context, ForearmCurls_cables.class);
        intent.putExtra("Exercise", "Forearm Cable Curls");
        startActivity(intent);
    }

    private void glimpseForearmDBCurls(Context context) {
        Intent intent = new Intent(context, ForearmCurls_db.class);
        intent.putExtra("Exercise", "Forearm Dumbbell Curls");
        startActivity(intent);
    }

    private void glimpseHammerCurls(Context context) {
        Intent intent = new Intent(context, HammerCurls.class);
        intent.putExtra("Exercise", "Hammer Curls");
        startActivity(intent);
    }

}