package com.example.firstassignment.Model;

public class Movie {
   private String Title;
    private String year;
    private String movieGenre;
    private String url;
    public Movie() {
    }

    public Movie(String title, String year, String movieGenre) {
        this.Title = title;
        this.year = year;
        this.movieGenre = movieGenre;

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
        this.Title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    @Override
    public String toString() {
        return
                " " + Title  +
                " " + year +
                " " + movieGenre + '\n';
    }
}
