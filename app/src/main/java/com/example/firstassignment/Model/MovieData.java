package com.example.firstassignment.Model;

import java.util.ArrayList;
import java.util.List;

public class MovieData implements IMovie{
    private ArrayList<Movie> movies = new ArrayList<>();

    public MovieData(){
        movies.add(new Movie("Titanic", 2005,
                "Romantic"));
        movies.add(new Movie("Tent", 2010,
                "Action"));
                movies.add(new Movie("The New Mutants", 2015,
                "Horror"));
                movies.add(new Movie("Once upon a Time In Hollywood", 2019,
                "Action"));
                movies.add(new Movie("Booksmart", 2019,
                "Comedy"));
                movies.add(new Movie("Mission Impossible 6", 2018,
                "Action"));
                movies.add(new Movie("A Quiet Place", 2018,
                "Horror"));
                movies.add(new Movie("A Star is Born", 2018,
                "Music"));

//        movies.add(new Movie("Titanic", 2005,
//                "Romantic","https://www.onthisday.com/images/articles/titanic-the-movie.jpg"));
//        movies.add(new Movie("Tent", 2010,
//                "Action","https://i.ytimg.com/vi/7D-DVVS0ISY/movieposter.jpg"));
//        movies.add(new Movie("The New Mutants", 2015,
//                "Horror","https://upload.wikimedia.org/wikipedia/en/1/1a/TheNewMutantsPoster.jpeg"));
//        movies.add(new Movie("Once upon a Time In Hollywood", 2019,
//                "Action","https://upload.wikimedia.org/wikipedia/en/a/a6/Once_Upon_a_Time_in_Hollywood_poster.png"));
//        movies.add(new Movie("Booksmart", 2019,
//                "Comedy","https://lh3.googleusercontent.com/POuB1kZoQRKY-W-A8zkLYoucdDWJDoIhao-FMYMyfbzp7wlMNi0dRTDkcE_APsE8aFc"));
//        movies.add(new Movie("Mission Impossible 6", 2018,
//                "Action","https://i.pinimg.com/originals/2e/5b/8b/2e5b8b138d189752f18672c464455885.jpg"));
//        movies.add(new Movie("A Quiet Place", 2018,
//                "Horror","https://upload.wikimedia.org/wikipedia/en/a/a0/A_Quiet_Place_film_poster.png"));
//        movies.add(new Movie("A Star is Born", 2018,
//                "Music","https://upload.wikimedia.org/wikipedia/en/3/39/A_Star_is_Born.png"));


    }

    public List<Movie> getMovies(String searchData){

        ArrayList<Movie> data = new ArrayList<>();
        for(Movie b : movies){
            if(b.getMovieGenre().equals(searchData)){
                data.add(b);
            }
        }
        return data;
    }

    @Override
    public String[] getTitles() {
        String[] titles = new String[movies.size()];

        for (int i = 0; i <movies.size(); i++) {
            for (int j = 0; j < titles.length ; j++) {
                Movie movie = movies.get(i);
                titles[j]= String.valueOf(movie.getTitle());
            }
        }

        return titles;
    }

    @Override
    public int[] getYear() {
        int[] Years = new int[movies.size()];
        Movie movie=new Movie();
        for (int i = 0; i <movies.size(); i++) {
            for (int j = 0; j < Years.length ; j++) {
                movie = movies.get(i);
                Years[j]= Integer.parseInt(String.valueOf(movie.getYear()));
            }
        }
        return Years;
    }

    @Override
    public String[] getMovieGenres() {
        String[] movieGenre = new String[movies.size()];
        Movie movie;

        for (int i = 0; i <movies.size(); i++) {
            for (int j = 0; j < movieGenre.length ; j++) {
                movie = movies.get(i);
                movieGenre[j]= String.valueOf(movie.getMovieGenre());
            }
        }
        return movieGenre;
    }

    @Override
    public String[] getCategories() {
        String[] cats = new String[]{"Romantic", "Action", "Music","Horror","Comedy"};
        return cats;
    }

}
