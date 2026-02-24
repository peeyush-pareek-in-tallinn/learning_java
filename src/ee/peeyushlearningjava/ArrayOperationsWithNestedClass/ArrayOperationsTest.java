package ee.peeyushlearningjava.ArrayOperationsWithNestedClass;

public class ArrayOperationsTest {

    public static void main(String[] args) {

        ArrayOperations arrayOpr = new ArrayOperations(new int[] {1, 2, 3, 4});
        ArrayOperations.Statistics statistics = arrayOpr.new Statistics();
//        ArrayOperations.Statistics statistics = new ArrayOperations.Statistics(new int[]{1, 2, 3, 4});


        System.out.println(statistics.mean());
    }
}
