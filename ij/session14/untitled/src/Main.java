import java.util.*; // Import này đã bao gồm java.util.Comparator có sẵn

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Binh", 21, 10000));
        students.add(new Student("An", 21, 10000));
        students.add(new Student("An", 20, 10000));
        students.add(new Student("Dao", 22, 2000));
        students.add(new Student("Cuong", 100, 20000));

        Collections.sort(students, (s1, s2) -> s2.name.compareTo(s1.name));
        System.out.println("sx student theo comparable age");
        for(Student s : students){
            System.out.println(s);
        }

        List<Student> sinhviens = new ArrayList<>();
        sinhviens.add(new Student("Thanh", 21, 20000));
        sinhviens.add(new Student("Thanh", 21, 120000));
        sinhviens.add(new Student("Tho", 22, 10000));
        sinhviens.add(new Student("Dat", 20, 1000));


        // dung comparator cho linh hoat
//        Comparator<Student> compareBySalary = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                if(o2.age - o1.age != 0){
//                    return o2.age - o1.age;
//                }
//                return o2.salary - o1.salary;
//            }
//        };

//        Collections.sort(sinhviens, compareBySalary);
        Collections.sort(sinhviens, Comparator.comparingInt(sv -> sv.salary));
        System.out.println("\nsx Sinhvien theo comparator luong:");
        sinhviens.forEach(System.out::println);
    }
}

class Student implements Comparable<Student>/*, Comparator<Student> */ {
    String name;
    int age;
    int salary;

    public Student(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public int compareTo(Student o) {
        return - o.age + this.age; //sx giam dan theo tuoi
    }

    //soánh sap xep tang dan
//    @Override
//    public int compare(Student o1, Student o2) {
//        return o1.salary - o2.salary;
//    }

    @Override
    public String toString() { return "Name: " + name + " Age: " + age + " Salary: " + salary; }
}

