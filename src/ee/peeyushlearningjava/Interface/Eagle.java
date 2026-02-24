package ee.peeyushlearningjava.Interface;

public class Eagle extends Bird {


    public Eagle() {
        super("Eagle");
    }

    @Override
    public void fly() {
        System.out.println("Bird - The Eagle is Flying...frr frrr frrrr...");
    }
}
