/**
 * STORE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Store object.
 * 
 * @packages
 *    None
 */

public class Store {
    private Movie[] movies;

    /**
     * Function Name: Store
     * 
     * Constructor that creates a store containing 10 movies.
     */
    public Store() {
        this.movies = new Movie[10];
    }

    /**
     * Function Name: getMovie
     * @param index (int)
     * @return      (Movie)
     * 
     * Getter for the Movie class.
     */
    public Movie getMovie(int index) {
        return new Movie(this.movies[index]);
    }

    /**
     * Function Name: setMovie
     * @param index (int)
     * @param movie (Movie)
     * 
     * Setter for the Movie class.
     */
    public void setMovie(int index, Movie movie) {
        this.movies[index] = new Movie(movie);
    }

    /**
     * Function Name: toString
     * 
     * toString function for the Store class.
     */
    public String toString() {
        String temp = "";
        for (Movie movie : movies) {
            temp += movie.toString() + "\n";
        }
        return temp;
    }
}