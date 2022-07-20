package com.potatomeme;

public class Reward {
    private String client;
    private String time;
    private String detail;
    private int recommend;
    private int img;
    private int rating;


    public Reward() {
        this.client = "kym71**";
        this.time = "10분전";
        this.detail = "적당히 재밌다. 오랜만에 잠안오는 영화 봤네요.";
        this.recommend = 0;
        this.img = R.drawable.ic_baseline_people_24;
        this.rating = 5;
    }

    public Reward(String client) {
        this.client = client;
        this.time = "10분전";
        this.detail = "적당히 재밌다. 오랜만에 잠안오는 영화 봤네요.";
        this.recommend = 0;
        this.img = R.drawable.ic_baseline_people_24;
        this.rating = 5;
    }

    public Reward(String client, String time, String detail, int recommend, int img, int rating) {
        this.client = client;
        this.time = time;
        this.detail = detail;
        this.recommend = recommend;
        this.img = img;
        this.rating = rating;
    }


    @Override
    public String toString() {
        return "Reward{" +
                "client='" + client + '\'' +
                ", time='" + time + '\'' +
                ", detail='" + detail + '\'' +
                ", recommend=" + recommend +
                ", img=" + img +
                ", rating=" + rating +
                '}';
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
