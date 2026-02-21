package assignment.session02;

import java.util.Scanner;

public class Gioi03 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhap so luong sach muon: ");
            int numberBook = scanner.nextInt();
            int sumForfeit = 0;
            for (int i = 0 ; i < numberBook; i++){
                System.out.print("Nhap so ngay tren cuon sach thu "+(i+1)+": ");
                int day = scanner.nextInt();

                sumForfeit += day*5000;
            }

            System.out.println("===> Tong tien phat: "+sumForfeit+" VND");
        }
    }
}
