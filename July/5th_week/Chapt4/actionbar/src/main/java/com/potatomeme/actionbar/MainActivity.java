package com.potatomeme.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        ActionBar actionBar = getSupportActionBar();
        //actionBar.hide();
        //actionBar.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        View view = menu.findItem(R.id.menu_search).getActionView();
        if (view != null){
            EditText editText = view.findViewById(R.id.editText);
            Log.d(TAG,"setting1");
            if (editText != null){
                Log.d(TAG,"setting2");
                editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                        Toast.makeText(getApplicationContext(), "입력됨", Toast.LENGTH_SHORT).show();
                        Log.d(TAG,editText.getText().toString());
                        return true;
                    }
                });
            }
        }
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.menu_refresh:
                Log.d(TAG,"R.id.menu_refresh 클릭");
                return true;
            case R.id.menu_search:
                Log.d(TAG,"R.id.menu_search 클릭");
                return true;
            case R.id.menu_settings:
                Log.d(TAG,"R.id.menu_settings 클릭");
                return true;
            default:
                return false;
        }
    }
}