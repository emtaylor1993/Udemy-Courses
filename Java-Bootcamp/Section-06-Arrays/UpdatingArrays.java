/**
 * UPDATING ARRAYS
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates how to update
 *    Java Arrays.
 * 
 * @packages
 *    Java Utilities (Arrays)
 */

import java.util.Arrays;

public class UpdatingArrays {
    public static void main(String[] args) {
        String[] menu = {"Espesso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        System.out.println(Arrays.toString(menu));

        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            newMenu[i] = menu[i];
        }
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
}
