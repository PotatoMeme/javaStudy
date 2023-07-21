package com.potatomeme.end;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment1 extends Fragment {
    FragFunc callback;
    TextView textView;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
       if (context instanceof FragFunc){
           callback = (FragFunc) context;
       }
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment1,container,false);
        rootView.findViewById(R.id.frag_button).setOnClickListener(view -> {
            if(callback != null){
                callback.saveData("show","프래그먼트에서 전달함");
            }
        });
        textView = rootView.findViewById(R.id.textview);
        return rootView;
    }

    public void sendData(String data){
        textView.setText(data);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (callback != null){
            callback = null;
        }
    }
}
