package com.potatomeme.server;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerService extends Service {
    ServerThread thread;
    public ServerService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        thread = new ServerThread();
        thread.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

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
}