import java.util.Scanner;

public class UsingBreakToExit {

    public static void main(String[] args) {

        System.out.println("Welcome to Break");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i >= 0;) {
            System.out.print("Please enter a number: ");
            String num = input.next();
            if (num.equalsIgnoreCase("exit")) {
                break;
            }
        }
        System.out.println("You have been successfully exited!");
    }
}
