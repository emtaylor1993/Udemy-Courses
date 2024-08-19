/**
 * Payment
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Payment object.
 * 
 * @packages
 *    Java Time (LocalDate)
 */

import java.time.LocalDate;

public class Payment {
    private LocalDate date;
    private double amount;
  
    /**
     * Function Name: Payment
     * @param date   (LocalDate)
     * @param amount (double)
     * 
     * Constructor for the Payment object.
     */
    public Payment(LocalDate date, double amount) {
      this.date = date;
      this.amount = amount;
    }
  
    /**
     * Function Name: getDate
     * @return (LocalDate)
     * 
     * Getter for the date attribute.
     */
    public LocalDate getDate() {
      return date;
    }
  
    /**
     * Function Name: getAmount
     * @return (double)
     * 
     * Getter for the amount attribute.
     */
    public double getAmount() {
      return amount;
    }
}
