
package com.potatomeme.servicetest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    // 한번실행되면 계속 실행됨

    private static final String TAG = "MyService";

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        // intent로 전달받은 내용의 확인은 onStartCommand에서 확인
        Log.d(TAG, "onStartCommand");
        if (intent == null) {
            return Service.START_STICKY;
        } else {
            processComand(intent);
        }

        return super.onStartCommand(intent, flags, startId);
    }

    private void processComand(Intent intent) {
        String command = intent.getStringExtra("command");
        String name = intent.getStringExtra("name");
        Log.d(TAG, "command :" + command + ",name :" + name);

        try {
            Thread.sleep(5000);// 5초 쉬기
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent showIntent = new Intent(getApplicationContext(), MainActivity.class);
        showIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|
                            Intent.FLAG_ACTIVITY_SINGLE_TOP|
                            Intent.FLAG_ACTIVITY_CLEAR_TOP);
        showIntent.putExtra("command", command);
        showIntent.putExtra("name", name + "from service");
        startActivity(showIntent);
    }

    @Override
    public void onDestroy() {

        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

}