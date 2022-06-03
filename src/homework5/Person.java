package homework5;

public class Person {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int age;
    private int salary;
    Person(String fullname, String position, String email, String phoneNumber, int age, int salary) {
        this.fullName = fullname;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void printInfo() {
        System.out.println(fullName + " " + position + " " + email + " " + phoneNumber + " " + age + " " + salary);
    }
}
