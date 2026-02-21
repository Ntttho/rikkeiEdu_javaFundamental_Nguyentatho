package assignment.session07;

public class Bt02 {
    public static void main(String[] args) {

        int a = 10;
        int b = a;
        b = 20;
        System.out.println("Giá trị của a: " + a);
        System.out.println("Giá trị của b: " + b);

        System.out.println("\n--- SO SÁNH BIẾN THAM CHIẾU ---");
        
        Bt01.Student s1 = new Bt01.Student(1, "hello");
        Bt01.Student s2 = s1;

        s2.name = "Binh";
        System.out.println("Tên của s1: " + s1.name); // "Binh"
        System.out.println("Tên của s2: " + s2.name); // "Binh"
    }
}
