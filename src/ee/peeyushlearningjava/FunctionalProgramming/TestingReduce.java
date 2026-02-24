package ee.peeyushlearningjava.FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1,2,3,4,5,6);

        int i = 0;
        for (Integer number : numbers) {
            i += number;
        }
        System.out.println(i);

        int strNumbers = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        });
        System.out.println(strNumbers);

        int strNumber2 = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(strNumber2);

        int min = numbers.stream().reduce(Integer.MAX_VALUE, (a, b) -> a < b ? a : b);
        System.out.printf("Min number in the Stream is: %d\n", min);

        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.printf("Max number in the Stream is: %d\n", max);
    }
}
