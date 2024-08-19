/**
 * MOVIE STORE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Movie Store object.
 * 
 * @packages
 *    Java Utilities (ArrayList, List)
 */

package model;

import java.util.ArrayList;
import java.util.List;

public class MovieStore {
    private List<Movie> movies;

    /**
     * Function Name: MovieStore
     * 
     * Constructor for the MovieStore object.
     */
    public MovieStore() {
        this.movies = new ArrayList<>();
    }

    /**
     * Function Name: addMovie
     * @param movie (Movie)
     * 
     * Adds the Movie object to the list.
     */
    public void addMovie(Movie movie) {
        this.movies.add(new Movie(movie));
    }

    /**
     * Function Name: filterByGenre
     * @param genre (String)
     * @return      (List<Movie>)
     * 
     * Filters movies based on the genre.
     */
    public List<Movie> filterByGenre(String genre) {
        return this.movies.stream()
            .filter(movie -> movie.getGenre().equals(genre))
            .toList();
    }

    /**
     * Function Name: sortByReleaseYear
     * @return (List<Movie>)
     * 
     * Sorts movies by release year.
     */
    public List<Movie> sortByReleaseYear() {
        return this.movies.stream()
            .sorted((movie1, movie2) -> Integer.compare(movie1.getYear(), movie2.getYear()))
            .toList();
    }

    /**
     * Function Name: getTopRatedMovies
     * @param n (int)
     * @return  (List<Movie>)
     * 
     * Gets the top rated movies.
     */
    public List<Movie> getTopRatedMovies(int n) {
        return this.movies.stream()
            .sorted((movie1, movie2) -> Double.compare(movie1.getRating(), movie2.getRating()))
            .limit(n)
            .toList();
    }
}
