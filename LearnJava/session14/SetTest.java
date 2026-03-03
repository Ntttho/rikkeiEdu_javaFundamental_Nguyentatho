package learnJava.session14;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        // khoi tao set
        Set<String> hashSet = new HashSet<>();
        
        // các thao tác với set

        // 1. them moi vao set
        hashSet.add("string 1");
        hashSet.add("string 3");
        hashSet.add("string 2");
        hashSet.add("string 3");
        hashSet.add("string 4");

        // 1. duyet set (foreach - iterator - foreach java8+)
        System.out.println("Duyet set");
        hashSet.forEach((string) -> System.out.println(string));

        // kiem tra phan tu
        System.out.println("\ncac cau lenh kiem tra");
        System.out.println("isEmpty: " + hashSet.isEmpty());
        System.out.println("containt value: " + hashSet.contains("string 1"));
        System.out.println("size hashset: " + hashSet.size());
        
        // xoa phan tu (remove)
        hashSet.remove("string 1");
        System.out.println("\ncheck remove 'string 1': " + hashSet.contains("string 1"));

        // xoa het (clear)
        hashSet.clear();
        System.out.println("\ncheck empty: " + hashSet.isEmpty());
    }
}
