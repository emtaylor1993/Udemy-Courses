/**
 * CHECKING
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Checking object.
 * 
 * @packages
 *    Java Math (BigDecimal)
 */

package pojo;

import java.math.BigDecimal;

public class Checking extends Account {
    private BigDecimal balance;

    /**
     * Function Name: Checking
     * @param id      (String)
     * @param balance (BigDecimal)
     * 
     * Constructor for the Checking object.
     */
    public Checking(String id, BigDecimal balance) {
        super(id);
        this.balance = balance;
    }
 
    /**
     * Function Name: getBalance
     * @return (BigDecimal)
     * 
     * Getter for the balance attribute.
     */
    public BigDecimal getBalance() {
        return this.balance;
    }

    /**
     * Function Name: setBalance
     * @param balance (BigDecimal)
     * 
     * Setter for the balance attribute.
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * Function Name: clone
     * 
     * Clones the Checking object.
     */
    @Override
    public Account clone() {
        return new Checking(super.getId(), this.balance);
    }
}