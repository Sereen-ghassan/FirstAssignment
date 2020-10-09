package com.example.firstassignment.Model;

public class Movie {
   private String Title;
    private int year;
    private String movieGenre;
    private String url;
    public Movie() {
    }

    public Movie(String title, int year, String movieGenre,String url) {
        Title = title;
        this.year = year;
        this.movieGenre = movieGenre;
        this.url=url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }
}
