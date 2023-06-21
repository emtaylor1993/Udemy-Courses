# Capstone Project Part 1

Congratulations on reaching the Capstone Project. This project will test the skills that you learned in Module 2.  As such, a video solution will not be provided, but you will still have access to a final solution inside your Bootcamp Resources.

## Download the starter project

Launch the `starter-code` folder inside `Java Bootcamp Resources` -> `Module 2` -> `Casptone Project`.


## Task 1

Inside `TradeAccount.java`, create an abstract `TradeAccount` class. The `abstract` class will define the following field:

```java
    private String id;
```

## Task 2

Create getter and setter methods for the `id` field in the `TradeAccount` class. Do not worry about argument validation.

## Task 3

Create a constructor that initializes the `id` field of a newly created `TradeAccount` object.

## Task 4

Add an abstract method called `clone` to the `TradeAccount` class. The `clone` method will have no parameters and return a `TradeAccount` object.

## Task 5

Make sure that `CashAccount` extends the `TradeAccount` class. The `CashAccount` class will define the following field:

```java
    private BigDecimal cashBalance;
```

## Task 6

Create getter and setter methods for the `cashBalance` field in the `CashAccount` class. Do not worry about argument validation.
 
## Task 7

Create a constructor that initializes the fields of a newly created `CashAccount` object by calling the superclass constructor and updating the `cashBalance` field.

## Task 8

Override the clone method in the `CashAccount` class. The method should return a new `CashAccount` object with the same `id` and `cashBalance`.

## Task 9

Make sure that `MarginAccount` extends the `TradeAccount` class. The `MarginAccount` class will define the following field:

```java
    private BigDecimal margin;
```

## Task 10

Create getter and setter methods for the `margin` field in the `MarginAccount` class. Do not worry about argument validation.

## Task 11

Create a constructor that initializes the fields of a newly created `MarginAccount` object by calling the superclass constructor and updating the `margin` field.

## Task 12
Override the clone method in the `MarginAccount` class. The method should return a new `MarginAccount` object with the same `id` and `margin`.

## Task 13
Test your implementation by creating instances of the `CashAccount` and `MarginAccount` classes and calling their clone methods.

```java
    public static void main(String[] args) {
        CashAccount cashAccount = new CashAccount("C123", new BigDecimal("1000.00"));
        System.out.println("Cash Account Details:");
        System.out.println("ID: " + cashAccount.getId());
        System.out.println("Cash Balance: " + cashAccount.getCashBalance());

        CashAccount clonedCashAccount = (CashAccount) cashAccount.clone();
        System.out.println("Cloned Cash Account Details:");
        System.out.println("ID: " + clonedCashAccount.getId());
        System.out.println("Cash Balance: " + clonedCashAccount.getCashBalance());

        System.out.println();

        MarginAccount marginAccount = new MarginAccount("M456", new BigDecimal("5000.00"));
        System.out.println("Margin Account Details:");
        System.out.println("ID: " + marginAccount.getId());
        System.out.println("Margin: " + marginAccount.getMargin());

        MarginAccount clonedMarginAccount = (MarginAccount) marginAccount.clone();
        System.out.println("Cloned Margin Account Details:");
        System.out.println("ID: " + clonedMarginAccount.getId());
        System.out.println("Margin: " + clonedMarginAccount.getMargin());
    }
```

Compile and run the `Main` class to test your implementation. The output should display the details of the cash account and margin account instances, as well as the cloned instances.

# Capstone Project Part 2

This workbook assumes that you successfully completed Part 1.

## Task 1
Inside `TradeAccountRepository.java`, create a `TradeAccountRepository` class. The class will define a `private datastore` field:

```java
    private Map<String, TradeAccount> datastore = new HashMap<>();
```

The `datastore` field will be used to store `TradeAccount` objects using their `id` as the key.

## Task 2

- Create a method called `createTradeAccount` in the `TradeAccountRepository` class. 
- The method should have one parameter, a `TradeAccount` object, and return no value. 
- The `createTradeAccount` method should store a clone of the `TradeAccount` object in the datastore using the id field as the key.

## Task 3
- Create a method called `retrieveTradeAccount` in the `TradeAccountRepository` class. 
- The method should have one parameter, a `String id`, and return a `TradeAccount` object.
- The retrieveTradeAccount method should return a clone of the `TradeAccount` object stored in the datastore with the specified `id`.

## Task 4
- Create a method called `updateTradeAccount` in the `TradeAccountRepository` class. 
- The method should have one parameter, a `TradeAccount` object, and return no value.
- The updateTradeAccount method should update the `TradeAccount` object in the datastore using the `id` field as the key. It should store a clone of the `TradeAccount` object to ensure that the original object is not modified.

## Task 5
- Create a method called `deleteTradeAccount` in the `TradeAccountRepository` class. 
- The method should have one parameter, a `String id`, and return no value.
- The `deleteTradeAccount` method should remove the `TradeAccount` object with the specified `id` from the datastore.

## Task 6
 Test your implementation by creating a `TradeAccountRepository` object and performing the create, retrieve, update, and delete operations.

```java
    public static void main(String[] args) {
        TradeAccountRepository repository = new TradeAccountRepository();

        CashAccount cashAccount = new CashAccount("C123", new BigDecimal("1000.00"));
        repository.createTradeAccount(cashAccount);

        MarginAccount marginAccount = new MarginAccount("M456", new BigDecimal("5000.00"));
        repository.createTradeAccount(marginAccount);

        TradeAccount retrievedCashAccount = repository.retrieveTradeAccount("C123");
        System.out.println("Retrieved Cash Account ID: " + retrievedCashAccount.getId());
        System.out.println("Cash Balance: " + ((CashAccount) retrievedCashAccount).getCashBalance());

        TradeAccount retrievedMarginAccount = repository.retrieveTradeAccount("M456");
        System.out.println("Retrieved Margin Account ID: " + retrievedMarginAccount.getId());
        System.out.println("Margin: " + ((MarginAccount) retrievedMargin
```

# Capstone Project Part 3

This workbook assumes that you successfully completed Part 2.

## Task 1
Create an interface called `TradeAccountService` with two methods:

```java
public interface TradeAccountService {
    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);
}
```

## Task 2
Create a class called `CashAccountService` that implements the `TradeAccountService` interface. The class should have a `TradeAccountRepository` object as a private field.

## Task 3
In the `CashAccountService` class, implement the `deposit` and `withdraw` methods:

 - The `deposit` method should add the given amount to the `cashBalance` field of the specified `CashAccount` object.
 - The `withdraw` method should subtract the given amount from the `cashBalance` field of the specified `CashAccount` object.

Also, implement the following methods:

 - `createTradeAccount`
 - `retrieveTradeAccount`
 - `updateTradeAccount`
 - `deleteTradeAccount`

These methods should interact with the `TradeAccountRepository` object to manage `CashAccount` objects.

## Task 4
Create a class called `MarginAccountService` that implements the `TradeAccountService` interface. The class should have a `TradeAccountRepository` object as a `private` field:

## Task 5
In the `MarginAccountService` class, implement the `deposit` and `withdraw` methods:

 - The `deposit` method should add the given amount to the `margin` field of the specified `MarginAccount` object.
 - The `withdraw` method should subtract the given amount from the `margin` field of the specified `MarginAccount` object.

Also, implement the following methods:

 - `createTradeAccount`
 - `retrieveTradeAccount`
 - `updateTradeAccount`
 - `deleteTradeAccount`

These methods should interact with the `TradeAccountRepository` object to manage `MarginAccount` objects.

## Task 6

Below is a code snippet to test your implementation. Make sure that you get a similar output.

### Output
```
>>: Updated CashAccount balance: 1300
>>: Updated MarginAccount margin: 2500
```

### Sample Code
```java

public static void main(String[] args) {
    TradeAccountRepository repository = new TradeAccountRepository();
    CashAccountService cashAccountService = new CashAccountService(repository);
    MarginAccountService marginAccountService = new MarginAccountService(repository);

    // Create CashAccount and MarginAccount objects
    CashAccount cashAccount = new CashAccount("1", BigDecimal.valueOf(1000));
    MarginAccount marginAccount = new MarginAccount("2", BigDecimal.valueOf(2000), BigDecimal.valueOf(10000));

    // Add the accounts to the repository
    cashAccountService.createTradeAccount(cashAccount);
    marginAccountService.createTradeAccount(marginAccount);

    // Deposit and withdraw amounts
    cashAccountService.deposit("1", BigDecimal.valueOf(500));
    cashAccountService.withdraw("1", BigDecimal.valueOf(200));
    marginAccountService.deposit("2", BigDecimal.valueOf(1000));
    marginAccountService.withdraw("2", BigDecimal.valueOf(500));

    // Retrieve and print the updated account balances
    CashAccount updatedCashAccount = cashAccountService.retrieveTradeAccount("1");
    MarginAccount updatedMarginAccount = marginAccountService.retrieveTradeAccount("2");
    System.out.println("Updated CashAccount balance: " + updatedCashAccount.getCashBalance());
    System.out.println("Updated MarginAccount margin: " + updatedMarginAccount.getMargin());

    // Delete the accounts
    cashAccountService.deleteTradeAccount("1");
    marginAccountService.deleteTradeAccount("2");
}
```

# Capstone Project Part 4

This workbook assumes that you successfully completed Part 3.

## Preliminary Task
Remove all the code inside of your `Main` class. At the class level, declare the following variables:
```java
static Path[] paths = new Path[] {Paths.get("data/accounts.txt"), Paths.get("data/transactions.txt")};

static TradeAccountRepository tradeAccountRepository = new TradeAccountRepository();
static CashAccountService cashAccountService = new CashAccountService(tradeAccountRepository);
static MarginAccountService marginAccountService = new MarginAccountService(tradeAccountRepository);
```

- The `paths` array holds the file paths for `data/accounts.txt` and `data/transactions.txt`.
- Instances of `TradeAccountRepository`, `CashAccountService`, and `MarginAccountService` will be used to manage the data.


## Task 1
- Write a method called `loadTradeAccounts` to read the file data/accounts.txt. 
- For each line in the file, split the line into an array of strings and create either a `CashAccount` or a `MarginAccount` object based on the account type. 
- Add the created account to the corresponding account service (`cashAccountService` or `marginAccountService`).


## Task 2

- Write a method called `applyTransactions` to read the file data/transactions.txt. 
- For each line in the file, split the line into an array of strings and determine the account type, transaction type (`DEPOSIT` or `WITHDRAW`), and the amount. 
- Use the appropriate account service (`cashAccountService` or `marginAccountService`) to deposit or withdraw the specified amount.

## Task 3

Copy this method to print the cash balance of the `CashAccount` and `MarginAccount` objects.

```java
public static void finalTest() throws IOException {
    System.out.println("Account A1234B Cash Balance: " + cashAccountService.retrieveTradeAccount("A1234B").getCashBalance());
    System.out.println("Account E3456F Cash Balance: " + cashAccountService.retrieveTradeAccount("E3456F").getCashBalance());
    System.out.println("Account I5678J Cash Balance: " + cashAccountService.retrieveTradeAccount("I5678J").getCashBalance());
    System.out.println("Account C2345D Margin: " + marginAccountService.retrieveTradeAccount("C2345D").getMargin());
    System.out.println("Account G4567H Margin: " + marginAccountService.retrieveTradeAccount("G4567H").getMargin());
}
```

## Task 4

In the `main` method, use a `try-catch` block to call the `loadTradeAccounts`, `applyTransactions`, and `finalTest` methods.

```java
public static void main(String[] args) {
    try {
        loadTradeAccounts();
        applyTransactions();
        finalTest();
    } catch (IOException exception) {
        System.out.println(exception.getMessage());
    }
}
```

### Expected Output
```java
Account A1234B Cash Balance: 512.00
Account E3456F Cash Balance: 325.45
Account I5678J Cash Balance: 125.20
Account C2345D Margin: 15.40
Account G4567H Margin: 224.95
```

# Congratulations on Finishing the Course!
