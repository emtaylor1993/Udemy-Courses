public class ArrayLoopExamples {
    public static void main(String[] args) {
        int[] numbers = {22, 24, 26, 29, 30};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        String[] strArray = {"apple", "banana", "cherry"};
        for (int i = 0; i < strArray.length; i++) {
            System.out.print(strArray[i] + " ");
        }
        System.out.println();

        int[] grades = {95, 80, 85, 70, 90, 60, 88, 78};
        for (int i = 0; i < grades.length; i+=2) {
            System.out.print(grades[i] + " ");
        }
        System.out.println();

        int[] values = {3, 5, 7, 9, 11};
        for (int i = 0; i < values.length; i++) {
            System.out.print((values[i] * 2) + " ");
        }
        System.out.println();

        String[] colors = {"red", "green", "blue"};
        for (int i = 0; i < colors.length; i++) {
            System.out.print(colors[i].toUpperCase() + " ");
        }
        System.out.println();

        int[] data = {4, 7, 4, 1, 4, 9, 4};
        int targetValue = 4;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == targetValue) {
                System.out.println("Target Found: " + data[i] + " at index: " + i);
            }
        }
    }
}
