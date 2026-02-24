package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExecutorService.FixedThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunTheTask {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(5)) {
            Runnable t1 = new Task();
//            Runnable t2 = new Task();
//            Runnable t3 = new Task();

            for (int i = 0; i < 10; i++) {
                service.submit(t1);
            }

//        Thread.sleep((long)((Math.random() * 5) * 1000));
//            service.submit(t2);
//        Thread.sleep((long)((Math.random() * 5) * 1000));
//            service.submit(t3);

            service.shutdown();
            try {
                service.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                System.out.println("Emergency Shutdown");
                service.shutdownNow();
            }
        }

    }
}
