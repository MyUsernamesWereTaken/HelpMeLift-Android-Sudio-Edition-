package com.example.helpmelift.ui.ActualExercises;

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
import com.example.helpmelift.databinding.FragmentAbsExercisesBinding;
import com.example.helpmelift.Crunches;


public class AbsExercisesFragment extends Fragment {

    private FragmentAbsExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState, String muscle) {

        binding = FragmentAbsExercisesBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button crunchesButton = root.findViewById(R.id.Crunches);
        Button situpButton = root.findViewById(R.id.Situp);
        Button lsitButton = root.findViewById(R.id.Lsit);
        Button russiantwistsButton = root.findViewById(R.id.RussianTwists);

        crunchesButton.setOnClickListener(v1 -> glimpseCrunches(requireContext(), "Crunches"));
        situpButton.setOnClickListener(v2 -> glimpseSitup(requireContext(), "Sit-up"));
        lsitButton.setOnClickListener(v3 -> glimpseLsit(requireContext(), "L-sit"));
        russiantwistsButton.setOnClickListener(v4 -> glimpseRussiantwist(requireContext(), "Russian Twist"));

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpseCrunches(Context context, String workout) {
        Intent intent = new Intent(context, Crunches.class);
        intent.putExtra("Exercise", workout);
        startActivity(intent);
    }
//
    private void glimpseSitup(Context context, String workout) {
//        Intent intent = new Intent(context, Crunches.class);
//        intent.putExtra("Exercise", workout);
//        startActivity(intent);
    }
//
    private void glimpseLsit(Context context, String workout) {
//        Intent intent = new Intent(context, Crunches.class);
//        intent.putExtra("Exercise", workout);
//        startActivity(intent);
   }
//
    private void glimpseRussiantwist(Context context, String workout) {
//        Intent intent = new Intent(context, Crunches.class);
//        intent.putExtra("Exercise", workout);
//        startActivity(intent);
    }

}