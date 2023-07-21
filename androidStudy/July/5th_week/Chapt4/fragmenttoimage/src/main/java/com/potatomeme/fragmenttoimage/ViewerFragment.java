package com.potatomeme.fragmenttoimage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

public class ViewerFragment extends Fragment {

    LinearLayout linearLayout;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_viewer,container,false);
        linearLayout = rootView.findViewById(R.id.fragment_viewer);
        return rootView;
    }

    public void setBackgroundColor(int i) {
        if(i == 0){
            linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(),R.color.purple_500));
        } else if(i == 1){
            linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.purple_200));
        } else if(i == 2){
            linearLayout.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.purple_700));
        }
    }
}
