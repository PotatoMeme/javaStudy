package com.potatomeme.jsontest;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Consumer;
import io.reactivex.rxjava3.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    Disposable backgroundTask;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_view);
        Observable<ArrayList<Country>> source = Observable.fromCallable(
                () -> {

                    ArrayList<Country> values = new HttpHelper().getList();

                    // NULL value not allowed.
                    if (values == null) {
                        values =new ArrayList<>();
                        values.add(new Country(0,"No Data"));
                    }
                    return values;
                }
        );
        backgroundTask = source.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<ArrayList<Country>>() {
                    @Override
                    public void accept(ArrayList<Country> result) {

                        MyAdapter adapter = new MyAdapter(result);
                        listView.setAdapter(adapter);

                        backgroundTask.dispose();
                    }
                });
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, i + "번째 아이템 선택", Toast.LENGTH_SHORT).show();
            }
        });
    }

}