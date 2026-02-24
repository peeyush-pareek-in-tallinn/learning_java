package ee.peeyushlearningjava.Employee;

class Employee {
    private String name;
    private int age;
    private double salary;

    Employee (String name, int age){
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "welcome to the Employee DBMS\nName: " + name + "\nAge: " + age;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    String displayEmployeeDetails () {
        return "welcome to the Employee DBMS\nName: " + name + "\nAge: " + age;
    }
}
