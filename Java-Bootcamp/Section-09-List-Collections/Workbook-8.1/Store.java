/**
 * STORE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Store object.
 * 
 * @packages
 *    Java Utilities (ArrayList, List)
 */

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Movie> movies;

    /**
     * Function Name: Store
     * 
     * Constructor for the Store object.
     */
    public Store() {
        this.movies = new ArrayList<Movie>();
    }

    /**
     * Function Name: getMovie
     * @param index (int)
     * @return      (Movie)
     * 
     * Getter for the Movie attribute.
     */
    public Movie getMovie(int index) {
        return movies.get(index);
    }

    /**
     * Function Name: setMovie
     * @param index (int)
     * @param movie (Movie)
     * 
     * Setter for the Movie attribute.
     */
    public void setMovie(int index, Movie movie) {
        this.movies.set(index, movie);
    }

    /**
     * Function Name: addMovie
     * @param movie (Movie)
     * 
     * Adds the Movie to the list.
     */
    public void addMovie(Movie movie) {
        this.movies.add(movie);
    }

    /**
     * Function Name: toString
     * @return (String)
     * 
     * toString object for the Store class.
     */
    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }
}