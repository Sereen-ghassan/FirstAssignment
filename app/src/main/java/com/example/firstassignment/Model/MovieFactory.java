package com.example.firstassignment.Model;

public class MovieFactory {
    public IMovie getModel(){
        // if statement to check the internet connection

        return new MovieData();
    }
}
