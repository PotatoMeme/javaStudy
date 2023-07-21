package com.potatomeme.packagemanagerexam;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1000;

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.shortcut_img);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
        String packageName = preferences.getString("Shortcut",null);
        //Toast.makeText(this, packageName+"*", Toast.LENGTH_SHORT).show();
        if(packageName != null){
            try {
                Drawable icon = getPackageManager().getApplicationIcon(packageName);
                imageView.setImageDrawable(icon);
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    public void onImageClicked(View view) {
        ImageView imageView = (ImageView) view;
        Drawable drawable = imageView.getDrawable();
        if(drawable != null){
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            String packageName = preferences.getString("Shortcut",null);
            //Toast.makeText(this, packageName+"***", Toast.LENGTH_SHORT).show();
            if(packageName != null){
                Intent intent = getPackageManager().getLaunchIntentForPackage(packageName);
                startActivity(intent);
            }
        }
    }

    public void onButtonClicked(View view) {
        Intent intent = new Intent(this,AppListActivity.class);
        startActivityForResult(intent,REQUEST_CODE);//20년 5월 deprecated됨
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null){
            ApplicationInfo info = data.getParcelableExtra("info");
            Drawable icon = info.loadIcon(getPackageManager());
            imageView.setImageDrawable(icon);

            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(this);
            SharedPreferences.Editor editor = preferences.edit();
            editor.putString("Shortcut",info.packageName);
            //Toast.makeText(this, info.packageName+"**", Toast.LENGTH_SHORT).show();
            editor.apply();
        }
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("종료확인");
        builder.setMessage("정말로 종료하시겠습니까?");
        builder.setPositiveButton("확인", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
                //finish();
            }
        });
        builder.setNegativeButton("취소",null);
        builder.show();
    }
}