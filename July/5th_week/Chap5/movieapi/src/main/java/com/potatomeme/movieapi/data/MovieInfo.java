package com.potatomeme.movieapi.data;

// "result":[
// {"id":1,
// "title":"꾼",
// "title_eng":"The Swindlers",
// "date":"2017-11-22",
// "user_rating":3.9,
// "audience_rating":8.36,
// "reviewer_rating":4.33,
// "reservation_rate":61.69,
// "reservation_grade":1,
// "grade":15,
// "thumb":"http://movie2.phinf.naver.net/20171107_251/1510033896133nWqxG_JPEG/movie_image.jpg?type=m99_141_2",
// "image":"http://movie.phinf.naver.net/20171107_251/1510033896133nWqxG_JPEG/movie_image.jpg"},
public class MovieInfo {
    public int id;
    public String title;
    public String title_eng;
    public String date;
    public float user_rating;
    public float audience_rating;
    public float reviewer_rating;
    public float reservation_rate;
    public int reservation_grade;
    public int grade;
    public String thumb;
    public String image;

    @Override
    public String toString() {
        return "id=" + id +
                "\ntitle='" + title +
                "\ntitle_eng='" + title_eng +
                "\ndate='" + date +
                "\nuser_rating=" + user_rating +
                "\naudience_rating=" + audience_rating +
                "\nreviewer_rating=" + reviewer_rating +
                "\nreservation_rate=" + reservation_rate +
                "\nreservation_grade=" + reservation_grade +
                "\ngrade=" + grade +
                "\nthumb='" + thumb +
                "\nimage='" + image+"\n";

    }
}
