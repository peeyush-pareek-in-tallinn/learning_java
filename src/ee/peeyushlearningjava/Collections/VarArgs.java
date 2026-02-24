package ee.peeyushlearningjava.Collections;

public class VarArgs {

    public static void main(String[] args) {

        System.out.println(concatenate("ram", "shyam", "gita", "sita"));
        System.out.println(concatenate("ram", "sita"));

    }

    public static String concatenate (String... str) {

        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");

        } return sb.toString();
    }
}
