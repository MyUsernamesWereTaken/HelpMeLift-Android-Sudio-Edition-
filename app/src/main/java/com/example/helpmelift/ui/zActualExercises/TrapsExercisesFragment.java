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
import com.example.helpmelift.databinding.FragmentTrapsExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.TrapsWorkouts.Chest_Supported_Rows;
import com.example.helpmelift.ui.TrapsWorkouts.DumbbellShrugs;
import com.example.helpmelift.ui.TrapsWorkouts.FacePulls;
import com.example.helpmelift.ui.TrapsWorkouts.UprightRow;

public class TrapsExercisesFragment extends Fragment {

    private FragmentTrapsExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentTrapsExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button DumbbellShrugs = root.findViewById(R.id.Dumbbell_Shrugs);
        Button FacePulls = root.findViewById(R.id.Face_Pulls);
        Button UprightRow = root.findViewById(R.id.Upright_Row);
        Button ChestSupportedRows = root.findViewById(R.id.Chest_Supported_Rows);

        DumbbellShrugs.setOnClickListener(v1 -> glimpseDumbbellShrugs(requireContext()));
        FacePulls.setOnClickListener(v2 -> glimpseFacePulls(requireContext()));
        UprightRow.setOnClickListener(v3 -> glimpseUprightRow(requireContext()));
        ChestSupportedRows.setOnClickListener(v4 -> glimpseChestSupportedRows(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseDumbbellShrugs(Context context) {
        Intent intent = new Intent(context, DumbbellShrugs.class);
        startActivity(intent);
    }

    private void glimpseFacePulls(Context context) {
        Intent intent = new Intent(context, FacePulls.class);
        startActivity(intent);
    }

    private void glimpseUprightRow(Context context) {
        Intent intent = new Intent(context, UprightRow.class);
        startActivity(intent);
    }

    private void glimpseChestSupportedRows(Context context) {
        Intent intent = new Intent(context, Chest_Supported_Rows.class);
        startActivity(intent);
    }
}