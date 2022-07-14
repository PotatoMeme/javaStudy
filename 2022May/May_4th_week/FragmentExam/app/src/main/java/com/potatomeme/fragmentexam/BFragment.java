package com.potatomeme.fragmentexam;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class BFragment extends Fragment {

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e(this.getClass().getName(),"onAttach 실행");
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(this.getClass().getName(),"onCreate 실행");
    }

    @Nullable//null을 허용할 경우 반대 @NonNull(null을 허용하지 않을 경우)
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.e(this.getClass().getName(),"onCreateView 실행");
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

     /*@Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
        Log.e(this.getClass().getName(),"onActivityCreated 실행");
    }*/

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Log.e(this.getClass().getName(),"onViewCreated 실행");
    }

    @Override
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        Log.e(this.getClass().getName(),"onViewStateRestored 실행");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(this.getClass().getName(),"onStart 실행");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(this.getClass().getName(),"onResume 실행");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(this.getClass().getName(),"onPause 실행");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(this.getClass().getName(),"onStop 실행");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.e(this.getClass().getName(),"onSaveInstanceState 실행");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(this.getClass().getName(),"onDestroyView 실행");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(this.getClass().getName(),"onDestroy 실행");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(this.getClass().getName(),"onDetach 실행");
    }
}