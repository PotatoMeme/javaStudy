package com.potatomeme.jsontest;

public class Country {
    private int code;
    private String countryName;

    public Country(int code, String countryName) {
        this.code = code;
        this.countryName = countryName;
    }

    public int getCode() {
        return code;
    }

    public String getCountryName() {
        return countryName;
    }
}
