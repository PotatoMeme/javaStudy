package com.potatomeme.listviewexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //데이터 준비
        //ArrayList<String> data = new ArrayList<>();
        //for (int i = 0; i < 30; i++) {
        //    data.add("data" + i);
        //}


        // =>
        ArrayList<Weather> data =new ArrayList<>();
        Random random = new Random();
        for (int i = 0;i<30;i++){
            data.add(new Weather("city"+i,"25도",random.nextInt(4)));
        }


        //어댑터
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this
        //        , android.R.layout.simple_list_item_1, data);

        // =>
        MyFirstAdapter adapter = new MyFirstAdapter(data);


        //뷰
        ListView listView = findViewById(R.id.list_view);
        listView.setAdapter(adapter);// 리스트 뷰이외에도 gridview 도 어댑터 적용가능

        //클릭
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, i + "번째 아이템 선택", Toast.LENGTH_SHORT).show();
            }
        });
    }
}