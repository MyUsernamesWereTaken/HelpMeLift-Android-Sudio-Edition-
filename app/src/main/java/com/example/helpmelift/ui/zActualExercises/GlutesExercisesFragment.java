package com.example.helpmelift.ui.zActualExercises;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.helpmelift.R;
import com.example.helpmelift.databinding.FragmentGlutesExercisesBinding;


public class GlutesExercisesFragment extends Fragment {

    private FragmentGlutesExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {


        Button overheadpressButton = binding.getRoot().findViewById(R.id.Hip_Thrust);
        Button dbshoulderpressButton = binding.getRoot().findViewById(R.id.Glute_Bridge);
        Button lateralraisesButton = binding.getRoot().findViewById(R.id.Hip_Abduction_Machine);
        Button bentoverflys = binding.getRoot().findViewById(R.id.Hip_Adduction_Machine);

        overheadpressButton.setOnClickListener(v1 -> glimpseworkout(requireContext(), "Hip Thrust"));
        dbshoulderpressButton.setOnClickListener(v2 -> glimpseworkout(requireContext(), "Glute Bridge"));
        lateralraisesButton.setOnClickListener(v3 -> glimpseworkout(requireContext(), "Hip Abduction (Machine)"));
        bentoverflys.setOnClickListener(v4 -> glimpseworkout(requireContext(), "Hip Adduction (Machine)"));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseworkout(Context context, String workout) {
//        Intent intent = new Intent(context, .class);
//        intent.putExtra("Exercise", workout);
//        startActivity(intent);
    }

}