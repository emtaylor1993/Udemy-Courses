/**
 * CREDIT SERVICE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the CheckingService object.
 * 
 * @packages
 *    Java Math (BigDecimal)
 *    POJO (Credit)
 *    Repository (AccountRepository)
 */

package service;

import java.math.BigDecimal;
import pojo.Credit;
import repository.AccountRepository;

public class CreditService implements AccountService {
    private AccountRepository repository;

    /**
     * Function Name: deposit
     * @param id     (String)
     * @param amount (BigDecimal)
     * 
     * Updates the balance of the account.
     */
    @Override
    public void deposit(String id, BigDecimal amount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().subtract(amount));
        updateAccount(account);   
    }
    
    /**
     * Function Name: withdraw
     * @param id     (String)
     * @param amount (BigDecimal)
     * 
     * Updates the balance of the account.
     */
    @Override
    public void withdraw(String id, BigDecimal amount) {
        Credit account = retrieveAccount(id);
        account.setCredit(account.getCredit().add(amount));
        updateAccount(account);           
    }

    /**
     * Function Name: CreditService
     * @param repository (AccountRepository)
     * 
     * Constructor for the CreditService object.
     */
    public CreditService(AccountRepository repository) {
        this.repository = repository;
    }

    /**
     * Function Name: createAccount
     * @param account (Credit)
     * 
     * Creates a new Credit account.
     */
    public void createAccount(Credit account) {
        this.repository.createAccount(account);
    }

    /**
     * Function Name: retrieveAccount
     * @param id (String)
     * @return   (Credit)
     * 
     * Returns a new Credit account.
     */
    public Credit retrieveAccount(String id) {
        return (Credit)this.repository.retrieveAccount(id);
    }

    /**
     * Function Name: updateAccount
     * @param account (Credit)
     * 
     * Updates the Credit account.
     */
    public void updateAccount(Credit account) {
        this.repository.updateAccount(account);
    }

    /**
     * Function Name: deleteAccount
     * @param id (String)
     * 
     * Deletes the Credit account.
     */
    public void deleteAccount(String id) {
        this.repository.deleteAccount(id);
    }
}