import java.util.Scanner;

public class ConcatenateArrayOfWords {

    public static void main(String[] args) {

        System.out.println("\nWelcome to the Array of Words concatenating utility\n");
        String[] array1 = {"Apple", "Banana", "Mango"};
        String[] array2 = {"Potato", "Tomato", "Chilli"};
        StringBuilder array3 = new StringBuilder();
        for (String element: array1) {
            array3.append(element).append(" ");
        }
        for (int i = 0; i < array2.length; i++) {
            array3.append(array2[i]).append(" ");
        }
//        String finalString = array3.toString();
        System.out.println(array3);
    }
}
