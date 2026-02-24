package ee.peeyushlearningjava.MultiThreadingAndExecutorService;

public class PrintFromThreads extends Thread{

    private int x;

    PrintFromThreads (int x){
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + "-> Hello from thread " + x);
        }
    }
}
