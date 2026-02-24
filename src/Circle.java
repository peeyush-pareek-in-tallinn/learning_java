import java.util.Scanner;

public class Circle {

    double radius; // Instance variable | Class ka data

    Circle (double radius) { // Object constructor
        this.radius = radius;
    }

    double area () { // Class ka behaviour
        return Math.PI * Math.pow(radius, 2);
    }

    double circumference() { // Class ka behaviour
        return 2 * Math.PI * radius;
    }

    public String toString() { // toString over-rider
        return "Circle Details\nRadius of the circle: " + radius + "\nCircumference of the circle: " + circumference() + "\nArea of the circle: " + area() + " (sqrd)";
    }

    public static void main(String[] args) {

        System.out.println("\nWelcome to the World of Circle\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the Radius of your circle: ");
        double radius = input.nextInt();
        Circle circle = new Circle(radius);
        System.out.println(circle);

        // Non-Object Oriented program

//        double area = area (radius); // Area of a circle = Pi * radius to power2
//        double circumference = circumference(radius); // Circumference of a circle = 2 * Pi * r
//        System.out.printf("The radius you provided was: %f\nCircumference of your circle is: %.2f\nAnd the Area of your circle is: %.2f", radius, circumference, area);
    }

//    public static double area (double radius) {
//        return Math.PI * Math.pow(radius, 2);
//    }
//
//    public static double circumference(double radius) {
//        return 2 * Math.PI * radius;
//    }
}
