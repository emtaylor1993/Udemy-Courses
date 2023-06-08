public class Doubles {
    public static void main(String[] args) {       
        int dice1 = rollDice();
        int dice2 = rollDice();

        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2);
        
        while (dice1 != dice2) {
            dice1 = rollDice();
            dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
        }

        System.out.println("You rolled doubles!");
    }

    /**
     * Function Name: rollDice -- rolls a dice between 1 and 6
     * @return randomInt (int)
     * 
     */
    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        int randomInt = (int) randomNumber + 1;
        return randomInt;
    }
}





