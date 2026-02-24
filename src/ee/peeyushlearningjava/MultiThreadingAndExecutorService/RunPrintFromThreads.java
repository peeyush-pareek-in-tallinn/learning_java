package ee.peeyushlearningjava.MultiThreadingAndExecutorService;

public class RunPrintFromThreads {

    public static void main(String[] args) {

        PrintFromThreads thread1 = new PrintFromThreads(1);
        PrintFromThreads thread2 = new PrintFromThreads(2);

        System.out.println("Thread 1 is in: " + thread1.getState());
        System.out.println("Thread 2 is in: " + thread2.getState());

        thread1.start();
        System.out.println("Thread 1 is in: " + thread1.getState());

        try {
            Thread.sleep(5000);
            System.out.println("Thread 1 is now in: " + thread1.getState());

            thread2.start();
            System.out.println("Thread 2 is in: " + thread2.getState());

            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred" + e.getMessage());
        }
        System.out.println("Thread 2 is in: " + thread2.getState());
    }
}
