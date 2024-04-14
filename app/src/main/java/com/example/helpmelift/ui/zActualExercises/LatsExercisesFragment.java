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
import com.example.helpmelift.databinding.FragmentLatsExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.LatsWorkout.CableRows;
import com.example.helpmelift.ui.LatsWorkout.Chest_Supported_Rows;
import com.example.helpmelift.ui.LatsWorkout.LatPulldown;
import com.example.helpmelift.ui.LatsWorkout.PendlayRows;


public class LatsExercisesFragment extends Fragment {

    private FragmentLatsExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentLatsExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button CableRows = root.findViewById(R.id.Cable_Rows);
        Button ChestSupportedRows = root.findViewById(R.id.Chest_Supported_Rows);
        Button LatPulldown = root.findViewById(R.id.Lat_Pulldown);
        Button PendlayRows = root.findViewById(R.id.Pendlay_Row);

        CableRows.setOnClickListener(v1 -> glimpseCableRows(requireContext()));
        ChestSupportedRows.setOnClickListener(v2 -> glimpseChestSupportedRows(requireContext()));
        LatPulldown.setOnClickListener(v3 -> glimpseLatPulldown(requireContext()));
        PendlayRows.setOnClickListener(v4 -> glimpsePendlayRows(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseCableRows(Context context) {
        Intent intent = new Intent(context, CableRows.class);
        startActivity(intent);
    }

    private void glimpseChestSupportedRows(Context context) {
        Intent intent = new Intent(context, Chest_Supported_Rows.class);
        startActivity(intent);
    }

    private void glimpseLatPulldown(Context context) {
        Intent intent = new Intent(context, LatPulldown.class);
        startActivity(intent);
    }

    private void glimpsePendlayRows(Context context) {
        Intent intent = new Intent(context, PendlayRows.class);
        startActivity(intent);
    }
}