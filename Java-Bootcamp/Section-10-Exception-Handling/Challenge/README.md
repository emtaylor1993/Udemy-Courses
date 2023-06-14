# Part 1

From the `Java Bootcamp Resources`, launch **`Part 1`**.

![1.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F85391d27-5dd8-4a8b-9a15-271f727a3ca6?alt=media&token=4f1b90ab-38ed-4272-abff-b4bcb4c59f87)


## Task 1

Validate the name that gets passed into `setName`.
```java
    public void setName(String name) {
        // TODO
    }
```
Throw an `IllegalArgumentException` if the name is `null` or `blank`.


## Task 2

Validate the format that gets passed into `setFormat`.
```java
    public void setFormat(String format) {
        // TODO
    }
```
Throw an `IllegalArgumentException` if the format is `null` or `blank`.

## Task 3

Validate the rating that gets passed into `setRating`.
```java
    public void setRating(double rating) {
        // TODO
    }
```
Throw an `IllegalArgumentException` if the rating is less than 0 or greater than 10.

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F9f9bb74e-8e83-4d10-916c-9cc3684f78a4?alt=media&token=c944ed62-a28e-4e9f-9c47-c224f13970a5)


## Task 0

The `loadMovies` method is already implemented. 
```java
     public static void loadMovies(String fileName) throws FileNotFoundException {
         // reads input from file...
     }
```

If you want to visualize its runtime, feel free to watch the video solution.

## Task 1

This method should return `true` if the choice is less than 0 or greater than 9.
```java
    public static boolean incorrectChoice(int choice) {
        // TODO
    }
```

## Task 2

This method should return `true` if the rating is less than 0 or greater than 10.
```java
    public static boolean incorrectRating(double rating) {
        // TODO
    }
```

## Task 3

The method `promptForChoice` will return the integer they choose.
```java
    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");

            int choice = scanner.nextInt();
            return choice; <--------------
        }
    }
```

**Scenario One**: `continue` the while loop if the user doesn't enter an integer.

```java
    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");

            // 1. Anticipate the user not entering an integer. <--------------

            int choice = scanner.nextInt();

            return choice; 
        }
    }
```

**Scenario Two**: `continue` the while loop if the user enters an incorrect choice.

```java
    public static int promptForChoice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease choose an integer between 0 - 9: ");

            // 1. Anticipate the user not entering an integer.

            int choice = scanner.nextInt();

            // 2. Anticipate the choice being incorrect. <--------------
            return choice; 
        }
    }
```

## Task 4

The method `promptForRating` will return the rating they choose.
```java
    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            

            double rating = scanner.nextDouble();            
            return rating; <---------
         }
    }
```

**Scenario One**: `continue` the while loop if the user doesn't enter a `double`.

```java
    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            
            // 1. Anticipate the user not entering a double. <-------------

            double rating = scanner.nextDouble();            
            
            return rating;
         }
    }
```

**Scenario Two**: `continue` the while loop if the user enters an incorrect rating.

```java
    public static double promptForRating(Scanner scanner, String name) {
        while (true) {
            System.out.print("\nSet a new rating for " + name + ": ");
            
            // 1. Anticipate the user not entering a double.

            double rating = scanner.nextDouble();
            
            // 2. Anticipate the rating being incorrect. <----------
            
            return rating;
         }
    }
```
