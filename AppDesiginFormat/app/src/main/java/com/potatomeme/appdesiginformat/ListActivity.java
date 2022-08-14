package com.potatomeme.appdesiginformat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;
import com.potatomeme.appdesiginformat.entity.Diary;
import com.potatomeme.appdesiginformat.entity.Todo;
import com.potatomeme.appdesiginformat.ui.DiaryDetailFragment;
import com.potatomeme.appdesiginformat.ui.TodoDetailFragment;
import com.potatomeme.appdesiginformat.ui.TodoListFragment;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    TodoListFragment todoListFragment;
    Toolbar toolbar;

    FloatingActionButton fab;

    ArrayList<Diary> listDiary;
    ArrayList<Todo> listTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        init();
    }

    private void init() {
        toolbar = findViewById(R.id.detail_toolBar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        fragmentManager = getSupportFragmentManager();
        todoListFragment = new TodoListFragment();
        fragmentManager.beginTransaction().replace(R.id.framelayout, todoListFragment).commit();

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), AddActivity.class);
            startActivity(intent);
        });

        dbSetting();
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return false;
        }
    }

    private void dbSetting() {
        listTodo = new ArrayList<Todo>();
        listTodo.add(new Todo(1, "sample date1", "sample title1", "sample content"));
        listTodo.add(new Todo(2, "sample date2", "sample title2", "sample content"));
        listTodo.add(new Todo(3, "sample date3", "sample title3", "sample content"));
        listTodo.add(new Todo(1, "sample date1", "sample title1", "sample content"));
        listTodo.add(new Todo(2, "sample date2", "sample title2", "sample content"));
        listTodo.add(new Todo(3, "sample date3", "sample title3", "sample content"));
        listTodo.add(new Todo(1, "sample date1", "sample title1", "sample content"));
        listTodo.add(new Todo(2, "sample date2", "sample title2", "sample content"));
        listTodo.add(new Todo(3, "sample date3", "sample title3", "sample content"));
        listTodo.add(new Todo(1, "sample date1", "sample title1", "sample content"));
        listTodo.add(new Todo(2, "sample date2", "sample title2", "sample content"));
        listTodo.add(new Todo(3, "sample date3", "sample title3", "sample content"));
        listTodo.add(new Todo(1, "sample date1", "sample title1", "sample content"));
        listTodo.add(new Todo(2, "sample date2", "sample title2", "sample content"));
        listTodo.add(new Todo(3, "sample date3", "sample title3", "sample content"));
        listTodo.add(new Todo(1, "sample date1", "sample title1", "sample content"));
        listTodo.add(new Todo(2, "sample date2", "sample title2", "sample content"));
        listTodo.add(new Todo(3, "sample date3", "sample title3", "sample content"));
    }

    public ArrayList<Diary> getListDiary() {
        return listDiary;
    }

    public ArrayList<Todo> getListTodo() {
        return listTodo;
    }
}