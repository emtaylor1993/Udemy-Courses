/**
 * ACCOUNT SERVICE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the AccountService object.
 * 
 * @packages
 *    Java Math (BigDeciaml)
 */

package service;

import java.math.BigDecimal;

public interface AccountService {
    public void deposit(String id, BigDecimal amount);
    public void withdraw(String id, BigDecimal amount);
}