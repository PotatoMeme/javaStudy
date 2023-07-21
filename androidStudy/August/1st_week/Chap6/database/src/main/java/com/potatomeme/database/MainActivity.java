package com.potatomeme.database;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText1, editText2, editText3, editText4, editText5;
    TextView textView;
    StringBuilder stringBuilder;
    SQLiteDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText4);
        editText5 = findViewById(R.id.editText5);
        textView = findViewById(R.id.textView);

        stringBuilder = new StringBuilder();
        findViewById(R.id.button1).setOnClickListener(view -> {
            openDatabase(editText1.getText().toString());
        });
        findViewById(R.id.button2).setOnClickListener(view -> {
            createTable(editText2.getText().toString());
        });
        findViewById(R.id.button3).setOnClickListener(view -> {
            insertData(editText2.getText().toString().trim(),
                    editText3.getText().toString().trim(),
                    Integer.parseInt(editText4.getText().toString().trim()),
                    editText5.getText().toString().trim());
        });
        findViewById(R.id.button4).setOnClickListener(view -> {
            selectData(editText2.getText().toString().trim());
        });
    }



    private void openDatabase(String dataBaseName) {
        println("openDatabase() 호출됨");
        /*database = openOrCreateDatabase(dataBaseName, MODE_PRIVATE, null);
        if (database != null) {
            println("DB 오픈됨");
        }*/
        DatabaseHelper helper = new DatabaseHelper(this,dataBaseName,null,1);
        database = helper.getWritableDatabase();
    }

    private void createTable(String tableName) {
        println("createTable() 호출됨");
        if (database != null) {
            String sql = "CREATE TABLE " + tableName + " (" +
                    "_id integer PRIMARY KEY autoincrement, " +
                    "name text, " +
                    "age integer, " +
                    "mobile text)";
            database.execSQL(sql);
            println(tableName + " table 생성됨");
        } else {
            println("먼전 DB를 열어 주세요");
        }
    }

    private void insertData(String tableName, String name, int age, String mobile) {
        println("insertData() 호출됨");
        if (database != null) {
            String sql = "insert into " + tableName + "(name, age, mobile) values(?, ?, ?)";
            Object[] parms = {name, age, mobile};
            database.execSQL(sql, parms);
            println("데이터 추가함");
        } else {
            println("먼전 DB를 열어 주세요");
        }
    }

    private void selectData(String tableName) {
        println("selectData() 호출됨");
        if (database != null) {
            String sql = "select * from " + tableName;
            Cursor cursor = database.rawQuery(sql, null);
            println("조회된 data 개수 :" + cursor.getCount());
            for (int i = 0; i < cursor.getCount(); i++) {
                cursor.moveToNext();
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                int age = cursor.getInt(2);
                String mobile = cursor.getString(3);
                println("#" + id + "->" + name + ", " + age + ", " + mobile);
            }
            cursor.close();
        } else {
            println("먼전 DB를 열어 주세요");
        }
    }

    private void println(String data) {
        stringBuilder.append(data).append("\n");
        textView.setText(stringBuilder);
    }

    class DatabaseHelper extends SQLiteOpenHelper {

        public DatabaseHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
            super(context, name, factory, version);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            println("onCreate() 호출됨");
            String tableName = "customer";
            String sql = "CREATE TABLE if not exists " + tableName + " (" +
                    "_id integer PRIMARY KEY autoincrement, " +
                    "name text, " +
                    "age integer, " +
                    "mobile text)";
            sqLiteDatabase.execSQL(sql);
            println(tableName + " table 생성됨");
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            println("onUpgrade() 호출됨 : " + i + ", " + i1);
            if (i1 > 1) {
                String tableName = "customer";
                sqLiteDatabase.execSQL("drop table if exists " + tableName);
                println(tableName+"테이블 삭제함");
                String sql = "CREATE TABLE if not exists " + tableName + " (" +
                        "_id integer PRIMARY KEY autoincrement, " +
                        "name text, " +
                        "age integer, " +
                        "mobile text)";
                sqLiteDatabase.execSQL(sql);
                println(tableName + " table 새로 생성됨");
            }
        }
    }
}