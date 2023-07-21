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
                //사용자가 권한 요청을 명시적으로 거부한 경우 true를 반환, 사용자가 권한 요청을 처음 보거나, 다시 묻지 않음 선택한 경우, 권한을 허용한 경우 false를 반환
                Toast.makeText(this,"sms 권한 설명 필용함",Toast.LENGTH_SHORT).show();
            }else{
                ActivityCompat.requestPermissions(this,new String[] {Manifest.permission.RECEIVE_SMS},1);
                //사용자에게 명시적으로 권한을 요청,안드로이드 시스템 표준 대화상자로 사용자에게 권한을 요구하며, 변경할 수 없다.
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        // onActivityResult처럼, requestPermissions를 통해 받아온 사용자 응답에 따라 동작을 정의할 수 있다.
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