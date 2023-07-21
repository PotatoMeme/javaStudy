package com.potatomeme.listviewexammore;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends BaseAdapter {//BaseAdapter를 상속받아 MyAdapter를 구현

    Context mContext = null;
    LayoutInflater mLayoutInflater = null;
    ArrayList<SampleData> sampleData;

    public MyAdapter(Context mContext, ArrayList<SampleData> sampleData) {
        this.mContext = mContext;
        this.sampleData = sampleData;
        mLayoutInflater = LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return sampleData.size();
    }

    @Override
    public SampleData getItem(int i) {
        return sampleData.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View converView, ViewGroup parent) {
        // getView() 함수는 각 데이터 항목에 대하여 ListView에 표현하기 위한 뷰(View)를 생성하는 함수
        View view = mLayoutInflater.inflate(R.layout.listview_custom, null);
        // 전개자(Inflater)를 통해 listview_custom의 내용을 파싱 하여 뷰(View)들을 객체화
        ImageView imageView = (ImageView)view.findViewById(R.id.poster);
        TextView movieName = (TextView)view.findViewById(R.id.movieName);
        TextView grade = (TextView)view.findViewById(R.id.grade);

        imageView.setImageResource(sampleData.get(position).getPoster());
        movieName.setText(sampleData.get(position).getMovieName());
        grade.setText(sampleData.get(position).getGrade());
        // 각 Widget의 참조를 얻어와 현재 표현하고자 하는 데이터 값들을 지정
        return view;
    }
}
