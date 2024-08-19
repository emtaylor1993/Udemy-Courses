/**
 * USER
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the User class.
 * 
 * @packages
 *    None
 */

public class User {
    private String firstName;
    private String lastName;
    private static int userCount = 0;

    /**
     * Function Name: User
     * @param firstName (String)
     * @param lastName  (String)
     * 
     * Constructor for the User object.
     */
    public User(String firstName, String lastName) {
        userCount++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Function Name: getFirstName
     * @return (String)
     * 
     * Getter for the firstName attribute.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Function Name: setFirstName
     * @param firstName (String)
     * 
     * Setter for the firstName attribute.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Function Name: getLastName
     * @return (String)
     * 
     * Getter for the lastName attribute.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Function Name: setLastName
     * @param lastName (String)
     * 
     * Setter for the lastName attribute.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Function Name: getUserCount
     * @return (int)
     * 
     * Getter for the userCount attribute.
     */
    public static int getUserCount() {
        return userCount;
    }
}