package com.potatomeme.appdesiginformat.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.potatomeme.appdesiginformat.AddActivity;
import com.potatomeme.appdesiginformat.DetailActivity;
import com.potatomeme.appdesiginformat.MainActivity;
import com.potatomeme.appdesiginformat.R;
import com.potatomeme.appdesiginformat.adapter.RecentListAdapter;
import com.potatomeme.appdesiginformat.entity.Todo;

import java.util.ArrayList;

public class CalendarFragment extends Fragment {

    ViewGroup rootView;

    CalendarView calendarView;
    Button button_plus,button_seeall;

    ListView listView;
    ArrayList<Todo> listTodo;
    RecentListAdapter adapter;

    MainActivity mainActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
         mainActivity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_calendar,container,false);
        button_plus = rootView.findViewById(R.id.calendar_plus);
        button_plus.setOnClickListener(view -> {
            Intent intent = new Intent(container.getContext(), AddActivity.class);
            startActivity(intent);
        });
        button_seeall = rootView.findViewById(R.id.calendar_seeall);

        listViewSetting(container);
        calendarSetting();

        return rootView;
    }

    private void listViewSetting(ViewGroup container) {
        listView = rootView.findViewById(R.id.calendar_recentlist);
        listTodo = mainActivity.getListTodo();
        adapter = new RecentListAdapter(listTodo);

        // height setting
        int totalHeight = 0;
        for (int i = 0; i < adapter.getCount(); i++){
            View listItem = adapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(params);

        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(container.getContext(), DetailActivity.class);
                startActivity(intent);
            }
        });
    }

    private void calendarSetting() {
        calendarView = rootView.findViewById(R.id.calendarview);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                listTodo = mainActivity.getListTodo();
                adapter.changeItems(listTodo);
                listView.setAdapter(adapter);
            }
        });
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }
}
