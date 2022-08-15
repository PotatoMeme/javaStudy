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
import com.potatomeme.appdesiginformat.helper.AppHelper;
import com.potatomeme.appdesiginformat.ui.DiaryDetailFragment;
import com.potatomeme.appdesiginformat.ui.DiaryListFragment;
import com.potatomeme.appdesiginformat.ui.TodoDetailFragment;
import com.potatomeme.appdesiginformat.ui.TodoListFragment;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    int db_tag;
    FragmentManager fragmentManager;
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
        Intent get_intent = getIntent();
        db_tag = get_intent.getIntExtra("db_tag", 0);
        switch (db_tag) {
            case AppHelper.DIARY_TAG:
                DiaryListFragment diaryListFragment = new DiaryListFragment();
                fragmentManager.beginTransaction().replace(R.id.framelayout, diaryListFragment).commit();
                break;
            case AppHelper.TODO_TAG:
                TodoListFragment todoListFragment = new TodoListFragment();
                fragmentManager.beginTransaction().replace(R.id.framelayout, todoListFragment).commit();
                break;
        }

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), AddActivity.class);
            intent.putExtra("db_tag", db_tag);
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

        listDiary = new ArrayList<Diary>();
        for (int i = 0; i < 30; i++) {
            listDiary.add(new Diary(i % 5, "sampleDate1", i % 5, i % 5, "sample title1", "sample content"));
        }

    }

    public ArrayList<Diary> getListDiary() {
        return listDiary;
    }

    public ArrayList<Todo> getListTodo() {
        return listTodo;
    }
}