package com.example.helpmelift.ui.MuscleGroups;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.helpmelift.MuscleExercises;
import com.example.helpmelift.R;
import com.example.helpmelift.databinding.FragmentMusclegroupsBinding;


//CONNECTED TO fragment_musclegroups.xml
public class MuscleGroupsFragment extends Fragment {

    private FragmentMusclegroupsBinding binding;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMusclegroupsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        // Initialize buttons
        Button delt_butt = root.findViewById(R.id.Delts);
        Button bicep_butt = root.findViewById(R.id.Biceps);
        Button tricep_butt = root.findViewById(R.id.Triceps);
        Button abs_butt = root.findViewById(R.id.Abs);
        Button traps_butt = root.findViewById(R.id.Trapezius);
        Button lats_butt = root.findViewById(R.id.Lats);
        Button lowerback_butt = root.findViewById(R.id.Lower_back);
        Button glute_butt = root.findViewById(R.id.Glutes);
        Button quads_butt = root.findViewById(R.id.Quadriceps);
        Button hamstring_butt = root.findViewById(R.id.Hamstrings);
        Button calves_butt = root.findViewById(R.id.Calves);
        Button forearms_butt = root.findViewById(R.id.Forearms);

        delt_butt.setOnClickListener(v1 -> viewExercises(requireContext(), "Deltoids/Shoulders"));
        bicep_butt.setOnClickListener(v2 -> viewExercises(requireContext(), "Biceps"));
        tricep_butt.setOnClickListener(v3 -> viewExercises(requireContext(), "Triceps"));
        abs_butt.setOnClickListener(v4 -> viewExercises(requireContext(), "Abs"));
        traps_butt.setOnClickListener(v5 -> viewExercises(requireContext(), "Trapezius"));
        lats_butt.setOnClickListener(v6 -> viewExercises(requireContext(), "Latissimus Dorsi"));
        lowerback_butt.setOnClickListener(v7 -> viewExercises(requireContext(), "Lower Back"));
        glute_butt.setOnClickListener(v8 -> viewExercises(requireContext(), "Glutes"));
        quads_butt.setOnClickListener(v9 -> viewExercises(requireContext(), "Quadriceps"));
        hamstring_butt.setOnClickListener(v10 -> viewExercises(requireContext(), "Hamstrings"));
        calves_butt.setOnClickListener(v11 -> viewExercises(requireContext(), "Calves"));
        forearms_butt.setOnClickListener(v12 -> viewExercises(requireContext(), "Forearms"));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void viewExercises(Context context, String muscle) {
        Intent intent = new Intent(context, MuscleExercises.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
}
