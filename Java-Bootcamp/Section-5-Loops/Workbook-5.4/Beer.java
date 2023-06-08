public class Beer {
    public static void main(String[] args) {
        for (int i = 99; i >= 1; i--) {
            sing(i);
        }
    }

    /**
     * Function Name: sing
     * @param i (int)
     * 
     * Inside the Function:
     *  1. print:
     *      <i> bottles of beer on the wall, <i> bottles of beer!
     *      take one down, pass it around, <i-1> bottles of beer on the wall!
     */
    public static void sing(int i) {
        System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
        System.out.println("take one down, pass it around, " + (i - 1) + " bottles of beer on the wall!");
    }
}
