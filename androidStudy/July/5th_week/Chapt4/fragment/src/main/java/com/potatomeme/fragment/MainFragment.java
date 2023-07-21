package com.potatomeme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    MainActivity activity;

    @Override
    public void onAttach(@NonNull Context context) {
        //액티비티에서 프래그먼트가 호출될 때 최초 한번 호출되는 함수
        super.onAttach(context);
        Log.e(this.getClass().getName(),"onAttach 실행");
        activity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_main, container, false);
        Button button = rootView.findViewById(R.id.button3);
        button.setOnClickListener(view -> {
            activity.onFragmentChange(false);
        });
        return rootView;
    }

    @Override
    public void onDetach() {
        // 프래그먼트가 액티비티와 연결이 종료될 때 호출되는 함수
        super.onDetach();
        Log.e(this.getClass().getName(),"onDetach 실행");
    }



}
