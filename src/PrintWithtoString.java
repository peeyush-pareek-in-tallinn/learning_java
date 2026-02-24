public class PrintWithtoString {

    int age;
    String name;
    String rollNum;
    String house;

    public PrintWithtoString(int age, String name, String rollNum, String house) {
        this.age = age;
        this.name = name;
        this.rollNum = rollNum;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Details\nName: " + name
                + "\nAge: " + age
                + "\nRoll Number: " + rollNum;

    }

    public static void main(String[] args) {
        PrintWithtoString student1 = new PrintWithtoString(10, "Ram", "A101", "Red");
        System.out.println(student1);
    }
}
