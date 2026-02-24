package ee.peeyushlearningjava.MultiThreadingAndExecutorService.SynchronizeKeyword;

public class TestingSynchronize {

    public static void main(String[] args) {

        SynchronizedCounter counter = new SynchronizedCounter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        long startTime = System.currentTimeMillis();

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();

        System.out.printf("Final count is: %d\nTime taken: %s", counter.getCount(), (endTime - startTime));

    }
}
