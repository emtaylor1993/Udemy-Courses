# The World of Objects - Extra Practice

From the `Java Bootcamp Resources`, launch **`Part 1`**.

![1.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F995797a5-9b4c-4d77-a8f9-9c2b364e7f85?alt=media&token=ebf6ecea-753a-47e1-a694-0964cf811716)

## **Task 1**

Create a new file named `Contact.java`. Inside the file, create the `Contact` class.


```java
public class Contact {

}
```

The Contact class will define the following fields:

```java
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;
```

The Contact class serves as a blueprint for creating Contact objects.


## Task 2

Create a constructor that initializes the fields of a newly created object.


## Task 3

Create a constructor that initializes a new object using an existing object's fields.

## Task 4

Test your constructor by creating four instances (objects) of the Contact class.

```java
public static void main(String[] args) {
    Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01", 33);
    Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02", 31);
    Contact contact3 = new Contact("Charlie", "345-678-9012", "1994-03-03", 29);
    Contact contact4 = new Contact("David", "456-789-0123", "1996-04-04", 27);
}
```
## Task 5

Use breakpoints to visualize the initialization of each field as objects are created.

## Task 6

Test the copy constructor by creating two objects with fields copied from two existing objects.


```java
public static void main(String[] args) {
    // Assuming the Contact objects from Task 4 are available
    Contact copyContact1 = new Contact(contact1);
    Contact copyContact2 = new Contact(contact3);
}
```

## Task 7

Use breakpoints to inspect field initialization in the new objects created using the copy constructor.

# Part 2

From the `Java Bootcamp Resources`, launch **`Part 2`**.

![2.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4d714b6a-ae3f-4d16-8b31-70134b6710f6?alt=media&token=dd553cd9-af91-4185-b764-d504c82f628d)

## **Task 1**

Modify the `Contact` class by removing the `age` parameter from the constructor.

```java
    public Contact(String name, String phoneNumber, String birthDate) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        // Remove the age update
    }
```
Age will be derived from the `birthDate` that is passed in.


## Task 2 

This task provides an excellent opportunity to practice navigating the web to search documentation and find resources.

### Part 1

Create a `toAge` method that converts the `birthDate` string to an age.


```java
public int toAge(String birthDate) {
    // Your implementation here
}
```

### Part 2
`LocalDate` makes it really easy to work with dates. 

Convert the `String` into a LocalDate using the [**`LocalDate.parse` method**](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#parse-java.lang.CharSequence-java.time.format.DateTimeFormatter-). Ensure that the `LocalDate` follows the pattern `yyyy-MM-dd`.

```java
public int toAge(String birthDate) {
    // 1. Convert birthDate String to LocalDate
}
```

### Part 3

Define a `LocalDate` object representing the current date using the [**`LocalDate.now` method**](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html#now--).

```java
public int toAge(String birthDate) {
    // 1. Convert birthDate String to LocalDate
    // 2. Get the current date
}
```

### Part 4

Define a `Period` object representing the period between two dates using the [**`Period.between` method**](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/Period.html#between(java.time.LocalDate,java.time.LocalDate))

```java
public int toAge(String birthDate) {
    // 1. Convert birthDate String to LocalDate
    // 2. Get the current date
    // 3. Calculate the period between both dates
}
```

### Part 5
Extract the number of years from the `Period` object and return it using the [**`Period.getYears` method**](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/Period.html#getYears())

```java
public int toAge(String birthDate) {
    // 1. Convert birthDate String to LocalDate
    // 2. Get the current date
    // 3. Calculate the period between both dates
    // 4. Return the number of years
}
```

## Task 3

Modify the constructor to update the `age` field by calling `toAge` and passing in the `birthDate`.


## Task 4

Use breakpoints to visualize the runtime of the `age` field being updated automatically from the `birthDate`.


## Task 5

Update the `birthDate` of one of the previously created objects:

```java
public static void main(String[] args) {
    // contacts from before
    contact1.setBirthDate("1989-01-01");
}

```
## Task 6

The `age` should be automatically updated once the `birthDate` is updated, so make `setAge` `private`, as it should not be accessible outside of this class. 

We only need to call `setAge` from `setBirthDate` so that `age` is automatically updated when the `birthDate` is updated.


## Task 7

Use breakpoints to visualize the runtime of the person's 	`birthDate` and `age` updating simultaneously.

# Part 3

From the `Java Bootcamp Resources`, launch **`Part 3`**.

![3.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2Fb482a4c6-07ab-4d4b-94a6-f3f2f662d3ea?alt=media&token=fdb5d33b-1e9f-412f-9353-e2a54e897162)


## Task 1
Create a new file named `ContactManager.java`. Inside the file, create the `ContactManager` class.

```java
public class ContactManager {

}
```

The `ContactManager` class will define the following field:

```java
    private Contact[] contacts; // array of Contact objects
```

## Task 2

Create a constructor for the `ContactManager` class that takes an array of `Contact` objects as a parameter.

```java
public ContactManager(Contact[] contacts) {


}
```

The constructor must initialize the `contacts` field with deep copies of the objects.


```java
public ContactManager(Contact[] contacts) {
   // 1. set field equal to a new array with the same length as the parameter
   // 2. Set each element in the field equal to a deep copy of an object in the contacts parameter
}
```

## Task 3

Create a `getContact` method that takes an index as a parameter and returns a deep copy of the `Contact` object at that index.

```java
public Contact getContact(int index) {
   // return deep copy of object at that index.
}
```

## Task 4

Create a `setContact` method that takes a `Contact` object and an index and sets the `Contact` object at the specified index to a deep copy of the given object.


```java
public void setContact(Contact contact, int index) {
    this.contacts[index] = new Contact(contact);
}
```

## Task 5

Test the `ContactManager` class by creating a few Contact objects, initializing a `ContactManager` object with those contacts, and then using the `getContact` and `setContact` methods to manipulate the contacts.

```java
public static void main(String[] args) {
    Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01");
    Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02");

    Contact[] contacts = {contact1, contact2};
    ContactManager contactManager = new ContactManager(contacts);

    // Test the getContact method
    Contact retrievedContact = contactManager.getContact(0);
    System.out.println(retrievedContact.getName());

    // Test the setContact method
    Contact newContact = new Contact("Charlie", "345-678-9012", "1994-03-03");
    contactManager.setContact(newContact, 0);

    // Verify that the contact was updated
    retrievedContact = contactManager.getContact(0);
    System.out.println(retrievedContact.getName());
}
```

## Task 6
Use breakpoints to visualize how the `ContactManager` class is handling the deep copying of `Contact` objects when using the `getContact` and `setContact` methods.

# Part 4

From the `Java Bootcamp Resources`, launch **`Part 4`**.

![Untitled.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F581153fc-1e33-4583-8d32-11a5d03110e6?alt=media&token=ac60bfd2-7695-49cb-b148-0cb665197de5)

## Task 1

Inside `Main`, define `Scanner` at the class level.
```java
public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    
    //... 

```

Close `Scanner` at the end of the `main` method.
```java
    public static void main(String[] args) {



        scan.close();
    }
```
    

## Task 2

Create a method `contactData` that returns an array of `Contac`t objects with initial data.

```java
public static Contact[] contactData() {
    return new Contact[] {
            new Contact("John Doe", "555-123-4567", "1985-01-01"),
            new Contact("Jane Smith", "555-987-6543", "1990-02-14"),
            new Contact("Alice Johnson", "555-345-6789", "1975-03-30"),
            new Contact("Bob Brown", "555-567-8910", "2000-12-25"),
            new Contact("Charlie Davis", "555-111-2222", "1983-07-04"),
            new Contact("Diana White", "555-333-4444", "1997-11-18"),
            new Contact("Ethan Green", "555-555-6666", "1988-05-22"),
            new Contact("Fiona Black", "555-777-8888", "2002-10-31")
    };
}
```

## Task 3

In the `main` method, instantiate a `ContactManager` object with an initial array of `Contact` objects.

```java
   ContactManager contactManager = new ContactManager(contactData());
```

Create a method called `displayContacts` that takes a `ContactManager` object as a parameter and displays the contacts.

```java
public static void displayContacts(ContactManager contactManager) {
    for (int i = 0; i < 8; i++) {
        Contact contact = contactManager.getContact(i);
        System.out.println(contact);
        System.out.println("\n");
    }
}
```

Printing a `Contact` object relies on the `Contact` class having a `toString` method:
```java
    public String toString() {
        return "Name: " + this.name + "\n" +
            "Phone number: " + this.phoneNumber + "\n" +
            "Birth Date: " + this.birthDate + "\n" +
            "Age: " + this.age + " year old\n";
    }
```

## Task 4

Back inside the `main` method, display the contacts:

```java
public static void main(String[] args) {
    ContactManager contactManager = new ContactManager(contactData());
    displayContacts(contactManager);
    //...
}
```
Use breakpoints to visualize the `toString` method getting invoked whenever you print an object.


## Task 5

Add the following code inside the `main` method. If the user enters continue, the code loops endlessly asking them to choose an index.
```java
public static void main(String[] args) {

    ContactManager contactManager = new ContactManager(contactData());
    displayContacts(contactManager);

    // new code...
    System.out.print("\nYou have 8 contacts. Enter 'continue' to edit them: ");
    String status = scan.nextLine();

    while (status.equals("continue")) {
        System.out.print("\nChoose an index from 0 to 7: ");
        int index = scan.nextInt();
        scan.nextLine(); // throwaway nextLine

}
```
## Task 6

Create a method `editedContact` that prompts the user for a name, phone number, and birth date, and then returns a new Contact object with the provided information.

```java
public static Contact editedContact() {
    System.out.print("\tName: ");
    // pick up name
    System.out.print("\tPhone Number: ");
    // pick up number
    System.out.print("\tBirth Date: ");
    // pick up birth date

    // return a Contact object
}
```

## Task 7

Inside `main`, update the `ContactManager` by editing the contact at the index.
```java
public static void main(String[] args) {
    //Previous code

    while (status.equals("continue")) {
        System.out.print("\nChoose an index from 0 to 7: ");
        int index = scan.nextInt();
        scan.nextLine(); // throwaway nextLine        


        // 1. Edit contact at index and update the ContactManager

}
```

## Task 8

Finalize the loop by printing the updated contacts and asking if they want to continue


```java
        System.out.println("\n\nUPDATED CONTACTS\n\n");
        displayContacts(contactManager);
        System.out.print("Enter 'continue' to make more changes: ");
        status = scan.nextLine();
}
```

## Task 9


Test the `Main` class by running the program and interacting with the user prompts to edit contacts.
