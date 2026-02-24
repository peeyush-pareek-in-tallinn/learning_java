package ee.peeyushlearningjava.Geometry_TestingImport;

import ee.peeyushlearningjava.Geometry.Circle;
import ee.peeyushlearningjava.Geometry.Rectangle;

public class Calculator {


    public static void main(String[] args) {

        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Circle: " + 2 * Math.PI * circle.radius);
        System.out.println("Rectangle: " + rectangle.length * rectangle.width);
    }
}
