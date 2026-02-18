
public class Main {
    // có thể khai báo biến instance
    String s;

    public static void main(String[] args) {
        // pass by value tham trị - hành động copy giá trị của một biến sang một ô nhớ khác 
        int a = 3;
        int b = a;

        a = 10;
        b = 6;
        System.out.println(a +" " + b);

        // pass by reference tham chiếu - hành động copy ô nhớ

    }
}