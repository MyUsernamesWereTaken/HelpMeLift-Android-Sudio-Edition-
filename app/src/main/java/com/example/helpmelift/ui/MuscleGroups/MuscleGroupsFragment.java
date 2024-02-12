package com.example.helpmelift.ui.MuscleGroups;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.example.helpmelift.R;
import com.example.helpmelift.databinding.FragmentMusclegroupsBinding;
import com.example.helpmelift.ui.MuscleGroups.ui.MuscleExercises.MuscleExercisesFragment;


//CONNECTED TO fragment_musclegroups.xml
public class MuscleGroupsFragment extends Fragment {

    private FragmentMusclegroupsBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = FragmentMusclegroupsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //Creation of buttons and matching them to the xml buttons
        View v = inflater.inflate(R.layout.fragment_musclegroups, container, false);
        Button delt_butt = (Button)v.findViewById(R.id.Delts);
        Button bicep_butt = (Button)v.findViewById(R.id.Biceps);
        Button tricep_butt = (Button)v.findViewById(R.id.Triceps);
        Button abs_butt = (Button)v.findViewById(R.id.Abs);
        Button traps_butt = (Button)v.findViewById(R.id.Trapezius);
        Button lats_butt = (Button)v.findViewById(R.id.Lats);
        Button lowerback_butt = (Button)v.findViewById(R.id.Lower_back);
        Button glute_butt = (Button)v.findViewById(R.id.Glutes);
        Button quads_butt = (Button)v.findViewById(R.id.Quadriceps);
        Button hamstring_butt = (Button)v.findViewById(R.id.Hamstrings);
        Button calves_butt = (Button)v.findViewById(R.id.Calves);
        Button forearms_butt = (Button)v.findViewById(R.id.Forearms);

        delt_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        bicep_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        tricep_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        abs_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        traps_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        lats_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        lowerback_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        glute_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        quads_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        hamstring_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        calves_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });
        forearms_butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewExercises();
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void viewExercises() {
        // Create a new instance of the MuscleExercisesFragment
        MuscleExercisesFragment muscleExercisesFragment = new MuscleExercisesFragment();

        // Get the FragmentManager
        FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

        // Begin a FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Replace the fragment_container with the new fragment
        fragmentTransaction.replace(R.id.rootlayer, muscleExercisesFragment);

        // Add the transaction to the back stack
        fragmentTransaction.addToBackStack(null);

        // Commit the transaction
        fragmentTransaction.commit();
    }

}