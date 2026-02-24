import java.util.Scanner;

class GuessingRandomNumber {

    int randomNumber;

    GuessingRandomNumber () {
        randomNumber = (int)(Math.random() * 100) + 1;
    }

    int guess (int userGuess) {
        return userGuess - randomNumber;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        GuessingRandomNumber computerNumber = new GuessingRandomNumber();
        System.out.println("Welcome to the Random Number Guessing game\n");
        System.out.print("Please guess a Number from 1 to 100 or 0 to Exit the Game: ");
        int userGuess;
        int result;
//        int computerGuess = (int)(Math.random() * 100)+1;
        do {
            userGuess = input.nextInt();
            result = computerNumber.guess(userGuess);
            if (userGuess == 0) {
                System.out.print("It was nice playing with you! Bye :)");
                return;
            }
            if (result == 0) {
                System.out.println("Congrats!");
            } else if (result < 0) {
                System.out.println("Guess a Higher Number: ");
            } else {
                System.out.println("Guess a Lower Number: ");
            }
        } while (result != 0);
    }
}
