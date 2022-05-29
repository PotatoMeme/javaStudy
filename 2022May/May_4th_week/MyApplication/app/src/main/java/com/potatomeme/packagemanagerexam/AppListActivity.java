package com.potatomeme.packagemanagerexam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class AppListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_list);

        ListView listView = findViewById(R.id.list_view);

        PackageManager pm = getPackageManager();
        List<ApplicationInfo> infos = pm.getInstalledApplications(PackageManager.GET_META_DATA);

        AppInfoAdapter adapter = new AppInfoAdapter(infos);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ApplicationInfo info = infos.get(i);
                //ApplicationInfo info = (ApplicationInfo) adapterView.getAdapter().getItem(i); // 둘다 가능

                Intent intent = new Intent();
                intent.putExtra("info",info);//Parcelable 안드로이드에만 있음
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}