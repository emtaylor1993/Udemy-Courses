# Part 1

From the `Java Bootcamp Resources`, launch **`Part 1`**.

![1.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F85391d27-5dd8-4a8b-9a15-271f727a3ca6?alt=media&token=4f1b90ab-38ed-4272-abff-b4bcb4c59f87)


## Task 1

Create a new file named `Magazine.java`. Inside the file, create the Magazine class.

```java
public class Magazine {

}

```

The Magazine class will define the following fields:

```java
    private String title;
    private String publisher;
    private int issueNumber;
    private int publicationYear;
```

## Task 2
Create getter and setter methods for each field of the `Magazine` class. Ensure that the setter methods perform the following argument validations and throw an `IllegalArgumentException` with an appropriate error message if the input is invalid:

- `setTitle` method:

     - Check if the input `title` is `null` or `blank`.
     - If the validation fails, throw an `IllegalArgumentException` with the message `"Title cannot be null or blank."`

- `setPublisher` method:
    - Check if the input `publisher` is null or `blank`.
    - If the validation fails, throw an `IllegalArgumentException` with the message `"Publisher cannot be null or blank."`

- `setIssueNumber` method:

  - Check if the input `issueNumber` is less than or equal to `0`.
  - If the validation fails, throw an `IllegalArgumentException` with the message `"Issue number must be greater than 0."`

- `setPublicationYear` method:

  - Check if the input `publicationYear` is less than or equal to 0.
  - If the validation fails, throw an `IllegalArgumentException` with the message `"Publication year must be greater than 0."`


After implementing the setter methods with the appropriate validations, create the corresponding getter methods for each field.



## Task 3
Create a constructor that initializes the fields of a newly created object by calling the setter methods.

```java
public Magazine(String title, String publisher, int issueNumber, int publicationYear) {
    setTitle(title);
    setPublisher(publisher);
    setIssueNumber(issueNumber);
    setPublicationYear(publicationYear);
}
```
Using the setter methods in the constructor ensures that the argument validation is performed in a single place, keeping the code DRY (Don't Repeat Yourself).

## Task 4
Test your constructor and getter/setter methods by creating instances (objects) of the Magazine class. Uncomment each test one by one to ensure that the methods throw an `IllegalArgumentException` when the input is invalid. Remember to re-comment the test before moving on to the next one.



```java
public static void main(String[] args) {
    Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
    System.out.println(magazine1.getTitle());

    // Uncomment the following line to test invalid input for setTitle method
    // magazine1.setTitle("");

    // Uncomment the following line to test invalid input for setPublisher method
    // magazine1.setPublisher("");

    // Uncomment the following line to test invalid input for setIssueNumber method
    // magazine1.setIssueNumber(-1);

    // Uncomment the following line to test invalid input for setPublicationYear method
    // magazine1.setPublicationYear(0);

    // Uncomment the following line to test invalid input for the constructor
    // Magazine magazine2 = new Magazine("", "Publisher 2", 2, 2020);
}
```

When testing each method, the program will throw an `IllegalArgumentException` if the input is invalid. This helps us to identify mistakes in our application and fix the issues, preventing the creation of objects with an invalid state that could lead to unexpected behavior or errors during program execution.

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4d714b6a-ae3f-4d16-8b31-70134b6710f6?alt=media&token=dd553cd9-af91-4185-b764-d504c82f628d)

## Task 1
Create a new file named `MagazineLibrary`.java. Inside the file, create the MagazineLibrary class.

```java
public class MagazineLibrary {

}
```

The MagazineLibrary class will define the following field:

```java
    private ArrayList<Magazine> magazines;
```

## Task 2
Create a constructor for the `MagazineLibrary` class that initializes the `magazines` field to an empty ArrayList.

## Task 3
Create a `getMagazine` method that takes an index as a parameter and returns a deep copy of the Magazine object at that index.


**Hint**: You must return to the `Magazine` class and give it a copy constructor. 

## Task 4
Create a `setMagazine` method that takes a Magazine object and an index as parameters and sets the Magazine object at the specified index to a deep copy of the given object.

## Task 5
Create an `addMagazine` method that takes a Magazine object as a parameter and adds a deep copy of the object to the magazines `ArrayList`.

## Task 6
Test the `MagazineLibrary` class by creating a few `Magazine` objects, initializing a `MagazineLibrary` object with those magazines, and then using the `getMagazine`, `setMagazine`, and `addMagazine` methods to manipulate the magazines.

```java
public static void main(String[] args) {
    Magazine magazine1 = new Magazine("Magazine 1", "Publisher 1", 1, 2020);
    Magazine magazine2 = new Magazine("Magazine 2", "Publisher 2", 2, 2021);

    MagazineLibrary library = new MagazineLibrary();
    
    // Test the addMagazine method
    library.addMagazine(magazine1);
    library.addMagazine(magazine2);

    // Test the getMagazine method
    Magazine retrievedMagazine = library.getMagazine(0);
    System.out.println(retrievedMagazine.getTitle());

    // Test the setMagazine method
    Magazine newMagazine = new Magazine("Magazine 3", "Publisher 3", 3, 2022);
    library.setMagazine(newMagazine, 0);

    // Verify that the magazine was updated
    retrievedMagazine = library.getMagazine(0);
    System.out.println(retrievedMagazine.getTitle());
}
```

## Task 7
Use breakpoints to inspect how the `MagazineLibrary` class manages the `ArrayList` of `Magazine` objects with deep copying when using the `getMagazine`, `setMagazine`, and `addMagazine` methods.

# Part 3

From the `Java Bootcamp Resources`, launch **`Part 3`**.

![3.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb482a4c6-07ab-4d4b-94a6-f3f2f662d3ea?alt=media&token=fdb5d33b-1e9f-412f-9353-e2a54e897162)

## Task 1
Inside the Main class, create a method called `isNullOrBlank` that takes a `String` input and returns `true` if the input is `null` or `blank`.


```java
public static boolean isNullOrBlank(String input) {
    // TODO
}
```

## Task 2

Create a method called `incorrectIssueNumber` that takes an `int` input and returns `true` if the input is less than or equal to 0.

```java
public static boolean incorrectIssueNumber(int issueNumber) {
    // TODO
}
```

## Task 3
Create a method called `incorrectPublicationYear` that takes an `int` input and returns `true` if the input is less than or equal to `0`.

```java
public static boolean incorrectPublicationYear(int publicationYear) {
    // TODO
}
```

## Task 4
Create a method called `promptForTitle` that takes a `Scanner` input and returns a valid `title` entered by the user.

```java
public static String promptForTitle(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid title: ");
        String title = scanner.nextLine();
        // TODO
    }
}
```
## Task 5
Create a method called `promptForPublisher` that takes a `Scanner` input and returns a valid publisher entered by the user.

```java
public static String promptForPublisher(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid publisher: ");
        String publisher = scanner.nextLine();
        // TODO
    }
}
```

## Task 6

Create a method called `promptForIssueNumber` that takes a `Scanner` input and returns a valid issue number entered by the user.

```java
public static int promptForIssueNumber(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid issue number (greater than 0): ");
        // First check if the next input is not an integer
              // scanner.next();
              // continue;
 
        int issueNumber = scanner.nextInt();
        // TODO
    }
}
```
## Task 7
Create a method called `promptForPublicationYear` that takes a Scanner input and returns a valid publication year entered by the user.

```java
public static int promptForPublicationYear(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid publication year (greater than 0): ");
        // First check if the next input is not an integer
              // scanner.next();
              // continue;
        int publicationYear = scanner.nextInt();
        // TODO
    }
}
```
## Task 8
Test the interactive methods in the main method.

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String title = promptForTitle(scanner);
    String publisher = promptForPublisher(scanner);
    int issueNumber = promptForIssueNumber(scanner);
    int publicationYear = promptForPublicationYear(scanner);

    Magazine newMagazine = new Magazine(title, publisher, issueNumber, publicationYear);

    MagazineLibrary library = new MagazineLibrary();
    library.addMagazine(newMagazine);

    System.out.println("Magazine added to the library: " + newMagazine.getTitle());
}
```
