package com.potatomeme.callbackexam;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.ListFragment;

import java.util.Arrays;
import java.util.List;

public class ColorListFragment extends ListFragment {

    private OnColorSelectedListener mListner;

    interface OnColorSelectedListener{
        void onColorSelected(int color);
    }

    @Override
    public void onAttach(@NonNull Context context) {// 엑티비티에 프레그먼트가 붙을때 호출
        super.onAttach(context);
        try {
            mListner = (OnColorSelectedListener) context;
        } catch (ClassCastException e){
            throw new ClassCastException(((Activity)context).getLocalClassName()+"는  OnColorSelectedListener를 구현해야 합니다.");
        }
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        List<String> colorLsit = Arrays.asList("Red","Green","Blue");
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity()
                , android.R.layout.simple_list_item_1, colorLsit);
        setListAdapter(adapter);
    }

    @Override
    public void onListItemClick(@NonNull ListView l, @NonNull View v, int position, long id) {
        ArrayAdapter<String> adapter = (ArrayAdapter<String>) l.getAdapter();
        String colorString = adapter.getItem(position);
        int color = Color.RED;

        switch (colorString){
            case "Red":
                color = Color.RED;
                break;
            case "Blue":
                color = Color.BLUE;
                break;
            case "Green":
                color = Color.GREEN;
                break;
        }

        if (mListner != null){
            mListner.onColorSelected(color);
        }
    }
}
