package com.potatomeme.jsontest;

import android.util.Log;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.util.ArrayList;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class HttpHelper {
    public ArrayList<Country> getList() {

        // Declare variable(s).
        ArrayList<Country> arrList = new ArrayList<>();
        JSONObject listObject = null;
        String url = "http://115.89.165.130:6776/v1/api/getList";

        try{
            OkHttpClient client = new OkHttpClient(); // 서버 연동용
            client = new OkHttpClient.Builder().retryOnConnectionFailure(false).build();

            // Request 요청
            Request request = new Request.Builder()
                    .url(url)
                    .get()
                    .build();

            // Response 응답
            Response response = client.newCall(request).execute();

            String strRet = response.body().string();
            // strRet : {"data":[{"code":1,"name":"한국"},{"code":2,"name":"미국"},{"code":3,"name":"프랑스"},{"code":4,"name":"독일"},{"code":5,"name":"네덜란드"},{"code":6,"name":"이탈리아"},{"code":7,"name":"브라질"},{"code":8,"name":"시리아"},{"code":9,"name":"영국"},{"code":10,"name":"호주"}],"errMsg":"","retCode":"ok"}
            JSONParser parser = new JSONParser();
            listObject = (JSONObject)parser.parse(strRet);// Json String ->  Json Object
            // data -> {JSONArray@17184}  size = 10

            // error check.
            if (listObject == null) {
                return null;
            }

            JSONArray jArr = (JSONArray) listObject.get("data");
            for (int ii=0; ii < jArr.size(); ii++) {
                JSONObject j = (JSONObject) jArr.get(ii);
                Log.d("***",j.get("code").toString());
                arrList.add(new Country(Integer.parseInt(j.get("code").toString()),(String) j.get("name")));
            }
        } catch (Exception ex){
            Log.d("HttpHelper:error",ex.getMessage());
            return null;
        }
        // Return.
        return arrList;

    }
}
