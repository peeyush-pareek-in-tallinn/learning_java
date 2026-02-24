package ee.peeyushlearningjava.Geometry;

public class Circle {

    public double radius;
    public double getCircleArea;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getCircleArea(double radius) {
        return 2 * Math.PI * radius;
    }
}
