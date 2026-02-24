package ee.peeyushlearningjava.Polymorphism;

public class Calculator {

    void add (int a, int b) {
        System.out.println(a + b);
    }

    void add (int a, int b, int c) {
        System.out.println(a + b + c);
    }

    void add (double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {

        int x = 2;
        int y = 3;
        int z = 4;
        double m = 567.6;
        double n = 89.6;

        Calculator calculator = new Calculator();
        calculator.add(x, y);
        calculator.add(x, y, z);
        calculator.add(m, n);
    }
}
