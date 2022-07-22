package com.potatomeme.intenttest;

import android.os.Parcel;
import android.os.Parcelable;

public class Man implements Parcelable {



    private String name;
    private boolean sex;
    private int age;

    public Man(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    /*public Man(Parcel src) {
        this.name = src.readString();
        this.sex = src.readBoolean();
        this.age = src.readInt();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public Man
    };*/

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", sex=" + this.getSex() +
                ", age=" + age +
                '}';
    }

    private String getSex(){
        return sex?"남자":"여자";
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

    }
}
