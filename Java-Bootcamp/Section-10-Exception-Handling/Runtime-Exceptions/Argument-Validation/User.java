/**
 * User
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a User object.
 * 
 * @packages
 *    None
 */

public class User {
    private String username;
    private int age;

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
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative.");
        }
        this.age = age;
    }

    /**
     * Function Name: getUsername
     * @return (String)
     * 
     * Getter for the username attribute.
     */
    public String getUsername() {
        return this.username;
    }

    /**
     * Function Name: setUsername
     * @param username (String)
     * 
     * Setter for the username attribute.
     */
    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or blank.");
        }
        this.username = username;
    }
}