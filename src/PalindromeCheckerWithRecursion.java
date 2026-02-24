import java.util.Scanner;

public class PalindromeCheckerWithRecursion {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome using Recursion\n");
        Scanner input = new Scanner(System.in);
        String str = input.next();
        System.out.println(checkPalindrome(str) ? " is Palindrome" : " is Not Palindrome");
    }

    public static boolean checkPalindrome (String str) {
        if (str.length() <= 1) {
            return true;
        }
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }
        String str1 = str.substring(1, str.length() - 1);
        return checkPalindrome(str1);
    }
}
