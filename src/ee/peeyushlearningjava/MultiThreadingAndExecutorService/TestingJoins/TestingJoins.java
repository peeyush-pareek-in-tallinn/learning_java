package ee.peeyushlearningjava.MultiThreadingAndExecutorService.TestingJoins;

import ee.peeyushlearningjava.MultiThreadingAndExecutorService.ImplementingRunnables.PrintRunnable;

public class TestingJoins {

    public static void main(String[] args) throws InterruptedException {

        PrintRunnable task1 = new PrintRunnable('*');
        PrintRunnable task2 = new PrintRunnable('$');
        PrintRunnable task3 = new PrintRunnable('#');

        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);

        thread1.start();
        thread2.start();
        thread1.join(); //Main thread stops here until the thread1 completes
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread3.start();

        System.out.println(thread3.getPriority());

        long endTime = System.currentTimeMillis();
        System.out.printf("Total Time Taken: %s mlSec", (endTime - startTime));
    }
}
