package com.potatomeme.appdesiginformat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.potatomeme.appdesiginformat.ui.CalendarFragment;


public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomNavigationView navigationView;
    FragmentManager fragmentManager;
    CalendarFragment calendarFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        fragmentManager = getSupportFragmentManager();
        calendarFragment = new CalendarFragment();
        fragmentManager.beginTransaction().replace(R.id.framelayout,calendarFragment).commit();

        navigationView = findViewById(R.id.bottom_navigation);
        navigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Toast.makeText(getApplicationContext(),item.getTitle(),Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}