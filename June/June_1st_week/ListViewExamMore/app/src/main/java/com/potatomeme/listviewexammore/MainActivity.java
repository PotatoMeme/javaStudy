package com.potatomeme.listviewexammore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{
    // 리스트뷰(ListView)는 사용자가 정의한 데이터 목록을 세로 방향으로 나열하여 화면에 표시하는 뷰 그룹의 한 종류
    // ListView와 같은 뷰 그룹(ViewGroup)은 스크롤 기능을 지원하며 사용자가 배치된 각 항목(Item)을 선택하는 것도 가능
    // * Adapter
    // 사용자의 데이터를 받아 뷰(View)를 생성해주는 객체로 ListView와는 독립적으로 동작하는 객체
    // ListView는 Adpater로부터 생성된 뷰(View)를 받아 ListView의 한 항목으로 배치
    // 어댑터(Adapter)는 관리되는 데이터와 제공하는 뷰(View) 형태에 따라 종류가 다양
    // 구현 순서
    // 1. ListView Widget을 배치 할 레이아웃 리소스 정의
    // 2. ListView에 표시할 데이터 객체를 위한 클래스 생성
    // 3. ListView의 각 항목을  위한 레이아웃 리소스 정의
    // 4. BaseAdapter를 상속받아 Adapter 구현
    // 5. Adapter 와  ListView 연결
    // 6. ListView에 클릭 이벤트 연결

    ArrayList<SampleData> movieDataList;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieDataList = new ArrayList<SampleData>();

        movieDataList.add(new SampleData(R.drawable.movieposter1, "미션임파서블","15세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.movieposter2, "아저씨","19세 이상관람가"));
        movieDataList.add(new SampleData(R.drawable.movieposter3, "어벤져스","12세 이상관람가"));

        listView = (ListView) findViewById(R.id.listView);

        final MyAdapter myAdapter = new MyAdapter(this,movieDataList);

        listView.setAdapter(myAdapter);//Adapter 와  ListView 연결

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), myAdapter.getItem(i).getMovieName(), Toast.LENGTH_SHORT).show();
            }
        });//ListView에 클릭 이벤트 연결
    }

}