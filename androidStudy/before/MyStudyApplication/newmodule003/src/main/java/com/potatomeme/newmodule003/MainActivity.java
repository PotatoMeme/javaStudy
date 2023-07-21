package com.potatomeme.newmodule003;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = (ListView) findViewById(R.id.lv_id);

        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter =
                new ArrayAdapter<>(this,
                        android.R.layout.simple_list_item_1, data);
        list.setAdapter(adapter);

        data.add("name1");
        data.add("name2");
        data.add("name3");
        data.add("name4");
        data.add("name5");
        adapter.notifyDataSetChanged();

    }
}