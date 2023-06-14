# Part 1

From the `Java Bootcamp Resources`, launch **`Part 1`**.

![1.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F995797a5-9b4c-4d77-a8f9-9c2b364e7f85?alt=media&token=ebf6ecea-753a-47e1-a694-0964cf811716)

## Task 1

Add the following fields to the `Movie` class.
```java
    private String name;
    private String format;
    private double rating;
```
Then create a constructor, copy constructor, getters, and setters.

## Task 2

Create a `toString` method that returns the following `String`.
```java
    return this.rating + "\t" + this.format + "\t\t" + this.name + "";
```

## Task 3

Populate the array inside `main()` with the following `Movie` objects.
```java
new Movie("The Shawshank Redemption", "BlueRay", 9.2),
new Movie("The Godfather", "BlueRay", 9.1),
new Movie("The Godfather: Part II", "DVD", 9.0),
new Movie("The Dark Knight", "BlueRay", 9.0),
new Movie("Schindler's List", "DVD", 8.9),
new Movie("The Lord of the Rings: The Return of the King", "BlueRay", 8.9),
new Movie("Pulp Fiction", "DVD", 8.8),
new Movie("The Lord of the Rings: The Fellowship of the Ring", "DVD", 8.8)
```

## Final Output

```java
********************************MOVIE STORE*******************************
9.2     BlueRay         The Shawshank Redemption
9.1     BlueRay         The Godfather
9.0     DVD             The Godfather: Part II
9.0     BlueRay         The Dark Knight
8.9     DVD             Schindlers List
8.9     BlueRay         The Lord of the Rings: The Return of the King
8.8     DVD             Pulp Fiction
8.8     DVD             The Lord of the Rings: The Fellowship of the Ring
```

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4d714b6a-ae3f-4d16-8b31-70134b6710f6?alt=media&token=dd553cd9-af91-4185-b764-d504c82f628d)

## Task 1

The `Store` constructor must grant `this.movies` the capacity to store 10 elements.

```java
    public Store() {
        // TODO
    }
```
## Task 2

The getter must return a **`new`** copy of the `Movie` object being requested.

```java
    public Movie getMovie(int index) {
        // TODO 
        return null;
    }
```

## Task 3

The setter must update the array with a **`new`** copy of the `Movie` object.

```java
    public void setMovie(int index, Movie movie) {
        // TODO 
    }
```

## Task 4

Inside `main()`, populate the store (defined on top) with movies before printing it.

```java
********************************MOVIE STORE*******************************
9.2     BlueRay         The Shawshank Redemption
9.1     BlueRay         The Godfather
9.0     DVD             The Godfather: Part II
9.0     BlueRay         The Dark Knight
8.9     DVD             Schindlers List
8.9     BlueRay         The Lord of the Rings: The Return of the King
8.8     DVD             Pulp Fiction
8.8     DVD             The Lord of the Rings: The Fellowship of the Ring
```

# Part 3

From the `Java Bootcamp Resources`, launch **`Part 3`**.

![3.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb482a4c6-07ab-4d4b-94a6-f3f2f662d3ea?alt=media&token=fdb5d33b-1e9f-412f-9353-e2a54e897162)

## Initial Output

A while loop keeps running while the user enters the `String` `continue`.

```java
********************************MOVIE STORE*******************************
9.2     BlueRay         The Shawshank Redemption
9.1     BlueRay         The Godfather
9.0     DVD             The Godfather: Part II
8.9     DVD             12 Angry Men
9.0     BlueRay         The Dark Knight
8.9     DVD             Schindlers List
8.9     BlueRay         The Lord of the Rings: The Return of the King
8.8     DVD             Pulp Fiction
8.8     DVD             The Good, the Bad and the Ugly
8.8     DVD             The Lord of the Rings: The Fellowship of the Ring

To edit another rating, type: 'continue': continue
To edit another rating, type: 'continue': continue
To edit another rating, type: 'continue': stop
```
The code uses `next()` instead of `nextLine()` to pick up the next `String`.

## Task 1

Add code that prompts the user to enter an integer.
```java
    System.out.print("\nPlease choose an integer between 0 - 9: ");
    // grab nextInt()
```

```java
********************************MOVIE STORE*******************************
9.2     BlueRay         The Shawshank Redemption
9.1     BlueRay         The Godfather
9.0     DVD             The Godfather: Part II
8.9     DVD             12 Angry Men
9.0     BlueRay         The Dark Knight
8.9     DVD             Schindlers List
8.9     BlueRay         The Lord of the Rings: The Return of the King
8.8     DVD             Pulp Fiction
8.8     DVD             The Good, the Bad and the Ugly
8.8     DVD             The Lord of the Rings: The Fellowship of the Ring


Please choose an integer between 0 - 9: 4
```
## Task 2

Grab a movie from the store based on the user input.

## Task 3

Add code that prompts the user to enter a rating for the movie.

```java
    System.out.print("Set a new rating for " + movie.getName() + ": ");
    // grab nextDouble()
```

```
********************************MOVIE STORE*******************************
9.2     BlueRay         The Shawshank Redemption
9.1     BlueRay         The Godfather
9.0     DVD             The Godfather: Part II
8.9     DVD             12 Angry Men
9.0     BlueRay         The Dark Knight
8.9     DVD             Schindlers List
8.9     BlueRay         The Lord of the Rings: The Return of the King
8.8     DVD             Pulp Fiction
8.8     DVD             The Good, the Bad and the Ugly
8.8     DVD             The Lord of the Rings: The Fellowship of the Ring


Please choose an integer between 0 - 9: 4

Set a new rating for The Dark Knight: 5.8
```

## Task 4

Update the store, and print the updated store.

```java
    store.setMovie(choice, movie);
    printStore();
```

## Final Output

```
********************************MOVIE STORE*******************************
9.2     BlueRay         The Shawshank Redemption
9.1     BlueRay         The Godfather
9.0     DVD             The Godfather: Part II
8.9     DVD             12 Angry Men
9.0     BlueRay         The Dark Knight
8.9     DVD             Schindler's List
8.9     BlueRay         The Lord of the Rings: The Return of the King
8.8     DVD             Pulp Fiction
8.8     DVD             The Good, the Bad and the Ugly
8.8     DVD             The Lord of the Rings: The Fellowship of the Ring


Please choose an integer between 0 - 9: 5
Set a new rating for Schindler's List: 9.8

********************************MOVIE STORE*******************************
9.2     BlueRay         The Shawshank Redemption
9.1     BlueRay         The Godfather
9.0     DVD             The Godfather: Part II
8.9     DVD             12 Angry Men
9.0     BlueRay         The Dark Knight
9.8     DVD             Schindler's List
8.9     BlueRay         The Lord of the Rings: The Return of the King
8.8     DVD             Pulp Fiction
8.8     DVD             The Good, the Bad and the Ugly
8.8     DVD             The Lord of the Rings: The Fellowship of the Ring

To edit another rating, type: 'continue': stop
```
