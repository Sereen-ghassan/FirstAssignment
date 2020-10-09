package com.example.firstassignment.Model;

import java.util.List;

public interface IMovie {
        List<Movie> getMovies(String tit);
        String[] getCategories();
        String[] getTitles();
        int[] getYear();
        String[] getMovieGenres();

}
