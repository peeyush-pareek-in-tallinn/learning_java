import java.util.Scanner;

public class simpleCalculatorUsingSwitch {

    public static void main(String[] args) {

        System.out.println("Welcome to the Simple Calculator\n");
        Scanner input = new Scanner(System.in);
        System.out.print("What is yor first number: ");
        float num1 = input.nextFloat();
        System.out.print("What do you want to do ? ");
        String operation = input.next();
        System.out.print("What is your second number: ");
        float num2 = input.nextFloat();
//        System.out.print("What do you want to do ?" +
//                "\n Enter 1: for Addition" +
//                "\n Enter 2: for Substraction" +
//                "\n Enter 3: for Multiplication" +
//                "\n Enter 4: for Division\n : ");
//        int operation = input.nextInt();
        calculator(num1, num2, operation);

    }

    public static void calculator(float num1, float num2, String operation) {
        float result;
        switch (operation) {
            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "*" -> result = num1 * num2;
            case "/" -> result = num1 / num2;
            default -> {
                System.out.print("Invalid Action");
                return;
            }
        }
        System.out.println("Your result is: " + result);
    }
}
