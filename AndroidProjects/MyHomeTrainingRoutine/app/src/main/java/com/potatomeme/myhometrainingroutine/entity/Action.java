package com.potatomeme.myhometrainingroutine.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Action {
    @PrimaryKey(autoGenerate = true)
    private int seq;

    private String date;
    private int state;//상체,하체,전신,휴식(자율)
    private int detail;//팔굽,턱걸이,스쿼트,버피,달리기등등
    private int count;//총 몇개, 거리등등

    public Action(int seq, String date, int state, int detail, int count) {
        this.seq = seq;
        this.date = date;
        this.state = state;
        this.detail = detail;
        this.count = count;
    }

    @Override
    public String toString() {
        return "Action{" +
                "seq=" + seq +
                ", date='" + date + '\'' +
                ", state=" + state +
                ", detail=" + detail +
                ", count=" + count +
                '}';
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getDetail() {
        return detail;
    }

    public void setDetail(int detail) {
        this.detail = detail;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
