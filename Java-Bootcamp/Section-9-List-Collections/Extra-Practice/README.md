#  List Collections - Extra Practice

From the `Java Bootcamp Resources`, launch **`Part 1`**.

![1.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F995797a5-9b4c-4d77-a8f9-9c2b364e7f85?alt=media&token=ebf6ecea-753a-47e1-a694-0964cf811716)

## Task 1

Create a new file named `Book.java`. Inside the file, create the Book class.

```java
public class Book {

}
```
The `Book` class will define the following fields:

```java
    private String title;
    private String author;
    private double rating;
    private double price;
```
The Book class serves as a blueprint for creating Book objects.

## Task 2

Create a constructor that initializes the fields of a newly created object.


## Task 3

Create a constructor that initializes a new object using an existing object's fields.

## Task 4
Create getter and setter methods for each field of the Book class.

## Task 5
Test your constructor and getter/setter methods by creating instances (objects) of the Book class.

```java
public static void main(String[] args) {
    Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
    Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
    Book book3 = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
    Book book4 = new Book("Pride and Prejudice", "Jane Austen", 4.25, 10.99);
}
```

## Task 6
Test the copy constructor by creating two objects with fields copied from two existing objects.

```java
public static void main(String[] args) {
    // Assuming the Book objects from Task 5 are available
    Book copyBook1 = new Book(book1);
    Book copyBook2 = new Book(book3);
}
```
## Task 7

Use breakpoints to inspect field initialization in the new objects created using the copy constructor and verify the getter/setter methods are working correctly.

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4d714b6a-ae3f-4d16-8b31-70134b6710f6?alt=media&token=dd553cd9-af91-4185-b764-d504c82f628d)

## Task 1
Create a new file named `Store.java`. Inside the file, create the Store class.

```java
public class Store {

}
```

The `Store` class will define the following field:

```java
    private ArrayList<Book> books;
```

## Task 2
Create a constructor for the `Store` class that initializes an empty `ArrayList` of `Book` objects.

## Task 3
Create a `getBook` method that takes an index as a parameter and returns a deep copy of the `Book` object at that index.


## Task 4
Create a `setBook` method that takes a `Book` object and an index as parameters and sets the `Book` object at the specified index to a deep copy of the given object.

## Task 5

Create an `addBook` method that takes a `Book` object as a parameter and adds a deep copy of the given object to the books `ArrayList`.

## Task 6
Create a `contains` method that takes a `Book` object as a parameter and returns `true` if the books ArrayList contains the given object, `false` otherwise.

```java
public boolean contains(Book book) {
    return this.books.contains(book);
}
```
**Hint**: do not forget about the `equals` method.
## Task 7
Create a `sellBook` method that takes a `String` title as a parameter and removes the `Book` object with the specified title from the `books` `ArrayList`.

## Task 8
Test the `Store` class by creating a few `Book` objects, initializing a `Store` object with those books, and then using the `getBook`, `setBook`, `addBook`, `contains`, and `sellBook` methods to manipulate the books. Use breakpoints to visualize the runtime.

```java
    public static void main(String[] args) {
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee", 4.27, 15.99);
        Book book2 = new Book("1984", "George Orwell", 4.17, 12.99);
    
        Store store = new Store();
        store.addBook(book1);
        store.addBook(book2);
    
        // Test the getBook method
        Book retrievedBook = store.getBook(0);
        System.out.println(retrievedBook.getTitle());
    
        // Test the setBook method
        Book newBook = new Book("Moby-Dick", "Herman Melville", 3.5, 14.99);
        store.setBook(0, newBook);
    
        // Verify that the book was updated
        retrievedBook = store.getBook(0);
        System.out.println(retrievedBook.getTitle());
    
        // Test the contains method
        System.out.println(store.contains(book2)); // should be true before selling the book
    
        // Test the sellBook method
        store.sellBook("1984");
        System.out.println(store.contains(book2)); // should be false now
    
    }
```

## Task 9

If everything works, feel free to create a fun app from your objects by introducing user interactivity!
