package learnJava.session07;

class Student {

    String name;
    int age;

    // constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // phương thức của đối tượng
    public void showInfo() {
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
    }

    // phương thức của lớp
    public static void schoolName() {
        System.out.println("Truong: PTIT");
    }

}

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------");
        // gọi phương thức của đối tượng
        Student s1 = new Student("Nam", 20);
        s1.showInfo();

        // gọi phương thức của lớp
        Student.schoolName();
        //// s1.schoolName(); 
        // // cảnh báo : The static method schoolName() from the type Student should be accessed in a static way
        // // (phương thức schoolName() đến từ đối tượng Student nên được truy cập bằng cách của dạng static - truy cập thông qua tên tớp)
    }
}