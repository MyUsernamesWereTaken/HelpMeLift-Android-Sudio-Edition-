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
import com.example.helpmelift.databinding.FragmentLowerbackExercisesBinding;
import com.example.helpmelift.ui.CalvesWorkout.Box_Jump;
import com.example.helpmelift.ui.CalvesWorkout.Donkey_Raises;
import com.example.helpmelift.ui.CalvesWorkout.Single_Leg_Standing_Calf_Raise;
import com.example.helpmelift.ui.CalvesWorkout.Standing_Calf_Raises;
import com.example.helpmelift.ui.LowerBackWorkouts.Deadlift;
import com.example.helpmelift.ui.LowerBackWorkouts.GoodMornings;
import com.example.helpmelift.ui.LowerBackWorkouts.KettleBellSwings;
import com.example.helpmelift.ui.LowerBackWorkouts.PrisonerBackExtensions;


public class LowerBackExercisesFragment extends Fragment {

    private FragmentLowerbackExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {
        binding = FragmentLowerbackExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button GoodMornings = root.findViewById(R.id.Good_Mornings);
        Button KettleBellSwings = root.findViewById(R.id.Kettlebell_Swings);
        Button Deadlifts = root.findViewById(R.id.Deadlifts);
        Button PrisonerBackExtension = root.findViewById(R.id.Prisoner_Back_Extensions);

        GoodMornings.setOnClickListener(v1 -> glimpseGoodMornings(requireContext()));
        KettleBellSwings.setOnClickListener(v2 -> glimpseKettleBellSwings(requireContext()));
        Deadlifts.setOnClickListener(v3 -> glimpseDeadlifts(requireContext()));
        PrisonerBackExtension.setOnClickListener(v4 -> glimpsePrisonerBackExtension(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseGoodMornings(Context context) {
        Intent intent = new Intent(context, GoodMornings.class);
        startActivity(intent);
    }

    private void glimpseKettleBellSwings(Context context) {
        Intent intent = new Intent(context, KettleBellSwings.class);
        startActivity(intent);
    }

    private void glimpseDeadlifts(Context context) {
        Intent intent = new Intent(context, Deadlift.class);
        startActivity(intent);
    }

    private void glimpsePrisonerBackExtension(Context context) {
        Intent intent = new Intent(context, PrisonerBackExtensions.class);
        startActivity(intent);
    }
}