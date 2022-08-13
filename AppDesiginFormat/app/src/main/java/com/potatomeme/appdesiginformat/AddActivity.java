package com.potatomeme.appdesiginformat;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import com.potatomeme.appdesiginformat.ui.DiaryAddFragment;
import com.potatomeme.appdesiginformat.ui.DiaryUpdateFragment;
import com.potatomeme.appdesiginformat.ui.TodoAddFragment;
import com.potatomeme.appdesiginformat.ui.TodoUpdateFragment;

public class AddActivity extends AppCompatActivity {


    FragmentManager fragmentManager;
    DiaryAddFragment diaryUpdateFragment;
    TodoAddFragment todoUpdateFragment;



    Toolbar toolbar;

    Button button_submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);
        init();
    }

    private void init() {
        toolbar = findViewById(R.id.edit_toolBar);
        setSupportActionBar(toolbar);
        toolbar.setTitle("Add");

        fragmentManager = getSupportFragmentManager();
        diaryUpdateFragment = new DiaryAddFragment();
        todoUpdateFragment = new TodoAddFragment();
        fragmentManager.beginTransaction().replace(R.id.framelayout,diaryUpdateFragment).commit();

        button_submit = findViewById(R.id.submit_button);
        button_submit.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "button_submit", Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_end, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_close:
                finish();
                return true;
            default:
                return false;
        }
    }
}