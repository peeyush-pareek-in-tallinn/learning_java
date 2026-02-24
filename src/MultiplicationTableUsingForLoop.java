import java.util.Scanner;

public class MultiplicationTableUsingForLoop {

    public static void main(String[] args) {

        System.out.println("Welcome to the Multiplication Table utility\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Which table you want to see?: ");
        int number = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }
}
