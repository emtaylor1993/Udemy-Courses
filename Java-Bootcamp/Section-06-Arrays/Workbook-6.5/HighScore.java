/**
 * HIGH SCORE
 * 
 * @author Emmanuel Taylor
 * 
 * @description
 *    This is a simple class that illustrates Java Arrays being used
 *    to print out the high score.
 * 
 * @packages
 *    None
 */

public class HighScore {
    public static void main(String[] args) {
        int[] scores = {
            randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
            randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()
        };
        int highScore = 0;
        
        System.out.print("Here are the scores: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
    }

    /**
     * Function Name - randomNumber
     * @return (int)
     * 
     * Inside the function
     *  - returns a random number between 0 to 49999
     */
    public static int randomNumber() {
        return (int) (Math.random() * 50000);
    }
}
