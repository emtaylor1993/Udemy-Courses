# Workbook 11.1

From the `Java Bootcamp Resources`, launch **`starter`**.

![starter.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F87bced44-2cd9-4db0-9a76-22125c478254?alt=media&token=7dc717de-b9d3-40c6-9ec2-32908aa28976)


## Task 1

Use the position values inside `main()` to fill up the `Position` `enum` with constants. 

```java
public enum Position {

    
}
```

## Task 2

Update the `players` field inside `Team` to store `Position` keys rather than `String`.

```java
    private Map<String, String> players;
```

## Task 3

Update `getPlayer()` to receive a `Position` enum constant rather than a `String`.
```java
    public String getPlayer(String position) <----
``` 

## Task 4
Update `setPlayer()` to receive a `Position` enum constant rather than a `String`.
```java
public void setPlayer(String position, String player)
```
The enum type is guaranteed to be one of five constants. So remove the safety mechanisms.

```java
if (!position.equals("SHOOTING_GUARD") || !position.equals("SMALL_FORWARD") || !position.equals("POWER_FORWARD") ...
    throw new IllegalArgumentException("INVALID POSITION");
```
Although you should still ensure that a `null` doesn't get passed in.
```java
        if (position == null)
            throw new IllegalArgumentException("Position cannot be null");
```

## Task 5
enum constants are implicitly `static` and `final`. Import every constant into `Main` and fill in the `main()` method.

## Task 6

Import every constant into `Game` and fill in the `begin()` method.

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4d714b6a-ae3f-4d16-8b31-70134b6710f6?alt=media&token=dd553cd9-af91-4185-b764-d504c82f628d)

## Task 1

The `CarDealership` `class` will define an `ArrayList` of `Car` objects.

## Task 2
Create a constructor for the `CarDealership` class that initializes the `cars` field to an empty `ArrayList`.

## Task 3
Create a `getCar` method that takes an index as a parameter and returns a deep copy of the `Car` object at that index.

**Hint**: You must return to the Car class and give it a copy constructor.

## Task 4
Create a `setCar` method that takes a `Car` object and an index as parameters and sets the `Car `object at the specified index to a deep copy of the given object.

## Task 5
Create an `addCar` method that takes a `Car` object as a parameter and adds a deep copy of the object to the `cars` `ArrayList`.

## Task 6
Test the `CarDealership` class by creating a few Car objects, initializing a `CarDealership` object with those cars, and then using the `getCar`, `setCar`, and `addCar` methods to manipulate the cars.

```java
public static void main(String[] args) {
    Car car1 = new Car("Toyota", "Camry", BodyType.SEDAN, 2020, 30000);
    Car car2 = new Car("Honda", "Civic", BodyType.SEDAN, 2021, 25000);

    CarDealership dealership = new CarDealership();
    
    // Test the addCar method
    dealership.addCar(car1);
    dealership.addCar(car2);

    // Test the getCar method
    Car retrievedCar = dealership.getCar(0);
    System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());

    // Test the setCar method
    Car newCar = new Car("Ford", "Mustang", BodyType.COUPE, 2022, 45000);
    dealership.setCar(newCar, 0);

    // Verify that the car was updated
    retrievedCar = dealership.getCar(0);
    System.out.println(retrievedCar.getMake() + " " + retrievedCar.getModel());
}
```

## Task 7
Use breakpoints to inspect how the CarDealership class manages the `ArrayList` of `Car` objects with deep copying when using the `getCar`, `setCar`, and `addCar` methods.

# Part 3

From the `Java Bootcamp Resources`, launch **`Part 3`**.

![3.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb482a4c6-07ab-4d4b-94a6-f3f2f662d3ea?alt=media&token=fdb5d33b-1e9f-412f-9353-e2a54e897162)
# 

## Task 1
Inside the Main class, create a method called `isNullOrBlank` that takes a `String` input and returns `true` if the input is `null` or `blank`.

```java
public static boolean isNullOrBlank(String input) {
    // TODO
}
```

## Task 2
Create a method called `invalidYear` that takes an `int` input and returns `true` if the input is less than your minimum production year (see your Car class).

```java
public static boolean invalidYear(int year) {
    // TODO
}
```

## Task 3
Create a method called `invalidPrice` that takes a double input and returns true if the input is less than the minimum price or greater than the maximum price (see your Car class).

```java
public static boolean invalidPrice(double price) {
    // TODO
}
```

## Task 4

Create a method called `invalidBodyType` that:

1. Takes a `String` input and capitalizes it.
2. Returns `true` if the input does not match one of the body types in the enum.

The second part is tricky but here's a hint: you can call `valueOf` from your enum. It returns an enum constant if it recognizes the string, otherwise, it will throw an `IllegalArgumentException`. In which case, catch the exception and return a boolean.

```java
public static boolean invalidBodyType(String bodyType) {
    // TODO
}
```

## Task 5
Create a method called `promptForBodyType` that takes a `Scanner` input and returns a valid body type entered by the user.

```java
public static BodyType promptForBodyType(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid car body type: ");
        String bodyType = scanner.nextLine();
        // TODO
    }
}
```


## Task 6

Create a method called `promptForMake` that takes a `Scanner` input and returns a valid `make` entered by the user.

```java
public static String promptForMake(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid car make: ");
        String make = scanner.nextLine();
        // TODO
    }
}
```

## Task 7
Create a method called `promptForModel` that takes a `Scanner` input and returns a valid `model` entered by the user.

```java
public static String promptForModel(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid car model: ");
        String model = scanner.nextLine();
        // TODO
    }
}
```

## Task 8
Create a method called `promptForYear` that takes a `Scanner` input and returns a valid production year entered by the user.

```java
public static int promptForYear(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid production year: ");
        // TODO
    }
}
```

## Task 9
Create a method called `promptForPrice` that takes a `Scanner` input and returns a valid price entered by the user.

```java
public static double promptForPrice(Scanner scanner) {
    while (true) {
        System.out.print("\nPlease enter a valid car price: ");
        // TODO
    }
}
```

## Task 10
Test the interactive methods in the main method.

```java
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String make = promptForMake(scanner);
    String model = promptForModel(scanner);
    BodyType bodyType = promptForBodyType(scanner);
    int year = promptForYear(scanner);
    double price = promptForPrice(scanner);

    Car newCar = new Car(make, model, bodyType, year, price);

    CarDealership dealership = new CarDealership();
    dealership.addCar(newCar);

    System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());
}

```
