package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ImplementingRunnables;

public class ImplementPrintRunnable {

    public static void main(String[] args) {

        PrintRunnable task1 = new PrintRunnable('*');
        PrintRunnable task2 = new PrintRunnable('$');
        PrintRunnable task3 = new PrintRunnable('#');

        long startTime = System.currentTimeMillis();

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        Thread thread3 = new Thread(task3);
        thread1.start();
        thread2.start();
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread3.start();

//        new Thread(task1).start();
//        new Thread(task2).start();
//        new Thread(task3).start();

        System.out.println(thread3.getPriority());

        long endTime = System.currentTimeMillis();
        System.out.printf("Total Time Taken: %s mlSec", (endTime - startTime));
    }
}
