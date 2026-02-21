package assignment.session06;

public class Bt01 {
    public static class Student {
        public int id;
        public String name;
        public double avgScore;

        public Student(int id, String name, double avgScore) {
            this.id = id;
            this.name = name;
            this.avgScore = avgScore;
        }

        public void ShowInfo() {
            System.out.printf("Student: %s | ID: %d | Average Score: %.2f%n", name, id, avgScore);
        }
    }

    public static void main(String[] args) {
        Student s = new Student(101, "Nguyen van A", 9.5);
        s.ShowInfo();
        System.out.println("");
    }
}
