package com.potatomeme.fragmenttoimage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ListFragment extends Fragment {
    MainActivity mainActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_list, container, false);

        Button button1 = rootView.findViewById(R.id.button1);
        Button button2 = rootView.findViewById(R.id.button2);
        Button button3 = rootView.findViewById(R.id.button3);
        button1.setOnClickListener(view -> {
            mainActivity.onImageChange(0);
        });
        button2.setOnClickListener(view -> {
            mainActivity.onImageChange(1);
        });
        button3.setOnClickListener(view -> {
            mainActivity.onImageChange(2);
        });

        return rootView;

    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
}
