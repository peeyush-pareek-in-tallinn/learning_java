package ee.peeyushlearningjava.MultiThreadingAndExecutorService;

public class NeedOfMultiThreading {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);
        } System.out.println("\n* tast complete");

        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);

        } System.out.println("\n$ tast complete");

        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);

        } System.out.println("\n# tast complete");
        long endTime = System.currentTimeMillis();
        System.out.printf("Time taken: %d Milli Seconds", endTime - startTime);
    }
}
