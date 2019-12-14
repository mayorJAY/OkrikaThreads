package com.example.josycom.okrikathreads.ui.clothes;

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

public class ClothesFragment extends Fragment {

    private ClothesViewModel clothesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        clothesViewModel =
                ViewModelProviders.of(this).get(ClothesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_clothes, container, false);
        final TextView textView = root.findViewById(R.id.text_clothes);
        clothesViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}