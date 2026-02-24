package ee.peeyushlearningjava.FunctionalProgramming;

public class TestFunctionalInterface {

    public static void main(String[] args) {

        FunctionalInterface_IsPrime prime = num -> {
            for (int i = 2; i < num/2; i++) {
                if (num % i == 0) {
                    return false;
                }
            } return true;
        };
        System.out.println(prime.isPrime(7));
    }
}
