package com.potatomeme.appdesiginformat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;
import com.potatomeme.appdesiginformat.ui.CalendarFragment;
import com.potatomeme.appdesiginformat.ui.DiaryDetailFragment;
import com.potatomeme.appdesiginformat.ui.TodoDetailFragment;

public class DetailActivity extends AppCompatActivity {
    FragmentManager fragmentManager;
    TodoDetailFragment todoDetailFragment;
    DiaryDetailFragment diaryDetailFragment;
    Toolbar toolbar;
    NavigationBarView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        init();
    }

    private void init() {
        toolbar = findViewById(R.id.detail_toolBar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() == null){
            Log.d("detail","getSurportActionBar is null");
        }
        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        fragmentManager = getSupportFragmentManager();
        todoDetailFragment = new TodoDetailFragment();
        diaryDetailFragment = new DiaryDetailFragment();
        fragmentManager.beginTransaction().replace(R.id.framelayout,diaryDetailFragment).commit();

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.menu_update:
                        //Toast.makeText(getApplicationContext(),"menu_update clicked",Toast.LENGTH_SHORT).show();
                        return true;

                }
                return true;
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_detail_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;

            case R.id.menu_del:
                //Intent intent = new Intent();
                //startActivity(intent);
                return true;
            default:
                return false;
        }
    }
}