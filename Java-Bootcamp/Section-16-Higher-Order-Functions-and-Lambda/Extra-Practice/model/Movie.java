/**
 * MOVIE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Movie object.
 * 
 * @packages
 *    None
 */

package model;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private int year;
    private double rating;

    /**
     * Function Name: Movie
     * @param title    (String)
     * @param director (String)
     * @param genre    (String)
     * @param year     (int)
     * @param rating   (double)
     * 
     * Constructor for the Movie object.
     */
    public Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    /**
     * Function Name: Movie
     * @param source (Movie)
     * 
     * Copy constructor for the Movie object.
     */
    public Movie(Movie source) {
        this.title = source.title;
        this.director = source.director;
        this.genre = source.genre;
        this.year = source.year;
        this.rating = source.rating;
    }

    /**
     * Function Name: getTitle
     * @return (String)
     * 
     * Getter for the title attribute.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Function Name: setTitle
     * @param title (String)
     * 
     * Setter for the title attribute.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Function Name: getDirector
     * @return (String)
     * 
     * Getter for the director attribute.
     */
    public String getDirector() {
        return this.director;
    }

    /**
     * Function Name: setDirector
     * @param director (String)
     * 
     * Setter for the director attribute.
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * Function Name: getGenre
     * @return (String)
     * 
     * Getter for the genre attribute.
     */
    public String getGenre() {
        return this.genre;
    }

    /**
     * Function Name: setGenre
     * @param genre (String)
     * 
     * Setter for the genre attribute.
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Function Name: getYear
     * @return (int)
     * 
     * Getter for the year attribute.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Function Name: setYear
     * @param year (int)
     * 
     * Setter for the year attribute.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Function Name: getRating
     * @return (double)
     * 
     * Getter for the rating attribute.
     */
    public double getRating() {
        return this.rating;
    }

    /**
     * Function Name: setRating
     * @param rating (double)
     * 
     * Setter for the rating attribute.
     */
    public void setRating(double rating) {
        this.rating = rating;
    }

    /**
     * Function Name: toString
     * 
     * toString method for the Movie class.
     */
    @Override
    public String toString() {
        return title + " (" + year + ") - Directed by " + director + ", Genre: " + genre + ", Rating: " + rating;
    }
}
