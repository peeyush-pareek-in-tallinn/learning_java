public class ObjectWithFinalFields {

    final int age;

    public ObjectWithFinalFields() {
        this.age = 15;
    }

    public static void main(String[] args) {
        ObjectWithFinalFields student = new ObjectWithFinalFields();
        int newStudent = student.age;
        System.out.println(newStudent);
    }
}
