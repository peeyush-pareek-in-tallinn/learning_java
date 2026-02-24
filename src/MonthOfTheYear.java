import java.util.Scanner;

public class MonthOfTheYear {

    public static void main(String[] args) {

        System.out.println("Welcome to the Month finder\n");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the number of the Month: ");
        int numOfMonth = input.nextInt();
        String month = monthOfTheYear(numOfMonth);
        System.out.println(month);
    }

    public static String monthOfTheYear(int numOfMonth) {
        String month = switch (numOfMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            case 0 -> "That's not a Month!";
            default -> "Year has only 12 Months! :)";
        };
        return month;
    }
}
