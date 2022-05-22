package com.potatomeme.listviewexam;

public class Weather {
    private String city;
    private String temp;
    private int weather;

    public Weather(String city, String temp, int weather) {
        this.city = city;
        this.temp = temp;
        this.weather = weather;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    public int getWeather() {
        return weather;
    }

    public void setWeather(int weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", temp='" + temp + '\'' +
                ", weather='" + weather + '\'' +
                '}';
    }
}
