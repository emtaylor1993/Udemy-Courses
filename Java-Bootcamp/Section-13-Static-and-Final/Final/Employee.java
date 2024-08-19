/**
 * EMPLOYEE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Employee object.
 * 
 * @packages
 *    None
 */

public class Employee {
    private String name;
    private int age;
    public static final int MIN_AGE = 18;
    public static final int MAX_AGE = 65;
    
    /**
     * Function Name: Employee
     * @param name (String)
     * @param age  (int)
     * 
     * Constructor for the Employee object.
     */
    public Employee(String name, int age) {
        setAge(age);
        setName(name);
    }

    /**
     * Function Name: getName
     * @return (String)
     * 
     * Getter for the name attribute.
     */
    public String getName() {
        return this.name;
    }
    
    /**
     * Function Name: setName
     * @param name (String)
     * 
     * Setter for the name attribute.
     */
    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("INVALID NAME");
        this.name = name;
    }

    /**
     * Function Name: getAge
     * @return (int)
     * 
     * Getter for the age attribute.
     */
    public int getAge() {
        return this.age;
    }

    /**
     * Function Name: setAge
     * @param age (int)
     * 
     * Setter for the age attribute.
     */
    public void setAge(int age) {
        if (age < MIN_AGE || age > MAX_AGE) throw new IllegalArgumentException("INVALID AGE");
        this.age = age;
    }
}