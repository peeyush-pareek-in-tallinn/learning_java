import java.util.Scanner;

public class DayOfTheWeekUsingSwitch {

    public static void main(String[] args) {
        System.out.println("Welcome to Day of the Week finder");
        Scanner input = new Scanner(System.in);
        System.out.print("Please provide the number of the week: ");
        int dayNum = input.nextInt();
        oldSwitch(dayNum);
        newSwitch(dayNum);
    }

    public static void newSwitch (int num) {
        String day = switch (num) {
            case 1 -> "Modnay";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Holiday";
            default -> "Invalid Day";
        };
        System.out.print(day);
    }


    public static void oldSwitch (int num) {
        switch (num) {
            case 1: System.out.println("yeeeee! It's Monday today!");
                break;
            case 2: System.out.println("yeeee! It's Tuesday today!");
                break;
            case 3: System.out.println("yeee! It's Wednesday today!");
                break;
            case 4: System.out.println("yee! It's Thursday today!");
                break;
            case 5: System.out.println("ye! It's Friday today!");
                break;
            case 6:
            case 7: System.out.println("yeeeeee It's a Holiday today");
                break;
            default: System.out.println("You are tired! There are only 7 days in a week!");
        }
    }
}
