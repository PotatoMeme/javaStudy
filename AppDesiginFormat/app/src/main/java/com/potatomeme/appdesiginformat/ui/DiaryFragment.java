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

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.potatomeme.appdesiginformat.AddActivity;
import com.potatomeme.appdesiginformat.DetailActivity;
import com.potatomeme.appdesiginformat.ListActivity;
import com.potatomeme.appdesiginformat.MainActivity;
import com.potatomeme.appdesiginformat.R;
import com.potatomeme.appdesiginformat.adapter.DiaryListAdapter;
import com.potatomeme.appdesiginformat.adapter.TodoListAdapter;
import com.potatomeme.appdesiginformat.entity.Diary;
import com.potatomeme.appdesiginformat.entity.Todo;
import com.potatomeme.appdesiginformat.helper.AppHelper;

import java.util.ArrayList;

public class DiaryFragment extends Fragment {

    ViewGroup rootView;

    CalendarView calendarView;
    Button button_plus,button_seeall;

    ListView listView;
    ArrayList<Diary> listDiary;
    DiaryListAdapter adapter;

    MainActivity mainActivity;
    String date;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
         mainActivity = (MainActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_diary,container,false);

        button_plus = rootView.findViewById(R.id.calendar_plus);
        button_plus.setOnClickListener(view -> {
            Intent intent = new Intent(container.getContext(), AddActivity.class);
            intent.putExtra("db_tag", AppHelper.DIARY_TAG);
            intent.putExtra("date",date);
            startActivity(intent);
        });

        button_seeall = rootView.findViewById(R.id.calendar_seeall);
        button_seeall.setOnClickListener(view -> {
            Intent intent = new Intent(container.getContext(), ListActivity.class);
            intent.putExtra("db_tag", AppHelper.DIARY_TAG);
            startActivity(intent);
        });

        listViewSetting(container);
        calendarSetting();
        return rootView;
    }

    private void listViewSetting(ViewGroup container) {
        listView = rootView.findViewById(R.id.calendar_recentlist);
        listDiary = mainActivity.getListDiary();
        adapter = new DiaryListAdapter(container.getContext(),listDiary);

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
                intent.putExtra("db_tag", AppHelper.DIARY_TAG);
                intent.putExtra("seq",listDiary.get(i).getSeq());
                startActivity(intent);
            }
        });
    }

    private void calendarSetting() {
        calendarView = rootView.findViewById(R.id.calendarview);
        date = String.valueOf(calendarView.getDate());
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                date = i+""+(i1>9?i1:"0"+i1)+""+(i2>9?i2:"0"+i2);
                listDiary = mainActivity.getListDiary();
                adapter.changeItems(listDiary);
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
