package ee.peeyushlearningjava.MultiThreadingAndExecutorService.TrafficSignal;

public class RunTrafficSignal {

    public static void main(String[] args) {

        TrafficSignal red = new TrafficSignal(TrafficLightColors.RED);
        TrafficSignal yellow = new TrafficSignal(TrafficLightColors.YELLOW);
        TrafficSignal green = new TrafficSignal(TrafficLightColors.GREEN);

        red.run();
//        red.join();
        yellow.run();
//        yellow.join();
        green.run();

    }
}
