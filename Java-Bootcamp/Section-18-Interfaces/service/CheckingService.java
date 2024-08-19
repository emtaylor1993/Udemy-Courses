/**
 * CHECKING SERVICE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the CheckingService object.
 * 
 * @packages
 *    Java Math (BigDecimal)
 *    POJO (Checking)
 *    Repository (AccountRepository)
 */

package service;

import java.math.BigDecimal;
import pojo.Checking;
import repository.AccountRepository;

public class CheckingService implements AccountService {
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
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().add(amount));
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
        Checking account = retrieveAccount(id);
        account.setBalance(account.getBalance().subtract(amount));
        updateAccount(account);
    }

    /**
     * Function Name: CheckingService
     * @param repository (AccountRepository)
     * 
     * Constructor for the CheckingService object.
     */
    public CheckingService(AccountRepository repository) {
        this.repository = repository;
    }

    /**
     * Function Name: createAccount
     * @param account (Checking)
     * 
     * Creates a new Checking account.
     */
    public void createAccount(Checking account) {
        this.repository.createAccount(account);
    }

    /**
     * Function Name: retrieveAccount
     * @param id (String)
     * @return   (Checking)
     * 
     * Returns a new Checking acccount.
     */
    public Checking retrieveAccount(String id) {
        return (Checking)this.repository.retrieveAccount(id);
    }

    /**
     * Function Name: updateAccount
     * @param account (Checking)
     * 
     * Updates a Checking account.
     */
    public void updateAccount(Checking account) {
        this.repository.updateAccount(account);
    }

    /**
     * Function Name: deleteAccount
     * @param id (String)
     * 
     * Deletes a Checking account.
     */
    public void deleteAccount(String id) {
        this.repository.deleteAccount(id);
    }
}