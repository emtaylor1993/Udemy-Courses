/**
 * ACCOUNT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents an Account object.
 * 
 * @packages
 *    None
 */

package pojo;

public abstract class Account {
    private String id;

    /**
     * Function Name: Account
     * @param id (String)
     * 
     * Constructor for the Account object.
     */
    public Account(String id) {
        this.id = id;
    }

    /**
     * Function Name: getId
     * @return (String)
     * 
     * Getter for the id attribute.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Function Name: setId
     * @param id (String)
     * 
     * Setter for the id attribute.
     */
    public void setId(String id) {
        this.id = id;
    }

    public abstract Account clone();
}