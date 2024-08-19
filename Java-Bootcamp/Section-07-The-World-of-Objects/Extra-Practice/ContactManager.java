/**
 * CONTACT MANAGER
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents the ContactManager class.
 * 
 * @packages
 *    None
 */

public class ContactManager {
    private Contact[] contacts;

    /**
     * Function Name: ContactManager
     * @param contacts (Contact[])
     * 
     * Constructor for the ContactManager class.
     */
    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < this.contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    /**
     * Function Name: getContact
     * @param index (int)
     * @return      (Contact)
     * 
     * Getter for the Contact attribute.
     */
    public Contact getContact(int index) {
        Contact contactCopy = new Contact(this.contacts[index]);
        return contactCopy;
    }

    /**
     * Function Name: setContact
     * @param index   (int)
     * @param contact (Contact)
     * 
     * Setter for the Contact attribute.
     */
    public void setContact(int index, Contact contact) {
        Contact contactCopy = new Contact(contact);
        this.contacts[index] = contactCopy;
    }
}
