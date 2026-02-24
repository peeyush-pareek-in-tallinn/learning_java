package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExecutorService.CallableAndFuture;

import java.util.ArrayList;
import java.util.concurrent.*;
import java.util.List;

public class PrintTask {

    public static void main(String[] args) {

        try (ExecutorService service = Executors.newFixedThreadPool(3);) {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i <= 10; i++) {
                Callable<Integer> fact = new Task(i);
                list.add(service.submit(fact));
            }

            for (int i = 0; i < list.size(); i++) {
                System.out.printf("\nFactorial of %d is: %s", i, list.get(i).get());
            }

//            for (Future<Integer> factorial : list) {
//                System.out.printf("\nFactorial of is: %s", factorial.get());
//            }

            service.shutdown();

            if(!service.awaitTermination(5, TimeUnit.SECONDS)) {
                System.out.println();
                System.out.println("Emergency Shutdown");
                service.shutdownNow();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
