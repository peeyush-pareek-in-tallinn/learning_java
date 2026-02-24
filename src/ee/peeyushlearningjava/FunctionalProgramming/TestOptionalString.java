package ee.peeyushlearningjava.FunctionalProgramming;

public class TestOptionalString {

    public static void main(String[] args) {

        String str = "Apple";

        FunctionForOptionalString callStr = new FunctionForOptionalString();
        callStr.isStringPresent(str)
                .ifPresentOrElse(s -> System.out.println(s.toUpperCase()),
                () -> System.out.println("Empty String!"));
    }
}
