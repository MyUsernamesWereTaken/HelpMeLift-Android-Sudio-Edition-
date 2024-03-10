package com.example.helpmelift.ui.MuscleGroups;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;


import com.example.helpmelift.DeltMuscle;
import com.example.helpmelift.BicepMuscle;
import com.example.helpmelift.TricepMuscle;
import com.example.helpmelift.AbsMuscle;
import com.example.helpmelift.TrapsMuscle;
import com.example.helpmelift.LatsMuscle;
import com.example.helpmelift.LowerBackMuscle;
import com.example.helpmelift.GlutesMuscle;
import com.example.helpmelift.QuadsMuscle;
import com.example.helpmelift.HamstringMuscle;
import com.example.helpmelift.CalvesMuscle;
import com.example.helpmelift.ForearmsMuscle;

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

        delt_butt.setOnClickListener(v1 -> viewDelts(requireContext(), "Deltoids/Shoulders"));
        bicep_butt.setOnClickListener(v2 -> viewBiceps(requireContext(), "Biceps"));
        tricep_butt.setOnClickListener(v3 -> viewTriceps(requireContext(), "Triceps"));
        abs_butt.setOnClickListener(v4 -> viewAbs(requireContext(), "Abs"));
        traps_butt.setOnClickListener(v5 -> viewTraps(requireContext(), "Trapezius"));
        lats_butt.setOnClickListener(v6 -> viewLats(requireContext(), "Latissimus Dorsi"));
        lowerback_butt.setOnClickListener(v7 -> viewLowerBack(requireContext(), "Lower Back"));
        glute_butt.setOnClickListener(v8 -> viewGlutes(requireContext(), "Glutes"));
        quads_butt.setOnClickListener(v9 -> viewQuads(requireContext(), "Quadriceps"));
        hamstring_butt.setOnClickListener(v10 -> viewHamstring(requireContext(), "Hamstrings"));
        calves_butt.setOnClickListener(v11 -> viewCalves(requireContext(), "Calves"));
        forearms_butt.setOnClickListener(v12 -> viewForearms(requireContext(), "Forearms"));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void viewDelts(Context context, String muscle) {
        Intent intent = new Intent(context, DeltMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewBiceps(Context context, String muscle) {
        Intent intent = new Intent(context, BicepMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewTriceps(Context context, String muscle) {
        Intent intent = new Intent(context, TricepMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewAbs(Context context, String muscle) {
        Intent intent = new Intent(context, AbsMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewTraps(Context context, String muscle) {
        Intent intent = new Intent(context, TrapsMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewLats(Context context, String muscle) {
        Intent intent = new Intent(context, LatsMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewLowerBack(Context context, String muscle) {
        Intent intent = new Intent(context, LowerBackMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewGlutes(Context context, String muscle) {
        Intent intent = new Intent(context, GlutesMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewQuads(Context context, String muscle) {
        Intent intent = new Intent(context, QuadsMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewHamstring(Context context, String muscle) {
        Intent intent = new Intent(context, HamstringMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewCalves(Context context, String muscle) {
        Intent intent = new Intent(context, CalvesMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }
    private void viewForearms(Context context, String muscle) {
        Intent intent = new Intent(context, ForearmsMuscle.class);
        intent.putExtra("Muscle", muscle);
        startActivity(intent);
    }


}
