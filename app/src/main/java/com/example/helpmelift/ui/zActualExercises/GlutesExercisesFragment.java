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
import com.example.helpmelift.databinding.FragmentGlutesExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;


public class GlutesExercisesFragment extends Fragment {

    private FragmentGlutesExercisesBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentGlutesExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button GluteBridge = root.findViewById(R.id.Glute_Bridge);
        Button HipAbduction = root.findViewById(R.id.Hip_Abduction_Machine);
        Button HipAdduction = root.findViewById(R.id.Hip_Adduction_Machine);
        Button HipThrust = root.findViewById(R.id.Hip_Thrust);

        GluteBridge.setOnClickListener(v1 -> glimpseGluteBridge(requireContext()));
        HipAbduction.setOnClickListener(v2 -> glimpseHipAbduction(requireContext()));
        HipAdduction.setOnClickListener(v3 -> glimpseHipAdduction(requireContext()));
        HipThrust.setOnClickListener(v4 -> glimpseHipThrust(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseGluteBridge(Context context) {
        Intent intent = new Intent(context, Standing_Calf_Raises.class);
        intent.putExtra("Exercise", "Glute Bridge");
        startActivity(intent);
    }

    private void glimpseHipAbduction(Context context) {
        Intent intent = new Intent(context, Single_Leg_Standing_Calf_Raise.class);
        intent.putExtra("Exercise", "Hip Abduction");
        startActivity(intent);
    }

    private void glimpseHipAdduction(Context context) {
        Intent intent = new Intent(context, Donkey_Raises.class);
        intent.putExtra("Exercise", "Hip Adduction");
        startActivity(intent);
    }

    private void glimpseHipThrust(Context context) {
        Intent intent = new Intent(context, Box_Jump.class);
        intent.putExtra("Exercise", "Hip Thrust");
        startActivity(intent);
    }
}