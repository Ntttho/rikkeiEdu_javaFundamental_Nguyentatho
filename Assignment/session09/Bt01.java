package assignment.session09;

public class Bt01 {
    public static class Person {
        protected String name;
        protected int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person [name=" + name + ", age=" + age + "]";
        }

        public void showInfo(){
            System.out.println(this);
        }
    }

    public static class Student extends Person {
        static int id_autoincreament = 1;
        int id;
        double avgScore;

        public Student(String name, int age, double avgScore) {
            super(name, age);
            this.id = id_autoincreament++;
            this.avgScore = avgScore;
        }

        @Override
        public String toString() {
            return "Student [name=" + name + ", age=" + age + ", id=" + id + ", avgScore=" + avgScore + "]";
        }
        @Override
        public void showInfo() {
            // TODO Auto-generated method stub
            System.out.println(this);
        }
    }


    public static void main(String[] args) {
        Person s = new Student("Hello", 10, 9.45);
        s.showInfo();
    }
}
