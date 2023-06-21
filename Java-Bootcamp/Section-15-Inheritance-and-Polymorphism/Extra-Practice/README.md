# Part 1

From the `Java Bootcamp Resources`, launch **`Part 1`**.

![1.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F85391d27-5dd8-4a8b-9a15-271f727a3ca6?alt=media&token=4f1b90ab-38ed-4272-abff-b4bcb4c59f87)


## Task 1
Inside `LabEquipment.java`, create an `abstract` `LabEquipment` class. The `abstract` class will define the following fields:

```java
    private String manufacturer;
    private String model;
    private int year;
```
We are making the `LabEquipment` class `abstract` because it is a general concept and we do not want to create instances (objects) of it. Instead, we want to use it as a base class for more specific lab equipment types, like `Microscope` and `Centrifuge`.


## Task 2
Create getter and setter methods for each field of the `LabEquipment` class. Ensure that the setter methods perform the following argument validations and throw an `IllegalArgumentException` with an appropriate error message if the input is invalid:

- `setManufacturer` method:

  - Check if the input `manufacturer` is `null` or `blank`.
  - If the validation fails, throw an `IllegalArgumentException` with the message `"Manufacturer cannot be null or blank."`

- `setModel` method:

  - Check if the input model is `null` or `blank`.
  - If the validation fails, throw an `IllegalArgumentException` with the message `"Model cannot be null or blank."`

- `setYear` method:
  - Check if the input `year` is less than the minimum year (e.g., 1950). Do not use loose integers in your code. Use `static` `final` constants instead.
  - If the validation fails, throw an `IllegalArgumentException` with the message `"Year must be greater than or equal to the minimum year."`

After implementing the setter methods with the appropriate validations, create the corresponding getter methods for each field.

## Task 3
Create a constructor that initializes the fields of a newly created object by calling the setter methods.

```java
public LabEquipment(String manufacturer, String model, int year) {
    setManufacturer(manufacturer);
    setModel(model);
    setYear(year);
}
```
Using the setter methods in the constructor ensures that the argument validation is performed in a single place, keeping the code DRY (Don't Repeat Yourself).

## Task 4
Create a new file named `Microscope.java`. Inside the file, create the `Microscope` class that extends the `LabEquipment` class. The Microscope class will define the following field:

```java
    private int magnification;
```

Create getter and setter methods for the `magnification` field. Ensure that the setter method performs the following argument validation and throws an `IllegalArgumentException` with an appropriate error message if the input is invalid:

 - `setMagnification` method:

    - Check if the input magnification is less than a minimum magnification (e.g., 1). Do not use loose integers in your code. Use `static` `final` constants instead.
    - If the validation fails, throw an `IllegalArgumentException` with the message `"Magnification must be greater than or equal to the minimum magnification."`


## Task 5

Create a constructor that initializes the fields of a newly created Microscope object by calling the superclass constructor and updating the magnification field.

## Task 6
Create a new file named `Centrifuge.java`. Inside the file, create the `Centrifuge` class that extends the `LabEquipment` class. The `Centrifuge` class will define the following field:

```java
    private int maxRPM
```

## Task 7

Create getter and setter methods for the `maxRPM` field. Ensure that the setter method performs the following argument validation and throws an IllegalArgumentException with an appropriate error message if the input is invalid:

- `setMaxRPM` method:

    - Check if the input `maxRPM` is less than a minimum RPM (e.g., 500). Do not use loose integers in your code. Use `static` `final` constants instead.
    - If the validation fails, throw an `IllegalArgumentException` with the message "Max RPM must be greater than or equal to the minimum RPM."

## Task 8

Create a constructor that initializes the fields of a newly created `Centrifuge` object by calling the `superclass` constructor and updating the `maxRPM` field.

## Task 9
Inside the `LabEquipment.java` file, add an `abstract` method called `performMaintenance` to the `LabEquipment` class. The `performMaintenance` method will have no parameters and return a `String` that represents a maintenance message.

```java
public abstract String performMaintenance();
```
By declaring the `performMaintenance` method as abstract, we are forcing the child classes to provide their own implementation of the method. This ensures that each piece of lab equipment can have its own specific maintenance procedure.

## Task 10
Inside the `Microscope.java` file, override the `performMaintenance` method in the `Microscope` class. The method should return a String that provides a maintenance message for a miscroscope.

```java
@Override
public String performMaintenance() {
    return "Microscope maintenance: Clean the lenses and check the light source.";
}
```

## Task 11
Inside the `Centrifuge.java` file, override the `performMaintenance` method in the `Centrifuge` class. The method should return a `String` that provides a maintenance message for a centrifuge.

```java
@Override
public String performMaintenance() {
    return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
}
```

Now, each child class of `LabEquipment` provides its own implementation of the `performMaintenance` method, ensuring that specific maintenance procedures are followed for each type of lab equipment.

## Task 12

Test your implementation by creating instances of the `Microscope` and `Centrifuge` classes and calling their `performMaintenance` methods.

```java
    public static void main(String[] args) {
        Microscope microscope = new Microscope("Nikon", "E200", 2021, 1000);
        System.out.println("Microscope Details:");
        System.out.println("Manufacturer: " + microscope.getManufacturer());
        System.out.println("Model: " + microscope.getModel());
        System.out.println("Year: " + microscope.getYear());
        System.out.println("Magnification: " + microscope.getMagnification());
        System.out.println("Maintenance: " + microscope.performMaintenance());

        System.out.println();

        Centrifuge centrifuge = new Centrifuge("Eppendorf", "5424R", 2020, 15000);
        System.out.println("Centrifuge Details:");
        System.out.println("Manufacturer: " + centrifuge.getManufacturer());
        System.out.println("Model: " + centrifuge.getModel());
        System.out.println("Year: " + centrifuge.getYear());
        System.out.println("Max RPM: " + centrifuge.getMaxRPM());
        System.out.println("Maintenance: " + centrifuge.performMaintenance());
    }
```

Compile and run the `LabEquipmentTester` class to test your implementation. The output should display the details of the microscope and centrifuge instances, as well as the maintenance messages returned by their performMaintenance methods.

## Task 13

Use breakpoints to visualize the runtime of your code and gain a deeper understanding of the flow of execution.

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4d714b6a-ae3f-4d16-8b31-70134b6710f6?alt=media&token=dd553cd9-af91-4185-b764-d504c82f628d)

# Background

In this workbook, the focus is on **polymorphism**, which is one of the core principles of object-oriented programming. Polymorphism allows objects of different classes to be treated as objects of a common superclass. This makes it easier to create more flexible and reusable code.  In our example, the `Lab` class will manage both `Microscope` and `Centrifuge` objects by treating them as instances of their common superclass, `LabEquipment`.

## Task 1
Inside the `Lab` class, define an `ArrayList` field of `LabEquipment` objects:

```java
import java.util.ArrayList;

public class Lab {
                      // Polymorphism
    private ArrayList<LabEquipment> labEquipments; 
}
```
## Task 2
Create a constructor for the `Lab` class that initializes the `labEquipments` field to an empty ArrayList.

## Task 3

Create a copy constructor inside the `LabEquipment` class.

## Task 4

Create a copy constructor inside the `Centrifuge` class and inside the `Microscope` class.

## Task 5
Test your copy constructors. Use breakpoints to visualize the runtime.
```java
public static void main(String[] args) {
    Microscope microscope1 = new Microscope("Nikon", "E200", 2021, 1000);
    Centrifuge centrifuge1 = new Centrifuge("Eppendorf", "5424R", 2020, 15000);

    // Test the copy constructors
    Microscope microscopeCopy = new Microscope(microscope1);
    Centrifuge centrifugeCopy = new Centrifuge(centrifuge1);

    System.out.println("Original Microscope: " + microscope1.getManufacturer() + " " + microscope1.getModel());
    System.out.println("Copied Microscope: " + microscopeCopy.getManufacturer() + " " + microscopeCopy.getModel());
    
    System.out.println("Original Centrifuge: " + centrifuge1.getManufacturer() + " " + centrifuge1.getModel());
    System.out.println("Copied Centrifuge: " + centrifugeCopy.getManufacturer() + " " + centrifugeCopy.getModel());
```

## Task 6 (**Tricky!)**
Create a `getLabEquipment` method that takes an index as a parameter and returns a deep copy of the `LabEquipment` object at that index.

**Hints**: 
   1. Create an `abstract` method called `clone()` inside the parent class that returns a `LabEquipment` object. 
   2. Override the `clone()` method in each child class to return a copy of the **current object**.
   3. The abstract method exposes functionality that each child object is forced to override.


## Task 7
Create a `setLabEquipment` method that takes a `LabEquipment` object and an index as parameters and sets the `LabEquipment` object at the specified index to a deep copy of the given object.

## Task 8
Create an `addLabEquipment` method that takes a `LabEquipment` object as a parameter and adds a deep copy of the object to the `labEquipments` `ArrayList`.

## Task 9
Test the `Lab` class by creating a few Microscope and Centrifuge objects, initializing a `Lab` object with those lab equipments, and then using the `getLabEquipment`, `setLabEquipment`, and `addLabEquipment` methods to manipulate the lab equipments.

```java
public static void main(String[] args) {
    Microscope microscope1 = new Microscope("Nikon", "E200", 2021, 1000);
    Centrifuge centrifuge1 = new Centrifuge("Eppendorf", "5424R", 2020, 15000);

    // Test the copy constructors
    Microscope microscopeCopy = new Microscope(microscope1);
    Centrifuge centrifugeCopy = new Centrifuge(centrifuge1);

    System.out.println("Original Microscope: " + microscope1.getManufacturer() + " " + microscope1.getModel());
    System.out.println("Copied Microscope: " + microscopeCopy.getManufacturer() + " " + microscopeCopy.getModel());
    
    System.out.println("Original Centrifuge: " + centrifuge1.getManufacturer() + " " + centrifuge1.getModel());
    System.out.println("Copied Centrifuge: " + centrifugeCopy.getManufacturer() + " " + centrifugeCopy.getModel());

    Lab lab = new Lab();

    // Test the addLabEquipment method
    lab.addLabEquipment(microscope1);
    lab.addLabEquipment(centrifuge1);

    // Test the getLabEquipment method
    LabEquipment retrievedLabEquipment = lab.getLabEquipment(0);
    System.out.println("Retrieved Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());

    // Test the setLabEquipment method
    Microscope microscope2 = new Microscope("Olympus", "CX23", 2021, 400);
    lab.setLabEquipment(microscope2, 0);

    // Verify that the lab equipment was updated
    retrievedLabEquipment = lab.getLabEquipment(0);
    System.out.println("Updated Lab Equipment: " + retrievedLabEquipment.getManufacturer() + " " + retrievedLabEquipment.getModel());
}
}
```
## Task 10
Use breakpoints to inspect how the `Lab` class manages the ArrayList of `LabEquipment` objects.
