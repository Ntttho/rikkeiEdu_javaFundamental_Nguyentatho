package assignment.session10;

public class Main {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "Hello";
        String c = a.toUpperCase();
        String d = new String();

        System.out.println(System.identityHashCode(b) + " " + System.identityHashCode(a) + " " + " " + System.identityHashCode(a.toUpperCase()));
    
        System.out.println(a == d);
        System.out.println(c);
    }
}
