import java.util.Objects;
import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {

        System.out.println("Welcome to the password checker\n");
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please provide your password: ");
            password = input.next();
            }
            while (!isValidPassword(password));
        System.out.println("Your password is correct");
    }

    public static boolean isValidPassword (String password) {
        return password.equals("Abcd1234");
    }
}
