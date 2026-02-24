package ee.peeyushlearningjava.Equals;

public class PersonTest {

    public static void main(String[] args) {

        Person person1 = new Person("Ram", 10, "A001");
        Person person2 = new Person("Ram", 10, "A001");

        if (person1.equals(person2)) {
            System.out.println("User 1 and User 2 are the same");
        } else {
            System.out.println("User 1 and User 2 are different");
        }
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
    }
}
