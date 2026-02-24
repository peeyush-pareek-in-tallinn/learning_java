package ee.peeyushlearningjava.MultiThreadingAndExecutorService.TrafficSignal;

public enum TrafficLightColors {

    RED(9000), YELLOW(2000), GREEN(3000);

    private final int onTime;

    TrafficLightColors(int onTime) {
        this.onTime = onTime;
    }

    public int getOnTime() {
        return onTime;
    }
}
