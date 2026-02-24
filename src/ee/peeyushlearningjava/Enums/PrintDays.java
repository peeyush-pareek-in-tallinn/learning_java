package ee.peeyushlearningjava.Enums;

public class PrintDays {

    public static void main(String[] args) {

        for (Day day : Day.values()) {
            System.out.println(day);
            System.out.printf("%s: %s\n", day, day.getType());
        }
    }
}
