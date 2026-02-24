package ee.peeyushlearningjava.FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {

    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("I am the Best");
            writer.flush();
            System.out.println("File " + fileName + " has been written");
        } catch (IOException e) {
            System.out.println("Exception occurred: " + e);
        }
    }
}
