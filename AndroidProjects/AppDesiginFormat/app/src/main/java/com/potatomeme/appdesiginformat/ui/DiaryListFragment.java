package com.potatomeme.appdesiginformat.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.potatomeme.appdesiginformat.DetailActivity;
import com.potatomeme.appdesiginformat.ListActivity;
import com.potatomeme.appdesiginformat.R;
import com.potatomeme.appdesiginformat.adapter.DiaryListAdapter;
import com.potatomeme.appdesiginformat.adapter.TodoListAdapter;
import com.potatomeme.appdesiginformat.entity.Diary;
import com.potatomeme.appdesiginformat.helper.DbHelper;

import java.util.ArrayList;
import java.util.List;

public class DiaryListFragment extends Fragment {

    ViewGroup rootView;
    Context context;
    ListView listView;
    List<Diary> listDiary;
    DiaryListAdapter adapter;
    ListActivity listActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listActivity = (ListActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_diary_list, container, false);
        context=container.getContext();
        listViewSetting();
        return rootView;
    }

    private void listViewSetting() {

        listView = rootView.findViewById(R.id.diary_list);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("db_tag", DbHelper.DIARY_TAG);
                intent.putExtra("seq",listDiary.get(i).getSeq());
                startActivity(intent);
            }
        });
    }

    private void heightsetting() {
        int totalHeight = 0;
        for (int i = 0; i < adapter.getCount(); i++){
            View listItem = adapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }
        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (adapter.getCount() - 1));
        listView.setLayoutParams(params);
    }
    @Override
    public void onResume() {
        super.onResume();
        listDiary = DbHelper.findAllDiary();
        adapter = new DiaryListAdapter(context,listDiary);
        heightsetting();
        listView.setAdapter(adapter);
    }


    @Override
    public void onDetach() {
        super.onDetach();
        listActivity = null;
        context = null;
    }
}
