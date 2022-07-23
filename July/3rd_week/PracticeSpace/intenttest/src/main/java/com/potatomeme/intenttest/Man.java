package com.potatomeme.intenttest;

import android.os.Parcel;
import android.os.Parcelable;

import java.sql.Array;

public class Man implements Parcelable {

    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Man(Parcel src) {//객체를 받았을 때 직렬화를 풀어주는 로직
        this.name = src.readString();
        this.age = src.readInt();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public Man createFromParcel(Parcel src){
            return  new Man(src);
        }

        public Man[] newArray(int size){
            return new Man[size];
        }
    };

    /*public static final Creator<Man> CREATOR = new Creator<Man>() {
        @Override
        public Man createFromParcel(Parcel in) {
            return new Man(in);
        }

        @Override
        public Man[] newArray(int size) {
            return new Man[size];
        }
    };*/

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {//객체가 직렬화되어 보내지기 이전에 데이터를 직렬화시켜주는 메소드
        parcel.writeString(name);
        parcel.writeInt(age);
    }
}
