import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray () {

        // Taking user input for size of array
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the size of the array: ");
        int size = input.nextInt();
//        if (size < 1) {
//            System.out.println("Blank array not allowed!");
//            return false;
//        }
        int[] array = new int[size]; // Declaring the array of user provided size

        // Taking user input and assigning elements to the array
        int i = 0;
        while (i < size) {
            System.out.println("please provide element no " + (i + 1) + " : ");
            int element = input.nextInt();
            array[i] = element;
            i++;
        }
        return array;
    }

    public static void printArray(int[] array) {
        int i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    public static int[][] input2DArray () {

        // Taking user input for size of the 2D array
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of rows: ");
        int rows = input.nextInt();
        System.out.println("Please enter the number of columns: ");
        int columns = input.nextInt();
        int[][] twoDArray = new int[rows][columns]; // Declaring the array of user provided size in rows and columns

        // Taking user input and assigning elements to the array
        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < columns) {
                System.out.println("please provide the element for row " + (i + 1)
                        + " and " + " column " + (j+1) + " : ");
                int element = input.nextInt();
                twoDArray[i][j] = element;
                j++;
            }
            i++;
        }
        return twoDArray;
    }

//    public static void print2DArray(int[][] array2D) {
//        int i = 0;
//        while (i < array2D.length) {
//            int j = 0;
//            while (j < array2D.length)
//            System.out.print(array[i] + " ");
//            i++;
//        }
//        System.out.println();
//    }
}
