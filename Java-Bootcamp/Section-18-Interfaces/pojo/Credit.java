/**
 * CREDIT
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the Credit object.
 * 
 * @packages
 *    Java Math (BigDecimal)
 */

package pojo;

import java.math.BigDecimal;

public class Credit extends Account {
    private BigDecimal credit;

    /**
     * Function Name: Credit
     * @param id     (String)
     * @param credit (BigDecimal)
     * 
     * Constructor for the Credit object.
     */
    public Credit(String id, BigDecimal credit) {
        super(id);
        this.credit = credit;
    }

    /**
     * Function Name: getCredit
     * @return (BigDecimal)
     * 
     * Getter for the credit attribute.
     */
    public BigDecimal getCredit() {
        return this.credit;
    }

    /**
     * Function Name: setCredit
     * @param credit (BigDecimal)
     * 
     * Setter for the credit attribute.
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * Function Name: clone
     * 
     * Clones the Credit object.
     */
    @Override
    public Account clone() {
        return new Credit(super.getId(), this.credit);
    }
}