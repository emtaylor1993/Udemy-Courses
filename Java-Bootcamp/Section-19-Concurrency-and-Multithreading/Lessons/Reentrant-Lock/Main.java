import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
// import java.util.concurrent.locks.ReentrantLock;

public class Main {
    static AtomicInteger counter = new AtomicInteger(0);
    
    public static void main(String[] args) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(numThreads);
        CountDownLatch latch = new CountDownLatch(11);
        // ReentrantLock lock = new ReentrantLock();
        
        for (int index = 0; index < 11; index++) {
            // executor.submit(() -> task(lock, latch))
            executor.submit(() -> task(latch));
        }

        try {
            latch.await();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            executor.shutdown();
        }
        System.out.println(counter);
    }
    
    // public static void task(ReentrantLock lock, CountDownLatch latch) {
    public static void task(CountDownLatch latch) {
        //some really long operations that need to run in the background...
        for (int i = 0; i < 10000; i++) {
            // lock.lock();
            counter.addAndGet(1); // there happens to be a line that updates the counter variable. 
            // lock.unlock();
            // No need to use locks when using Atomic Types
        }
        //more really long operations...
        latch.countDown();
    }
}