package ee.peeyushlearningjava.MultiThreadingAndExecutorService.SynchronizeKeyword;

class SynchronizedCounter {

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
