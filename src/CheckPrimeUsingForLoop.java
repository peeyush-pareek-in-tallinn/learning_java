import java.util.Scanner;

public class CheckPrimeUsingForLoop {

    public static void main(String[] args) {

        System.out.println("Welcome to Prime Checker\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the number you want to check: ");
        int number = input.nextInt();

        if (number <= 1) {
            System.out.println("Your number " + number + " is Not a Prime");
            return;
        }

        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                System.out.println(number + " is Not a Prime Number");
                return;
            }
        }
        System.out.println(number + " is a Prime Number");
    }
}
