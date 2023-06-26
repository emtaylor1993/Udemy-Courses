public class MultiThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> longTask());
        thread.start();
        System.out.println("OH NO, A BIG ERROR OCCURRED IN THE MAIN THREAD. LET'S INTERRUPT THE BACKGROUND THREAD.");
        thread.interrupt();
        System.out.println(thread.isInterrupted());
        System.out.println("Doing other work on main thread");  
    }

    public static void longTask() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Done Sleeping");
        }

        long t = System.currentTimeMillis();
        long end = t + 3000;

        while (true) {
            if (System.currentTimeMillis() == end) {
                System.out.println("Finished long task");
                break;
            } else if (Thread.currentThread().isInterrupted()) {
                System.out.println("This task has been interrupted prematurely.");
                break;
            }
        }
    }
}