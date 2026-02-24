package ee.peeyushlearningjava.Equals;

import java.util.Objects;

class Person {

    private String name;
    private int age;
    private String ID;

    Person (String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            System.out.println("Invalid Search");
            return false;
        }
        Person person = (Person) obj;
        return person.ID.equals(ID) && person.name.equals(name) && person.age == age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, ID);
    }
}
