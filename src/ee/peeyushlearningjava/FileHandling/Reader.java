package ee.peeyushlearningjava.FileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please provide the file name: ");
        String fileName = input.nextLine();
//        String fileName = "java-course.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            while ((read = reader.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Your File was not found");
        } catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
    }
}
