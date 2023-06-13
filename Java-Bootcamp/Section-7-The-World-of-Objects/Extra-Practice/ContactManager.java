public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[] contacts) {
        this.contacts = new Contact[contacts.length];
        for (int i = 0; i < this.contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    public Contact getContact(int index) {
        Contact contactCopy = new Contact(this.contacts[index]);
        return contactCopy;
    }

    public void setContact(int index, Contact contact) {
        Contact contactCopy = new Contact(contact);
        this.contacts[index] = contactCopy;
    }
}
