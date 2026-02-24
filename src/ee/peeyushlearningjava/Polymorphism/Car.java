package ee.peeyushlearningjava.Polymorphism;

public class Car extends Vehicle{

    @Override
    void service() {
        super.service();
        System.out.println("Service Done for your Car");

    }

    public static void main(String[] args) {
        Car car = new Car();
        car.service();

    }
}
