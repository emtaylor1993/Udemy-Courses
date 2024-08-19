/**
 * WHILE LOOP EXAMPLES
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java while loops.
 * 
 * @packages
 *    None
 */

public class WhileLoopExamples {
    public static void main(String[] args) {
        int diceRoll = -1;
        while (diceRoll != 6) {
            diceRoll = rollDice();
            System.out.println(diceRoll);
        }

        System.out.println();

        int randomNumber = -1;
        while (randomNumber < 90) {
            randomNumber = generateRandomNumber();
            System.out.println(randomNumber);
        }

        System.out.println();

        int anotherRandomNumber = generateRandomNumber();
        while (anotherRandomNumber < 1000) {
            anotherRandomNumber *= 2;
            System.out.println(anotherRandomNumber);
        }
    }

    /**
     * Function Name: rollDice()
     * @return (int)
     * 
     * Returns a random integer between 1 and 6.
     */
    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    /**
     * Function Name: generateRandomNumber()
     * @return (int)
     * 
     * Returns a random integer between 1 and 100.
     */
    public static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }
}
