package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExecutorService.CallableAndFuture;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

    private final int num;

    public Task (int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws InterruptedException {
        Thread.sleep(3000);

        if (num < 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
