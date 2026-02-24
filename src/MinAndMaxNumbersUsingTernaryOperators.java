import java.util.Scanner;

public class MinAndMaxNumbersUsingTernaryOperators {

    public static void main(String[] args) {
        System.out.print("Welcome to the Greater & Lessor Number finder\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the first number: ");
        int firstNum = input.nextInt();
        System.out.print("Now please provide the second number: ");
        int secondNum = input.nextInt();

        int greaterNumber = firstNum > secondNum ? firstNum : secondNum;
        System.out.println(greaterNumber + " is the Greater Number");

        int smallerNumber = firstNum > secondNum ? secondNum : firstNum;
        System.out.println(smallerNumber + " is the Smaller number");

    }
}
