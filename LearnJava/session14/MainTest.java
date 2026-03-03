package learnJava.session14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        List<Student> sts = new ArrayList<>();

        sts.add(new Student("Tho", 20));
        sts.add(new Student("An", 21));
        sts.add(new Student("Loc", 22));

        // comparable voi student name
        System.out.println("\nsap xep theo ten (comparable)");
        Collections.sort(sts);
        for (Student student : sts) {
            System.out.println(student);
        }

        // comparator voi age
        System.out.println("\nsap xep theo tuoi (comparator)");
        Collections.sort(sts, (a, b) -> Integer.compare(a.age, b.age));
        for (Student student : sts) {
            System.out.println(student);
        }
    }
}
