import java.util.Scanner;

public class EvenAndOddFinder {

    public static void main(String[] args) {

        System.out.println("Welcome to the Even & Odd Finder\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the number you want to check: ");
        int number = input.nextInt();
        boolean isEven = checkEvenOdd (number);
        if (isEven) {
            System.out.print(number + " is an Even Number");
        } else {
            System.out.print(number + " is an Odd Number");
        }

    }

    public static boolean checkEvenOdd (int number) {
        boolean isEven = number % 2 == 0 ? true : false;
        return isEven;
    }
}
