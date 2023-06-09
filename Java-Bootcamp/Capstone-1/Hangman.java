import java.util.Scanner;

public class Hangman {
    public static String[] words = {
        "ant", "baboon", "badger", "bat", "bear", "beaver", "camel",
        "cat", "clam", "cobra", "cougar", "coyote", "crow", "deer",
        "dog", "donkey", "duck", "eagle", "ferret", "fox", "frog", "goat",
        "goose", "hawk", "lion", "lizard", "llama", "mole", "monkey", "moose",
        "mouse", "mule", "newt", "otter", "owl", "panda", "parrot", "pigeon", 
        "python", "rabbit", "ram", "rat", "raven","rhino", "salmon", "seal",
        "shark", "sheep", "skunk", "sloth", "snake", "spider", "stork", "swan",
        "tiger", "toad", "trout", "turkey", "turtle", "weasel", "whale", "wolf",
        "wombat", "zebra"
    };

    public static String[] gallows = {
        "+---+\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "    |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        "+---+\n" +
        "|   |\n" +
        "O   |\n" +
        "|   |\n" +
        "    |\n" +
        "    |\n" +
        "=========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|   |\n" +
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "     |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" +
        "/    |\n" +
        "     |\n" +
        " =========\n",

        " +---+\n" +
        " |   |\n" +
        " O   |\n" +
        "/|\\  |\n" + 
        "/ \\  |\n" +
        "     |\n" +
        " =========\n"
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String randomWord = randomWord();
        int numIncorrectGuesses = 0;
        char guess = '_';
        char[] misses = new char[6];
        char[] placeholders = createPlaceholders(randomWord.length());
        char[] charArray = randomWord.toCharArray();

        while (numIncorrectGuesses < 6) {
            System.out.println(gallows[numIncorrectGuesses]);
            System.out.print("Word:\t\t");
            printPlaceholders(placeholders);
            System.out.print("\n\n");
            System.out.print("Misses:\t\t");
            printMisses(misses);
            System.out.print("\n\n");
            System.out.print("Guess:\t\t");
            guess = scanner.nextLine().charAt(0);
            
            if (randomWord.indexOf(guess) == -1) {
                misses[numIncorrectGuesses] = guess;
                numIncorrectGuesses++;

                if (numIncorrectGuesses == 6) {
                    System.out.println(gallows[numIncorrectGuesses]);
                    System.out.print("\n");
                    System.out.println("RIP!");
                    System.out.print("\n");
                    System.out.println("The word was: '" + randomWord + "'");
                    break;
                }
            } else {
                for (int i = 0; i < charArray.length; i++) {
                    if (charArray[i] == guess) {
                        placeholders = updatePlaceholders(i, placeholders, guess);
                    }
                }
                if (checkWin(placeholders)) {
                    System.out.println(gallows[numIncorrectGuesses]);
                    System.out.print("Word:\t\t");
                    printPlaceholders(placeholders);
                    System.out.print("\n\n");
                    System.out.println("GOOD WORK!");
                    break;
                }
            }
        }

        scanner.close();
    }

    /**
     * Function Name: randomWord
     * @return (String)
     * 
     * Inside the Function:
     *  1. Generate a random word from the list of words.
     */
    public static String randomWord() {
        int randomIndex = (int) (Math.random() * words.length);
        return words[randomIndex];
    }

    /**
     * Function Name: createPlaceholders
     * @param size  (int)
     * @return      (char[])
     * 
     * Inside the Function:
     *  1. Generates placeholders of the appropriate size.
     */
    public static char[] createPlaceholders(int size) {
        char[] placeholders = new char[size];
        for (int i = 0; i < size; i++) {
            placeholders[i] = '_';
        }
        return placeholders;
    }

    /**
     * Function Name: printPlaceholders
     * @param placeholders  (char[])
     * 
     * Inside the Function:
     *  1. Print out the placeholders.
     */
    public static void printPlaceholders(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            System.out.print(placeholders[i] + " ");
        }
    }

    /**
     * Function Name: updatePlaceholders
     * @param index         (int)
     * @param placeholders  (char[])
     * @param guess         (char)
     * @return              (char[])
     * 
     * Inside the Function:
     *  1. Update the placeholders by adding the correct guess at the correct index.
     */
    public static char[] updatePlaceholders(int index, char[] placeholders, char guess) {
        placeholders[index] = guess;
        return placeholders;
    }

    /**
     * Function Name: printMisses
     * @param misses
     * 
     * Inside the Function:
     *  1. Prints the misses that are incorrect.
     */
    public static void printMisses(char[] misses) {
        for (int i = 0; i < misses.length; i++) {
            System.out.print(misses[i]);
        }
    }

    /**
     * Function Name: checkWin
     * @param placeholders  (char[])
     * @return              (boolean)
     * 
     * Inside the Function:
     *  1. Checks whether the win conditions are met.
     */
    public static boolean checkWin(char[] placeholders) {
        for (int i = 0; i < placeholders.length; i++) {
            if (placeholders[i] == '_')
            return false;
        } 

        return true;
    }
}