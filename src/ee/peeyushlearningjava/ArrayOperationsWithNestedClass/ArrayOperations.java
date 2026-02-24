package ee.peeyushlearningjava.ArrayOperationsWithNestedClass;

public class ArrayOperations {

    private int[] numbers;

    ArrayOperations (int[] numbers) {
        this.numbers = numbers;
    }

    class Statistics {

//        private int[] numbers;
//
//        Statistics (int[] numbers) {
//            this.numbers = numbers;
//        }
        double mean () {
            double sum = 0;
            for (int i : numbers) {
                sum += i;
            }
            return sum/ numbers.length;
        }

        double median () {
            return 0;
        }
    }
}
