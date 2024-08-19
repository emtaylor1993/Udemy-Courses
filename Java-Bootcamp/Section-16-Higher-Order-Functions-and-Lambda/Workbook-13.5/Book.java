/**
 * BOOK
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Book class.
 * 
 * @packages
 *    None
 */

public class Book {
    private String title;
    private String genre;
    private Integer year;
    private Double price;

    /**
     * Function Name: Book
     * @param title (String)
     * @param genre (String)
     * @param year  (int)
     * @param price (double)
     * 
     * Constructor for the Book object.
     */
    public Book(String title, String genre, int year, double price) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.price = price;
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
     * @return (Integer)
     * 
     * Getter for the year attribute.
     */
    public Integer getYear() {
        return this.year;
    }

    /**
     * Function Name: setYear
     * @param year (Integer)
     * 
     * Setter for the year attribute.
     */
    public void setYear(Integer year) {
        this.year = year;
    }

    /**
     * Function Name: getPrice
     * @return (Double)
     * 
     * Getter for the price attribute.
     */
    public Double getPrice() {
        return this.price;
    }

    /**
     * Function Name: setPrice
     * @param price (double)
     * 
     * Setter for the price attribute.
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    /**
     * Function Name: toString
     * 
     * toString method for the Book class.
     */
    public String toString() {
        return this.genre + "  " + this.year + "  $" + this.price + "  " + this.title;
    }
}