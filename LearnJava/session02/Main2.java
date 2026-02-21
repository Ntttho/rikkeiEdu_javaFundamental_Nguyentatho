package learnJava.session02;

public class Main2 {
    public static void main(String[] args) {
        int s = 1;
        // vong lap while
        System.out.println("vong lap voi while");
        while (s != 4) {
            s++;
            System.out.println(s);
        }

        // vong lap for
        System.out.println("vong lap voi for");
        for (int i = 1; i < 10; i++){
            System.out.println(i);
        }

        // vong lap for each
        System.out.println("vong lap for each");
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
        }
        for (int n : numbers) {
            System.out.print(n);
        }
    }
}
