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

import com.example.helpmelift.databinding.FragmentBicepExercisesBinding;
import com.example.helpmelift.ui.BicepWorkout.Incline_Bicep_Curl;
import com.example.helpmelift.ui.BicepWorkout.Standing_Bicep_Curl_db;
import com.example.helpmelift.ui.BicepWorkout.Standing_Bicep_Curl_bb;
import com.example.helpmelift.ui.BicepWorkout.Waiter_Curl;

public class BicepExercisesFragment extends Fragment {

    private FragmentBicepExercisesBinding binding;
    private boolean DeltsChosen = false;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        Button db_standing_bicep_curl_Button = binding.getRoot().findViewById(R.id.Standing_Bicep_CurlDumbbell);
        Button bb_standing_bicep_curl_Button = binding.getRoot().findViewById(R.id.Standing_Bicep_CurlBarbell);
        Button inclineCurlButton = binding.getRoot().findViewById(R.id.Incline_Bicep_Curl);
        Button waiterCurlButton = binding.getRoot().findViewById(R.id.Waiter_Curls);

        db_standing_bicep_curl_Button.setOnClickListener(v1 -> glimpsestandingbicepcurl(requireContext()));
        bb_standing_bicep_curl_Button.setOnClickListener(v2 -> glimpsesittingbicepcurl(requireContext()));
        inclineCurlButton.setOnClickListener(v3 -> glimpseinclinebicepcurl(requireContext()));
        waiterCurlButton.setOnClickListener(v4 -> glimpsewaitercurl(requireContext()));

        return binding.getRoot();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    private void glimpsestandingbicepcurl(Context context) {
        Intent intent = new Intent(context, Standing_Bicep_Curl_bb.class);
        intent.putExtra("Exercise", "Standing Bicep Curls");
        startActivity(intent);
    }

    private void glimpsesittingbicepcurl(Context context) {
        Intent intent = new Intent(context, Standing_Bicep_Curl_db.class);
        intent.putExtra("Exercise", "Sitting Bicep Curls");
        startActivity(intent);
    }

    private void glimpseinclinebicepcurl(Context context) {
        Intent intent = new Intent(context, Incline_Bicep_Curl.class);
        intent.putExtra("Exercise", "Incline Bicep Curls");
        startActivity(intent);
    }

    private void glimpsewaitercurl(Context context) {
        Intent intent = new Intent(context, Waiter_Curl.class);
        intent.putExtra("Exercise", "Waiter Curls");
        startActivity(intent);
    }

}