# Workbook 6.13

Re-write your print logic from Workbook 6.13 to use a nested loop.

### **Outer Loop**
```java
switch (i) {
    case 0: System.out.print("Baking: "); break;
    case 1: System.out.print("Beverage: "); break;
    case 2: System.out.print("Cereals: "); break;
}
```

### **Inner Loop**
```java
System.out.print(prices[i][j] + " ");
```
After the inner loop runs to completion, print a new line.
```java
System.out.print("\n");
```
### Final Result
![](https://firebasestorage.googleapis.com/v0/b/learnthepart-75aed.appspot.com/o/images%2F4e6538fb-c766-42cb-b859-d5916065d865?alt=media&token=43e44b2a-d1ff-4dc6-9628-4079e93ed5f3)
