package assignment.Session02;

import java.util.Scanner;

public class Kha01 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap tuoi cua ban: ");
            int age = scanner.nextInt();

            System.out.print("Nhap sach ban dang muon: ");
            int numberBook = scanner.nextInt();

            if(age >= 18 && numberBook < 3){
                System.out.println("\nKet quan: Ban DU DIEU KIEN muon sach quy hiem");
            }else{
                System.out.println("\nKet qua ban khong du dieu kien\n - Ly do: Ban da muon toi da 3 cuon");
            }
        }
    }
}
