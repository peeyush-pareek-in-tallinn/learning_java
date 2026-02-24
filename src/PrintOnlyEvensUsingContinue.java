public class PrintOnlyEvensUsingContinue {

    public static void main(String[] args) {

        System.out.println("Welcome to Printing Even Numbers using Continue");

        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
