package com.potatomeme.servicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

    }

    private void init() {
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);
        button.setOnClickListener(view -> {
            String name = editText.getText().toString();
            Intent intent = new Intent(getApplicationContext(),MyService.class);
            intent.putExtra("command","show");
            intent.putExtra("name",name);
            startService(intent);
        });

        Intent passedIntent = getIntent();
        processComand(passedIntent);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.d(getClass().toString(),": onNewIntent");
        processComand(intent);
        super.onNewIntent(intent);
    }

    private void processComand(Intent intent) {
        if (intent != null){
            String command = intent.getStringExtra("command");
            String name = intent.getStringExtra("name");
            Toast.makeText(this,"command : "+command+", name : "+name,Toast.LENGTH_SHORT).show();
        }
    }
}