package ee.peeyushlearningjava.MultiThreadingAndExecutorService.ExtendingThreads;

public class CreatingThread_AllTasksInMain {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        CreatingThread_FirstTask firstTask = new CreatingThread_FirstTask();
        CreatingThreads_SecondTask secondTask = new CreatingThreads_SecondTask();
        CreatingThreads_ThirdTask thirdTask = new CreatingThreads_ThirdTask();

        firstTask.start();
        secondTask.start();
        thirdTask.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("%s Time taken: %d ml Sec ",
                Thread.currentThread().getName(), endTime - startTime);
    }
}
