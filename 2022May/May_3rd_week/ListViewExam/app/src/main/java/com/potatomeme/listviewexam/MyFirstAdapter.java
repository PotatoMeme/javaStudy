package com.potatomeme.listviewexam;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyFirstAdapter extends BaseAdapter {
    private List<Weather> mData;
    private int[] mWeatherImageArr;
    public MyFirstAdapter(List<Weather> data) {
        this.mData = data;
        this.mWeatherImageArr = new int[4];
        mWeatherImageArr[0] = R.drawable.sunny;
        mWeatherImageArr[1] = R.drawable.cloudy;
        mWeatherImageArr[2] = R.drawable.snow;
        mWeatherImageArr[3] = R.drawable.blizzard;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int i) {
        return mData.get(i);// position -> i
    }

    @Override
    public long getItemId(int i) {
        return i;// position -> i
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        //view = LayoutInflater.from(viewGroup.getContext())
        //        .inflate(R.layout.item_weather,viewGroup,false);
        // => 비용 많이 발생 네트워크시 느려짐

        ViewHolder viewHolder;
        if(view == null) {//최초는 null 그이후에는 재사용할수 있음
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.item_weather, viewGroup, false);
            ImageView imageView = view.findViewById(R.id.weather_img);
            TextView cityText = view.findViewById(R.id.city_text);
            TextView tempText = view.findViewById(R.id.temp_text);
            viewHolder.imageView = imageView;
            viewHolder.cityText = cityText;
            viewHolder.tempText = tempText;

            view.setTag(viewHolder);// 저장
        } else {
          viewHolder = (ViewHolder) view.getTag(); // 재사용시 저장한값을 가져옴
        }

        //ImageView imageView = view.findViewById(R.id.weather_img);
        //TextView cityText = view.findViewById(R.id.city_text);
        //TextView tempText = view.findViewById(R.id.temp_text);
        // => 매번 find하기때문에 필요이상의 자원을 소모함

        Weather weather = mData.get(i);
        viewHolder.imageView.setImageResource(mWeatherImageArr[weather.getWeather()]);
        viewHolder.cityText.setText(weather.getCity());
        viewHolder.tempText.setText(weather.getTemp());

        return view;
    }

    static class ViewHolder{
        ImageView imageView;
        TextView cityText;
        TextView tempText;
    }
}
