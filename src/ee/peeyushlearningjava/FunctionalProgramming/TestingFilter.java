package ee.peeyushlearningjava.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "grapes", "Orange");

        // Printing using normal for loop
        System.out.println("Printing using normal for loop");
        for (String s : fruits) {
            System.out.println(s);
        }

        // Printing using stream
        System.out.println("Printing using stream");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        // Printing using stream and lambda
        System.out.println("Printing using stream and lambda");
        fruits.stream().forEach(s -> System.out.println(s));

        // Printing using stream and lambda and filter
        System.out.println("Printing using stream and lambda and filter");
        fruits.stream()
              .filter(s -> s.contains("n") || s.contains("a"))
              .forEach(s -> System.out.println(s));
    }
}
