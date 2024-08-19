/**
 * MOVIE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Movie object.
 * 
 * @packages
 *    None
 */

public class Movie {
    private String name;
    private String format;
    private double rating;

    /**
     * Function Name: Movie
     * @param name   (String)
     * @param format (String)
     * @param rating (double)
     * 
     * Constructor for the movie object.
     */
    public Movie(String name, String format, double rating) {
        this.name = name;
        this.format = format;
        this.rating = rating;
    }

    /**
     * Function Name: Movie
     * @param source (Movie)
     * 
     * Copy constructor for the movie object.
     */
    public Movie(Movie source) {
        this.name = source.name;
        this.format = source.format;
        this.rating = source.rating;
    }

    /**
     * Function Name: getName
     * @return (String)
     * 
     * Getter for the name attribute.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Function Name: setName
     * @param name (String)
     * 
     * Setter for the name attribute.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Function Name: getFormat
     * @return String
     * 
     * Getter for the format attribute.
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * Function Name: setFormat
     * @param format (String)
     * 
     * Setter for the format attribute.
     */
    public void setFormat(String format) {
        this.format = format;
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
     * toString function for the Movie class.
     */
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }
}
