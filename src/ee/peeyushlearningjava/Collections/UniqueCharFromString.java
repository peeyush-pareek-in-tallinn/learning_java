package ee.peeyushlearningjava.Collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharFromString {

    public static void main(String[] args) {

        Set<Character> unique = new HashSet<>();
        System.out.print("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String userStr = input.next();

        for (char c : userStr.toCharArray()) {
            unique.add(c);
        }

        for (int i = 0; i < userStr.length(); i++) {
            unique.add(userStr.charAt(i));
        }
        System.out.printf("Your string has '%s' Unique Characters:\n%s", unique.size(), unique.toString());
    }
}
