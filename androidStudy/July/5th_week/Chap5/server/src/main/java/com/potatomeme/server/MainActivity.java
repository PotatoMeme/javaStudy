package com.potatomeme.server;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        findViewById(R.id.button1).setOnClickListener(view -> {
            //ServerThread thread = new ServerThread();
            //thread.start();
            Intent intent = new Intent(this,ServerService.class);
            startService(intent);
        });
    }
    /*
    class ServerThread extends Thread{
        private static final int port = 5001;
        @Override
        public void run() {
            try {
                ServerSocket server = new ServerSocket(port);
                Log.d("ServerThread","서버가 실행됨");
                while (true){
                    Socket socket = server.accept();
                    ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
                    Object input = inputStream.readObject();
                    Log.d("ServerThread","input:"+input);
                    ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                    outputStream.writeObject(input+"form Server");
                    outputStream.flush();
                    Log.d("ServerThread","output 보냄");

                    socket.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    */

}