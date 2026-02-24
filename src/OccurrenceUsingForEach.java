import java.util.Scanner;

public class OccurrenceUsingForEach {

    public static void main(String[] args) {

        System.out.println("Welcome to the Occurrence Checker\n");
        Scanner input = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        System.out.print("Please provide the number you want to search for: ");
        int number = input.nextInt();
        int occ = checkOcc(array, number);
        System.out.print(number + " occurs " + occ + " times in your array");

    }

    public static int checkOcc (int[] array, int number) {
        int occ = 0;
        for (int i : array) {
            if (i == number) {
                occ++;
            }
        }
        return occ;
    }
}
