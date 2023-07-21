package com.potatomeme.listviewexammore;

public class SampleData { // 정보를 담기 위해 생성한 클래스

    private int poster;
    private String movieName;
    private String grade;

    public SampleData(int poster, String movieName, String grade) {
        this.poster = poster;
        this.movieName = movieName;
        this.grade = grade;
    }

    public int getPoster() {
        return poster;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGrade() {
        return grade;
    }

}
