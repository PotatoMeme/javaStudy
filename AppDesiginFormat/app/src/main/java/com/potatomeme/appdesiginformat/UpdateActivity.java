package com.potatomeme.appdesiginformat;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;
import com.potatomeme.appdesiginformat.helper.AppHelper;
import com.potatomeme.appdesiginformat.ui.DiaryDetailFragment;
import com.potatomeme.appdesiginformat.ui.DiaryListFragment;
import com.potatomeme.appdesiginformat.ui.DiaryUpdateFragment;
import com.potatomeme.appdesiginformat.ui.TodoDetailFragment;
import com.potatomeme.appdesiginformat.ui.TodoListFragment;
import com.potatomeme.appdesiginformat.ui.TodoUpdateFragment;

public class UpdateActivity extends AppCompatActivity {

    int db_tag;
    int seq;
    FragmentManager fragmentManager;
    DiaryUpdateFragment diaryUpdateFragment;
    TodoUpdateFragment todoUpdateFragment;



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

        fragmentManager = getSupportFragmentManager();
        Intent get_intent = getIntent();
        db_tag = get_intent.getIntExtra("db_tag", 0);
        seq = get_intent.getIntExtra("seq",0);
        switch (db_tag) {
            case AppHelper.DIARY_TAG:
                DiaryUpdateFragment diaryUpdateFragment = new DiaryUpdateFragment();
                fragmentManager.beginTransaction().replace(R.id.framelayout, diaryUpdateFragment).commit();
                break;
            case AppHelper.TODO_TAG:
                TodoUpdateFragment todoUpdateFragment = new TodoUpdateFragment();
                fragmentManager.beginTransaction().replace(R.id.framelayout, todoUpdateFragment).commit();
                break;
        }

        button_submit = findViewById(R.id.submit_button);
        button_submit.setOnClickListener(view -> {
            finish();
        });
    }

    public int getSeq() {
        return seq;
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