package ee.peeyushlearningjava.FunctionalProgramming;

import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {

        // Factorial using simple Main program
        int num1 = 0;
        int fact1 = 1;
        for (int i = 1; i <= num1; i++) {
            fact1 *= i;
        }
        System.out.println("Factorial using simple Main program: " + fact1);

        // Factorial using interface + lambda
        FindFactorial fact = num -> {
            int result = 1;
            for (int i = 1; i <= num; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println("Factorial using interface + lambda: " + fact.findFactorial(0));

        // Factorial using interface + lambda with IntStream
        System.out.print("Factorial using interface + lambda with IntStream: ");
        int num = 0;
        System.out.println(IntStream.rangeClosed(2, num).reduce(1, (a, b) -> a * b));
    }
}
