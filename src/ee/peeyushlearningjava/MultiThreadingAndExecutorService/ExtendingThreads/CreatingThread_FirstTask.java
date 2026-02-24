package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExtendingThreads;

public class CreatingThread_FirstTask extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        } System.out.printf("\n%s * task complete: \n", Thread.currentThread().getName());
    }
}
