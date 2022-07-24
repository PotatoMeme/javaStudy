package com.potatomeme;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int permissionCheck = ContextCompat.checkSelfPermission(this, Manifest.permission.RECEIVE_SMS);//리턴값이 int형 이므로 int형 변수에 저장
        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {//permission 즉 권한이 되어있는지를 확인
            Toast.makeText(this,"sms 수신권한 주어져 있음",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this,"sms 수신권한 없음",Toast.LENGTH_SHORT).show();
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.RECEIVE_SMS)){
                Toast.makeText(this,"sms 권한 설명 필용함",Toast.LENGTH_SHORT).show();
            }else{
                ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.RECEIVE_SMS},1);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0) {
                    if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                        Toast.makeText(this, "sms 수신권한을 사용자가 수신함", Toast.LENGTH_SHORT).show();
                    } else if (grantResults[0] == PackageManager.PERMISSION_DENIED) {
                        Toast.makeText(this, "sms 수신권한을 사용자가 거부함", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(this, "sms 수신권한을 부여받지 못함", Toast.LENGTH_SHORT).show();
                }
                break;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}