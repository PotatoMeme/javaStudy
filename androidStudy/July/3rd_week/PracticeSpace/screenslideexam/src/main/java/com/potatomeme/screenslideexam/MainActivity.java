package com.potatomeme.screenslideexam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager = findViewById(R.id.pager);
        pager.setOffscreenPageLimit(3);

        MainPagerAdapter adapter = new MainPagerAdapter(getSupportFragmentManager(), 1);

        Fragment1 fragment1 = new Fragment1();
        adapter.addItem(fragment1);

        Fragment2 fragment2 = new Fragment2();
        adapter.addItem(fragment2);

        Fragment3 fragment3 = new Fragment3();
        adapter.addItem(fragment3);

        pager.setAdapter(adapter);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                /*Toast.makeText(getApplicationContext(),
                        "onPageScrolled\n"+position+"\n"+positionOffset+"\n"+positionOffsetPixels
                        ,Toast.LENGTH_SHORT).show();*/
            }

            @Override
            public void onPageSelected(int position) {
                Toast.makeText(getApplicationContext(),
                        "onPageSelected\n"+position
                        ,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                /*Toast.makeText(getApplicationContext(),
                        "onPageScrollStateChanged\n"+state
                        ,Toast.LENGTH_SHORT).show();*/
            }
        });
    }

}