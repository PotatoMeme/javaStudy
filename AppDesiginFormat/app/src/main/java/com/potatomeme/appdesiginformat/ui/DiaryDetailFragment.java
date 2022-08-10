package com.potatomeme.appdesiginformat.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.potatomeme.appdesiginformat.DetailActivity;
import com.potatomeme.appdesiginformat.R;

public class DiaryDetailFragment extends Fragment {

    ViewGroup rootView;
    DetailActivity detailActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
         detailActivity = (DetailActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_diary_detail,container,false);
        TextView date_text = rootView.findViewById(R.id.diary_date_text);
        TextView status_text = rootView.findViewById(R.id.diary_status);
        TextView weather_text = rootView.findViewById(R.id.diary_weather);
        TextView title_text = rootView.findViewById(R.id.diary_title_text);
        TextView content_text = rootView.findViewById(R.id.diary_content_text);
        return rootView;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        detailActivity = null;
    }
}
