/**
 * STORE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Store object.
 * 
 * @packages
 *    Java Utilities (ArrayList)
 */

import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;

    /**
     * Function Name: Store
     * 
     * Constructor for the Store object.
     */
    public Store() {
        this.books = new ArrayList<Book>();
    }

    /**
     * Function Name: getBook
     * @param index (int)
     * @return      (Book)
     * 
     * Getter for the Book attribute.
     */
    public Book getBook(int index) {
        return books.get(index);
    }

    /**
     * Function Name: setBook
     * @param index (int)
     * @param book  (Book)
     * 
     * Setter for the Book attribute.
     */
    public void setBook(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    /**
     * Function Name: addBook
     * @param book (Book)
     * 
     * Adds the book to the list.
     */
    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    /**
     * Function Name: contains
     * @param book (Book)
     * @return     (boolean)
     * 
     * Returns true if the book is in the list, false
     * otherwise.
     */
    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    /**
     * Function Name: sellBook
     * @param title (String)
     * 
     * Removes the book from the list.
     */
    public void sellBook(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (this.books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }
}
