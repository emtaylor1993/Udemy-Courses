/**
 * MOVIE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Movie class.
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
     * Constructor for the Movie object.
     */
    public Movie(String name, String format, double rating) {
        setName(name);
        setFormat(format);
        setRating(rating);
    }

    /**
     * Function Name: Movie
     * @param source (Movie)
     * 
     * Copy constructor for the Movie object.
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
        return name;
    }

    /**
     * Function Name: setName
     * @param name (String)
     * 
     * Setter for the name attribute.
     */
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("The name cannot be null or blank.");
        }
        this.name = name;
    }
    
    /**
     * Function Name: getFormat
     * @return (String)
     * 
     * Getter for the format attribute.
     */
    public String getFormat() {
        return format;
    }

    /**
     * Function Name: setFormat
     * @param format (String)
     * 
     * Setter for the format attribute.
     */
    public void setFormat(String format) {
        if (format == null || format.isBlank()) {
            throw new IllegalArgumentException("The format cannot be null or blank.");
        }
        this.format = format;
    }

    /**
     * Function Name: getRating
     * @return (double)
     * 
     * Getter for the rating attribute.
     */
    public double getRating() {
        return rating;
    }

    /**
     * Function Name: setRating
     * @param rating (double)
     * 
     * Setter for the rating attribute.
     */
    public void setRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("The rating cannot be less than 0 or greater than 10.");
        }
        this.rating = rating;
    }

    /**
     * Function Name: toString
     * @return (String)
     * 
     * toString method for the Movie class.
     */
    public String toString() {
        return this.rating + "\t" + this.format + "\t\t" + this.name + "";
    }    
}