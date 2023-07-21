package com.potatomeme.intenttest;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityResultLauncher<Intent> activityResultLauncher;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences preferences = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("name", "저장한 내용");
        editor.putInt("count", count);
        editor.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences preferences = getSharedPreferences("pref", Activity.MODE_PRIVATE);
        if (preferences != null) {
            String name = preferences.getString("name", "");
            count = preferences.getInt("count", 0);
            count++;
            Toast.makeText(this, "복구 : " + name + ", count:" + count, Toast.LENGTH_SHORT).show();
        } else {
            count = 0;
        }
    }

    // Intent.FLAG_ACTIVITY_SINGLE_TOP 플래그
    // 동일한 액티비티가 이미 메모리에 만들어져 있다면 추가로 만들지 않고 그 액티비티를 화면에 띄워주는 역할을 함
    // Intent.FLAG_ACTIVITY_NEW_TASK 플래그
    // 액티비티들을 관리하는 태스크(TASK) 객체를 새로 만들도록 함
    // Intent.FLAG_ACTIVITY_CLEAR_TOP 플래그는
    // 원하는 액티비티가 이미 메모리에 만들어져 있고 그 이후에 다른 액티비티가 만들어진 경우 원하는 액티비티를 찾아 다시 띄울 때 그 이후에 만들어진 다른 액티비티들은 없애주는 역할을 함

    // Serializable과 Parcelable
    // put...과 get... 메소드를 이용해 인텐트에 넣을 수 있는 부가데이터의 자료형(Type)은 Boolean, Integer, Float, String과 같은 기본 자료형들
    // ArrayList와 같은 객체들은 이미 Serializable 인터페이스를 구현하고 있으므로 그대로 부가데이터로 추가할 수 있으며, 그 외에 Person과 같이 직접 정의하는 객체들은 Parcelable 인터페이스를 구현한 후 부가데이터로 추가하는 것을 권장
    // Serializable보다 좀 더 메모리 용량을 적게 차지하는 Parcelable 객체를 만들어 전달할 수도 있습

    private void init() {
        activityResultLauncher = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), result -> {
            if (result.getResultCode() == 1999) {// 음답 코드가 1999이면 실행
                Intent intent = result.getData();
                String name = intent.getStringExtra("test");
                Toast.makeText(getApplicationContext(), name + "MainActivity", Toast.LENGTH_SHORT).show();
            }
        });// startActivityForResult()

        findViewById(R.id.button1).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            intent.putExtra("test", "데이터");
            activityResultLauncher.launch(intent);
        });

        findViewById(R.id.button2).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            activityResultLauncher.launch(intent);
        });

        findViewById(R.id.button3).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            ArrayList<String> names = new ArrayList<>();
            names.add("Lee");
            names.add("Jin");
            names.add("Kim");
            intent.putExtra("names", names);
            activityResultLauncher.launch(intent);
        });

        findViewById(R.id.button4).setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
            Man kim = new Man("kim", 19);
            intent.putExtra("kim", kim);
            activityResultLauncher.launch(intent);
        });
    }
}