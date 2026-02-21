package assignment.session07;
public class Bt04 {
    public static class Student {
        static double classFund = 0;

        String name;
        public Student (String name) {
            this.name = name;
        }

        public void in_fund(double fund){
            classFund+= fund;
        }
        
        public void out_fund(double fund){
            classFund-=fund;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("S1");
        Student s2 = new Student("S2");
        Student s3 = new Student("S3");

        s1.in_fund(1000);
        s1.in_fund(1000);
        s2.in_fund(1000);
        s3.in_fund(1000);

        System.out.println(Student.classFund);
    }
}
