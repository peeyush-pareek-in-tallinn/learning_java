package ee.peeyushlearningjava.Enums;

public enum Day {

//    MONDAY(true),
//    TUESDAY(true),
//    WEDNESDAY(true),
//    THURSDAY(true),
//    FRIDAY(true),
//    SATURDAY(false),
//    SUNDAY(false);

    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    WEDNESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend"),
    SUNDAY("Weekend");

    private final String type;

    Day(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
