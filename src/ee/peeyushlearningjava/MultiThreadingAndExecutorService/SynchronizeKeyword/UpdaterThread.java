package ee.peeyushlearningjava.MultiThreadingAndExecutorService.SynchronizeKeyword;

class UpdaterThread extends Thread{

    private final SynchronizedCounter counter;

    public UpdaterThread(SynchronizedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}