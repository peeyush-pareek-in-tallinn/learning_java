package ee.peeyushlearningjava.MultiThreadingAndExecutorService.TrafficSignal;

public class TrafficSignal {

    private final TrafficLightColors color;

    TrafficSignal(TrafficLightColors color) {
        this.color = color;
    }

    public void run() {
        System.out.println(color);
        try {
            Thread.sleep(color.getOnTime());
        } catch (InterruptedException e) {
            System.out.println("Exception Occurred" + e.getMessage());
        }
    }
}
