/**
 * ACCOUNT REPOSITORY
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the AccountRepository object.
 * 
 * @packages
 *    Java Utilities (HashMap, Map)
 *    POJO (Account)
 */

package repository;

import java.util.HashMap;
import java.util.Map;
import pojo.Account;

public class AccountRepository {
    private Map<String, Account> datastore = new HashMap<>();

    /**
     * Function Name: createAccount
     * @param account (Account)
     * 
     * Creates an account and adds it to the data store.
     */
    public void createAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    /**
     * Function Name: retrieveAccount
     * @param id (String)
     * @return   (Account)
     * 
     * Returns an Account with the matching id.
     */
    public Account retrieveAccount(String id) {
        return this.datastore.get(id).clone();
    }

    /**
     * Function Name: updateAccount
     * @param account (Account)
     * 
     * Updates the Account.
     */
    public void updateAccount(Account account) {
        this.datastore.put(account.getId(), account.clone());
    }

    /**
     * Function Name: deleteAccount
     * @param id (string)
     * 
     * Deletes the Account associated with the id.
     */
    public void deleteAccount(String id) {
        this.datastore.remove(id);
    }
}