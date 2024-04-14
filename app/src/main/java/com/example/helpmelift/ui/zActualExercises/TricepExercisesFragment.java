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
import com.example.helpmelift.databinding.FragmentTricepExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.TricepsWorkouts.OverheadTricepExtension;
import com.example.helpmelift.ui.TricepsWorkouts.SkullCrushers;
import com.example.helpmelift.ui.TricepsWorkouts.TricepKickback;
import com.example.helpmelift.ui.TricepsWorkouts.TricepPushdown;


public class TricepExercisesFragment extends Fragment {

    private FragmentTricepExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentTricepExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button OTE = root.findViewById(R.id.Overhead_Tricep_Extensions);
        Button SkullCrushers = root.findViewById(R.id.SkullCrushers);
        Button TricepKickback = root.findViewById(R.id.Tricep_Kickback);
        Button TricepPushdown = root.findViewById(R.id.Tricep_Pushdown);

        OTE.setOnClickListener(v1 -> glimpseOTE(requireContext()));
        SkullCrushers.setOnClickListener(v2 -> glimpseSkullCrushers(requireContext()));
        TricepKickback.setOnClickListener(v3 -> glimpseTricepKickback(requireContext()));
        TricepPushdown.setOnClickListener(v4 -> glimpseTricepPushdown(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseOTE(Context context) {
        Intent intent = new Intent(context, OverheadTricepExtension.class);
        startActivity(intent);
    }

    private void glimpseSkullCrushers(Context context) {
        Intent intent = new Intent(context, SkullCrushers.class);
        startActivity(intent);
    }

    private void glimpseTricepKickback(Context context) {
        Intent intent = new Intent(context, TricepKickback.class);
        startActivity(intent);
    }

    private void glimpseTricepPushdown(Context context) {
        Intent intent = new Intent(context, TricepPushdown.class);
        startActivity(intent);
    }
}