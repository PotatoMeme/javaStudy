package com.potatomeme.appdesiginformat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.potatomeme.appdesiginformat.entity.Diary;
import com.potatomeme.appdesiginformat.entity.Todo;
import com.potatomeme.appdesiginformat.ui.CalendarFragment;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView navigationView;
    FragmentManager fragmentManager;
    CalendarFragment calendarFragment;

    ArrayList<Diary> listDiary;
    ArrayList<Todo> listTodo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        toolbar = findViewById(R.id.main_toolBar);
        setSupportActionBar(toolbar);

        dbSetting();

        fragmentManager = getSupportFragmentManager();
        calendarFragment = new CalendarFragment();
        fragmentManager.beginTransaction().replace(R.id.framelayout,calendarFragment).commit();

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText(getApplicationContext(),item.getTitle(),Toast.LENGTH_SHORT).show();
                switch (item.getItemId()){
                    case R.id.menu_todo:
                        fragmentManager.beginTransaction().replace(R.id.framelayout,calendarFragment).commit();
                        return true;
                    case R.id.menu_home:
                        return true;
                    case R.id.menu_setting:
                        return true;
                    default:
                        return false;
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    private void dbSetting() {
        listTodo = new ArrayList<Todo>();
        listTodo.add(new Todo(1,"sample date1","sample title1","sample content"));
        listTodo.add(new Todo(2,"sample date2","sample title2","sample content"));
        listTodo.add(new Todo(3,"sample date3","sample title3","sample content"));
    }

    public ArrayList<Diary> getListDiary() {
        return listDiary;
    }

    public ArrayList<Todo> getListTodo() {
        return listTodo;
    }

}