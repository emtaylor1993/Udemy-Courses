# Workbook 3.6

From the `Java Bootcamp Resources`, launch the **`Workbook 3.6`** folder.

![Screen Shot 2022-10-16 at 7.03.08 PM.png](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F223e4f34-b457-4e6e-bdf6-991f9011f07c?alt=media&token=4942530e-5546-41dd-af5a-40915c8a0ece)


## Your Calendar

The code starts with a `day` variable. Your friend wants to hang out on that day.

```java
public class Calendar {

     public static void main﻿(﻿String[] args﻿) {
         String day = "Friday"﻿;
         System.out.﻿println﻿(﻿"Hey, are you free on " + day + "? \n"﻿)﻿;

         System.out.﻿println﻿(﻿"Hmm, let me check my calendar."﻿)﻿;

    }
}
```

`>>Hey, are you free on friday?`

`>>`

`>>Hmm, let me check my calendar.`

## Task 1 - Check your calendar

Check that day against 7 days from your calendar.


- `case Monday`, `print`:

> Sorry, I have to stay at work late.

- `case Tuesday`, `print`:

> It looks like I have meetings all day.

- `case Wednesday`, `print`:

> I have a dentist appointment. Some other time!

- `case Thursday`, `print`:

> Sorry, thursday is date night!

- `case Friday`, `print`:

> I'm free!!

- `case Saturday`, `print`:

> I'm free!!

- `case Sunday`, `print`:

> I'm free!!

- `default`:

> That's not a day.

## Run your code.
### Test Case 1
```java
    String day = "Friday"﻿;
```
`>>: I'm free!!`

### Test Case 2
```java
    String day = "Saturday"﻿;
```
`>>: I'm free!!`

### Test Case 3

```java
    String day = "Monday"﻿;
```
`>>: Sorry, I have to stay at work late.`
