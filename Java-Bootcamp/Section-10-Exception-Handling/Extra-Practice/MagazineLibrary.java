/**
 * MAGAZINE LIBRARY
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that represents a Magazine object.
 * 
 * @packages
 *    Java Utilities (ArrayList)
 */

import java.util.ArrayList;

public class MagazineLibrary {
    private ArrayList<Magazine> magazines;

    /**
     * Function Name: MagazineLibrary
     * 
     * Constructor for the MagazineLibrary object.
     */
    public MagazineLibrary() {
        this.magazines = new ArrayList<Magazine>();
    }

    /**
     * Function Name: getMagazine
     * @param index (int)
     * @return      (Magazine)
     * 
     * Getter for the Magazine attribute.
     */
    public Magazine getMagazine(int index) {
        return magazines.get(index);
    }

    /**
     * Function Name: setMagazine
     * @param index    (int)
     * @param magazine (Magazine)
     * 
     * Setter for the Magazine attribute.
     */
    public void setMagazine(int index, Magazine magazine) {
        this.magazines.set(index, new Magazine(magazine));
    }

    /**
     * Function Name: addMagazine
     * @param magazine (Magazine)
     * 
     * Adds the Magazine object to the list.
     */
    public void addMagazine(Magazine magazine) {
        this.magazines.add(new Magazine(magazine));
    }
}
