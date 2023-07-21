package com.potatomeme.end;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

public class AppHelper {
    private static final String TAG = "AppHelper";
    private static SQLiteDatabase database;
    private static String createTableOutlineSql = "create table if not exists outline"+
            "("+
            "_id integer PRIMARY KEY autoincrement, "+
            "id integer, "+
            "title text, "+
            "title_eng text, "+
            "dateValue text, "+
            "user_rating float, "+
            "audience_rating float, "+
            "reviewer_rating float, "+
            "reservation_rate float, "+
            "reservation_grade integer, "+
            "grade integer, "+
            "thumb text, "+
            "image text"+
            ")";

    public static void openDatabase(Context context, String databaseName) {
        logData("openDatabase() 호출됨");
        try {
            database = context.openOrCreateDatabase(databaseName, Context.MODE_PRIVATE, null);
            if (database != null) {
                logData("데이터베이스 " + databaseName + " 오픈됨.");
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void createTable(String tableName){
        logData("createTable() 호출됨");
        if (database != null){
            if (tableName.equals("outline")){
                database.execSQL(createTableOutlineSql);
                logData("outline 테이블 생성 요청됨");
            }
        }else{
            logData("데이터 베이스를 먼저 열어주세요");
        }
    }

    private static void logData(String s) {
        Log.d(TAG, s);
    }
}
