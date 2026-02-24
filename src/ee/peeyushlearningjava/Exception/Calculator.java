package ee.peeyushlearningjava.Exception;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Calculator");
        System.out.print("Please enter your first number: ");
        int num1 = input.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = input.nextInt();

        try {
            int res = num1 / num2;
            System.out.println(res);
        } catch (ArithmeticException e) {
            if (e.getMessage().equals("/ by zero")) {
                System.out.println("Division by Zero is not valid");
            } else {
                throw e;
            }
        }
    }
}
