/**
 * HIGH SCORE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java Arrays to print
 *    out the high score.
 * 
 * @packages
 *    None
 */

public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};
        int seat = 0;
        int highScore = 0;

        System.out.print("Here are the scores: ");    
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat = i + 1;
            }
        }
       
        System.out.println("\n\nThe highest score is: " + highScore + ". Impressive!");
        System.out.println("It's the gentleman in seat: " + seat + ". Give that man a cookie!");
    }
    
    /**
     * Function Name: randomNumber
     * @return (int)
     * 
     * Returns a random number between 0 and 50000.
     */
    public static int randomNumber() {
        double randomDouble = Math.random() * 50000;
        int randomInt = (int)randomDouble;
        return randomInt;
    }
}
