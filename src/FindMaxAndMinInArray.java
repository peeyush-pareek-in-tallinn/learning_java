import java.util.Scanner;

public class FindMaxAndMinInArray {

    public static void main(String[] args) {

        System.out.println("Welcome to the Max & Min in an Aray finder\n");
        Scanner input = new Scanner(System.in);
        int[] array = ArrayUtility.inputArray();
        int max = findMax(array);
        int min = findMin(array);
        System.out.println("The maximum number in your array is: " + max);
        System.out.println("The minimum number in your array is: " + min);

    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }
}
