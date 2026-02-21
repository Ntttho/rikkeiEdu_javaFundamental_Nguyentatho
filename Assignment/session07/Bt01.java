package assignment.session07;

public class Bt01 {
    public static class Student {
        public int id;
        public String name;

        static int totalStudent = 0;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
            totalStudent++;
        }

        public void showInfor() {
            System.out.printf("Student: [id: %d | name %s]\n", this.id, this.name);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "null");
        Student s2 = new Student(2, "null");
        Student s3 = new Student(13, "null");
        s1.showInfor();
        s2.showInfor();
        s3.showInfor();

        System.out.println(Student.totalStudent);
    }
}
