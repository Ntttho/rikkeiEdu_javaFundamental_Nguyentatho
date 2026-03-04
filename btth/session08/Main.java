package btth.session08;

public class Main {
    public static void main(String[] args) {
        StudentManager lop1 = new StudentManager();
        StudentManager lop2 = new StudentManager();

        lop1.addStudent(new Student("Thanh", 10));
        lop1.addStudent(new Student("Thanh", 12));

        System.out.println();
        lop2.addStudent(new Student("thanh", 20));
        lop2.addStudent(new Student("Tho", 20));

        lop2.showStudent();
    }
}
