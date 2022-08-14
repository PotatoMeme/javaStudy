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
import com.potatomeme.appdesiginformat.adapter.TodoListAdapter;
import com.potatomeme.appdesiginformat.entity.Todo;

import java.util.ArrayList;

public class TodoListFragment extends Fragment {

    ViewGroup rootView;

    ListView listView;
    ArrayList<Todo> listTodo;
    TodoListAdapter adapter;

    ListActivity listActivity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        listActivity = (ListActivity) getActivity();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        rootView = (ViewGroup) inflater.inflate(R.layout.fragment_todo_list,container,false);


        listViewSetting(container);

        return rootView;
    }

    private void listViewSetting(ViewGroup container) {
        listView = rootView.findViewById(R.id.todo_list);
        listTodo = listActivity.getListTodo();
        adapter = new TodoListAdapter(listTodo);

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


    @Override
    public void onDetach() {
        super.onDetach();
        listActivity = null;
    }
}
