package com.potatomeme.appdesiginformat.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.potatomeme.appdesiginformat.R;

public class CalendarFragment extends Fragment {
    CalendarView calendarView;
    Button button_seeall;
    ListView listView;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_calendar,container,false);

        button_seeall = rootView.findViewById(R.id.calendar_seeall);
        listView = rootView.findViewById(R.id.calendar_recentlist);

        calendarView = rootView.findViewById(R.id.calendarview);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                Toast.makeText(container.getContext(),i+" "+(i1+1)+" "+i2,Toast.LENGTH_SHORT).show();
            }
        });
        return rootView;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
