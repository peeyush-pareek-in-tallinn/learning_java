public class SumPositivesUsingContinue {

    public static void main(String[] args) {

        System.out.println("Welcome to Adding Positive numbers in an array");
        int [] array = ArrayUtility.inputArray();
        int sum = 0;
        for (int i : array) {
            if (i < 0) {
                continue;
            }
            sum += i;
        }
        System.out.print("Sum of all positive numbers in your array is: " + sum);
    }
}
