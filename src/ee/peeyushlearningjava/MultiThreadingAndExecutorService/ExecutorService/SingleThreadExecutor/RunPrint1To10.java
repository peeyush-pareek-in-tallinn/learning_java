package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExecutorService.SingleThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunPrint1To10 {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newSingleThreadExecutor()) {
            Runnable print = new Print1To10();
            service.submit(print);
            service.shutdown();
        }
    }
}
