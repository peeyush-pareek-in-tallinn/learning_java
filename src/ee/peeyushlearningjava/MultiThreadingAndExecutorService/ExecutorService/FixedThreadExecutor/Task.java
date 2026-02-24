package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExecutorService.FixedThreadExecutor;

public class Task implements Runnable {

//    private final char character;
//
//    Task (char character) {
//        this.character = character;
//    }

    public void run() {
        System.out.println();
        System.out.printf("Started: %s\n", Thread.currentThread().getName());
        try {
            Thread.sleep((long)((Math.random() * 5) * 1000));
//            for (int i = 1; i <= 10; i++) {
//                System.out.printf("%d:%s ", i, character);
//            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("Ended: %s\n", Thread.currentThread().getName());
    }
}
