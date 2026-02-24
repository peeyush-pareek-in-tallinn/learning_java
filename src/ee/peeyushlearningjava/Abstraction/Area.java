package ee.peeyushlearningjava.Abstraction;
import java.util.Scanner;

public class Area {

    public static void main(String[] args) {


        System.out.println("\nWelcome to the Circle (Abstraction) program\n");
        Scanner input = new Scanner(System.in);

        System.out.print("Please provide the radius: ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println(circle.calculateArea());

        System.out.print("Please provide the side of your square: ");
        double side = input.nextDouble();
        Square square = new Square(side);
        System.out.println(square.calculateArea());
    }
}

