package btth.session08;

public class Student {
    private String name;
    private int age;
    private String email;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }


    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", email: " + email + "]";
    }

}
