import java.util.Scanner;

public class CalculateAbsoluteValue {

    public static void main(String[] args) {

        System.out.println("Welcome to the Absolute Value finder\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide your number: ");
        int number = input.nextInt();
        int absNumber = findAbsoluteValue (number);
        System.out.println(absNumber + " is the Absolute value of number");

    }

    public static int findAbsoluteValue (int number) {
        return number < 0 ? -(number) : number;
    }
}
