package com.example.josycom.okrikathreads.ui.bags;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.josycom.okrikathreads.R;

public class BagsFragment extends Fragment {

    private BagsViewModel bagsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bagsViewModel =
                ViewModelProviders.of(this).get(BagsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_bags, container, false);
        final TextView textView = root.findViewById(R.id.text_bags);
        bagsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}