import java.util.Scanner;

public class FibonacciSeriesUsingRecursion {

    public static void main(String[] args) {

        System.out.println("Welcome to Fib Series generator using Recursion");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide a number: ");
        int number = input.nextInt();
        System.out.print("Fibonacci Numbers until " + number + " are: ");
        fibSeriesNonRecursive(number);
        System.out.println();
        System.out.print(number + " numbers in the Fibonacci series are: ");
        for (int i = 1; i <= number; i++) {
            System.out.print(fibSeries(i) + " ");
        }
    }

    // Printing Fibonacci Series Until a provided number without a Recursive call
    public static void fibSeriesNonRecursive (int num) {
        System.out.print(0);
        int temp1 = 1;
        int fib = 0;
        while (temp1 + fib <= num) {
            fib = fib + temp1;
            temp1 = fib - temp1;
            System.out.print(", " + fib);
        }
    }

    // Printing provided number of Fibonacci Numbers with a Recursive call
    public static int fibSeries (int num) {
        if (num == 1) {
            return 0;
        }
        if (num == 2) {
            return 1;
        }
        return fibSeries(num - 1) + fibSeries(num - 2);
    }
}
