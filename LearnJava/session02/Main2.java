package learnJava.session02;

import java.util.Scanner;

public class Main2 {
    int a = 10;
    static int b = 10;

    public static void main(String[] args) {
        boolean loop = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (loop) {

                System.out.println("1. Tinh tien phat tra sach");
                System.out.println("2. Dang ky the muon VIP");
                System.out.println("3. Thong ke sach da liet ke trong khi kho");
                System.out.println("0. Exits");
                System.out.println("\n=========== chon chuc nang: ");
                int choise = sc.nextInt();

                switch (choise) {
                    case 1:
                        
                        break;
                    case 2:

                        break;
                    case 3:

                        break;
                    case 0:
                        loop = false;
                        break;
                }
            }
        }
    
        System.out.println(b);
    }    
}
