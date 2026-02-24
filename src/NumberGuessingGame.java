import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {

        System.out.println("Welcome to the Number Guessing Game");
        Scanner input = new Scanner(System.in);
        int num = 6;
        int guessNumber;
        do {
            System.out.print("Please guess the number: ");
            guessNumber = input.nextInt();
        } while (guessNumber != num);
        System.out.println("You guessed it right! ");
    }
}
