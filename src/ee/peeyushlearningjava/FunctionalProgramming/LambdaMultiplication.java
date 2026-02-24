package ee.peeyushlearningjava.FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

public class LambdaMultiplication {

    public static void main(String[] args) {

        // Creating a lambda in advance and then using it as an object
        BinaryOperator<Integer> multi = (a, b) -> a * b;
        System.out.println(multi.apply(4, 6));

        // Using 'reduce' and passing lambda as argument
        List<Integer> list = List.of(4, 6);
        int prod = list.stream().reduce(1, (a, b) -> a * b);
        System.out.println(prod);

        List<String> array = List.of("Ram", "Shyam", "Sita", "Gita");

        array.stream().forEach(a -> System.out.println(a));

        String result = array.stream()
                .filter(a -> a.length() > 3)
                .reduce("", (a, b) -> a.concat(b));

//        String result = array.stream()
//                .filter(a -> a.length() > 3)
//                .reduce("", (a, b) -> a + " " + b);

//        String result = array.stream()
//                .filter(a -> a.length() > 3).collect(Collectors.joining());

        System.out.println(result);

//        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
//        integerList.stream()
//                .filter(integer -> integer % 2 != 0)
//                .forEach(integer -> System.out.println(integer));

        List<Integer> integerList = List.of(1,2,3,4,5,6,7,8,9);
        integerList.stream()
                .filter(integer -> integer % 2 != 0)
                .forEach(System.out::println);
    }
}
