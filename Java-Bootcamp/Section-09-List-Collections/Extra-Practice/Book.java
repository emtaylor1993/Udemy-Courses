/**
 * BOOK
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Book object.
 * 
 * @packages
 *    Java Utilities (Objects)
 */

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private double rating;
    private double price;

    /**
     * Function Name: Book
     * @param title  (String)
     * @param author (String)
     * @param rating (double)
     * @param price  (double)
     * 
     * Constructor for the Book object.
     */
    public Book(String title, String author, double rating, double price) {
        this.title = title;
        this.author = author;
        this.rating = rating;
        this.price = price;
    }

    /**
     * Function Name: Book
     * @param source (Book)
     * 
     * Copy Constructor for the Book object.
     */
    public Book(Book source) {
        this.title = source.title;
        this.author = source.author;
        this.rating = source.rating;
        this.price = source.price;
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
     * Function Name: getAuthor
     * @return (String)
     * 
     * Getter for the author attribute.
     */
    public String getAuthor() {
        return this.author;
    }

    /**
     * Function Name: setAuthor
     * @param author (String)
     * 
     * Setter for the author attribute.
     */
    public void setAuthor(String author) {
        this.author = author;
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
     * Function Name: getPrice
     * @return (double)
     * 
     * Getter for the price attribute.
     */
    public double getPrice() {
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
     * Function Name: equals
     * @param o (Object)
     * 
     * Checks whether the Object is equal.
     */
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && rating == book.rating && price == book.price;
    }
}
