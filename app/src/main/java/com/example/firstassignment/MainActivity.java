package com.example.firstassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.firstassignment.Model.IMovie;
import com.example.firstassignment.Model.Movie;
import com.example.firstassignment.Model.MovieFactory;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner spinner;
    private EditText txtSearch;
    private EditText ReasultSearch;
    private Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        ReasultSearch = findViewById(R.id.ReasultSearch);
        txtSearch = findViewById(R.id.txtSearch);
        populateSpinner();
    }

    private void populateSpinner() {
        MovieFactory factory = new MovieFactory();
        IMovie objBook = factory.getModel();

        String[] movies = objBook.getCategories();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, movies);

        spinner.setAdapter(adapter);



    }
    public void onClickSearch(View view) {
        MovieFactory factory = new MovieFactory();
        IMovie objMovie = factory.getModel();

        String item  = "";

        item = spinner.getSelectedItem().toString();

        List<Movie> moviesList = objMovie.getMovies(item);

        String str = "";
        for(Movie b:moviesList){
            str+=b.getTitle() + "\n";
        }
        ReasultSearch.setText(str);
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }
}