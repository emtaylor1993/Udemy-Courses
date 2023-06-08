public class ForLoopExamples {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world!");
        }

        for (int i = 1; i < 11; i++) {
            System.out.print((i * 5) + " ");
        }
        
        System.out.println();
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        for (int i = 0; i < 19; i+=2) {
            System.out.print(i + " ");
        }
    }
}
