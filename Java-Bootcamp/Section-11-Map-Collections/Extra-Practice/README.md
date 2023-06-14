# Part 1

From the `Java Bootcamp Resources`, launch **`Part 1`**.

![1.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F85391d27-5dd8-4a8b-9a15-271f727a3ca6?alt=media&token=4f1b90ab-38ed-4272-abff-b4bcb4c59f87)


## Task 1
Create a new file named `City.java`. Inside the file, create the City class.

```java
public class City {

}
```
The City class will define the following fields:

```java
    private String name;
    private String country;
    private long population;
```

## Task 2
Create getter and setter methods for each field of the `City` class. Ensure that the setter methods perform the following argument validations and throw an `IllegalArgumentException` with an appropriate error message if the input is invalid:

- `setName` method:

   - Check if the input `name` is `null` or `blank`.
   - If the validation fails, throw an `IllegalArgumentException` with the message `"Name cannot be null or blank."`

- `setCountry` method:

   - Check if the input `country` is `null` or `blank`.
   - If the validation fails, throw an `IllegalArgumentException` with the message `"Country cannot be null or blank."`

 - `setPopulation` method:

    - Check if the input `population` is less than or equal to 0.
    - If the validation fails, throw an `IllegalArgumentException` with the message `"Population must be greater than 0."`

After implementing the setter methods with the appropriate validations, create the corresponding getter methods for each field.

## Task 3
Create a constructor that initializes the fields of a newly created object by calling the setter methods.

``` java
public City(String name, String country, long population) {
    setName(name);
    setCountry(country);
    setPopulation(population);
}
```

Using the setter methods in the constructor ensures that the argument validation is performed in a single place, keeping the code DRY (Don't Repeat Yourself).

## Task 4
Test your constructor and getter/setter methods by creating instances (objects) of the City class. Uncomment each test one by one to ensure that the methods throw an `IllegalArgumentException` when the input is invalid. Remember to re-comment the test before moving on to the next one.

```java
public static void main(String[] args) {
    City city1 = new City("New York", "USA", 8500000);
    System.out.println(city1.getName());

    // Uncomment the following line to test invalid input for setName method
    // city1.setName("");

    // Uncomment the following line to test invalid input for setCountry method
    // city1.setCountry("");

    // Uncomment the following line to test invalid input for setPopulation method
    // city1.setPopulation(-1);

    // Uncomment the following line to test invalid input for the constructor
    // City city2 = new City("", "USA", 8500000);
}
```
When testing each method, the program will throw an `IllegalArgumentException` if the input is invalid. This helps us to identify mistakes in our application and fix the issues, preventing the creation of objects with an invalid state that could lead to unexpected behavior or errors during program execution.

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4d714b6a-ae3f-4d16-8b31-70134b6710f6?alt=media&token=dd553cd9-af91-4185-b764-d504c82f628d)


## Task 1
Create a new file named `CityPopulationTracker.java`. Inside the file, create the `CityPopulationTracker` class.

```java
public class CityPopulationTracker {

}
```

The `CityPopulationTracker` class will define the following field:

```java
    private HashMap<String, City> cityPopulations;
```

## Task 2
Create a constructor for the `CityPopulationTracker` class that initializes the `cityPopulations` field to an empty `HashMap`.

## Task 3
Create a `getCity` method that takes a `city` name as a parameter and returns a deep copy of the `City` object associated with that city.

## Task 4
Create a `setCity` method that takes a `City` object as a parameter, and sets a deep copy of the `City` object in the `HashMap` with the corresponding city name as the key.

## Task 5
Create an `addCity` method that takes a `City` object as a parameter, and adds a deep copy of the `City` object to the `HashMap` with the corresponding city name as the key.

## Task 6
Test the `CityPopulationTracker` class by adding a few `City` objects, and then use the `getCity`, `setCity`, and `addCity` methods to manipulate the city data.

```java
public static void main(String[] args) {
    CityPopulationTracker tracker = new CityPopulationTracker();
    
    // Test the addCity method
    tracker.addCity(new City("New York", "USA", 8550405));
    tracker.addCity(new City("Los Angeles", "USA", 3971883));

    // Test the getCity method
    City nyCity = tracker.getCity("New York");
    System.out.println("Population of New York: " + nyCity.getPopulation());

    // Test the setCity method
    City updatedNyCity = new City("New York", "USA", 8600000);
    tracker.setCity(updatedNyCity);

    // Verify that the city data was updated
    nyCity = tracker.getCity("New York");
    System.out.println("Updated population of New York: " + nyCity.getPopulation());
}
```

## Task 7
Use breakpoints to inspect how the `CityPopulationTracker` class manages the `HashMap` of city names and `City` objects with deep copying when using the `getCity`, `setCity`, and `addCity` methods.

# Part 3

From the `Java Bootcamp Resources`, launch **`Part 3`**.

![3.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb482a4c6-07ab-4d4b-94a6-f3f2f662d3ea?alt=media&token=fdb5d33b-1e9f-412f-9353-e2a54e897162)


## Task 1

Inside the `Main` class, create a method called `isNullOrBlank` that takes a `String` input and returns `true` if the input is `null` or `blank`.

```java
public static boolean isNullOrBlank(String input) {
    // TODO
}
```
## Task 2

Create a method called `incorrectPopulation` that takes an `int` input and `returns` `true` if the input is less than or equal to 0.

```java
public static boolean incorrectPopulation(int population) {
    // TODO
}
```
## Task 3
Create a method called `promptForCityName` that takes a `Scanner` input and returns a valid city name entered by the user.

```java
public static String promptForCityName(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid city name: ");
        String cityName = scanner.nextLine();
        // TODO
    }
}
```

## Task 4
Create a method called `promptForCountry` that takes a `Scanner` input and returns a valid country entered by the user.

```java
public static String promptForCountry(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid country: ");
        String country = scanner.nextLine();
        // TODO
    }
}
```
## Task 5
Create a method called `promptForPopulation` that takes a `Scanner` input and returns a valid population entered by the user.

```java
public static int promptForPopulation(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid population (greater than 0): ");
        // First check if the next input is not an integer
              // scanner.next();
              // continue;

        int population = scanner.nextInt();
        // TODO
    }
}
```

## Task 6
Test the interactive methods in the main method.

```java
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);

        String country = promptForCountry(scanner);

        int population = promptForPopulation(scanner);

        City newCity = new City(cityName, country, population);

        CityPopulationTracker tracker = new CityPopulationTracker();
        tracker.addCity(newCity);

        System.out.println("City added to the tracker: " + newCity.getName());
}
```
