package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExecutorService.SingleThreadExecutor;

public class Print1To10 implements Runnable{

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number is " + i);
        }
    }
}
