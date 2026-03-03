package learnJava.session14;

public class Student implements Comparable<Student> {
    
    String name;
    int age;

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // comparable
    @Override
    public int compareTo(Student other) {
        // TODO Auto-generated method stub
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("name: %s - age: %d", this.name, this.age);
    }
}