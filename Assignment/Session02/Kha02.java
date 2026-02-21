package Assignment.Session02;

import java.util.Scanner;

public class Kha02 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhap ma khu vuc (A, B, C, D)");
            String code = scanner.next();
            switch (code) {
                case "A":
                    System.out.println("Vi tri: Tang 1 - Sach van hoc");
                    break;
                case "B":
                    System.out.println("Vi tri: Tang 2 - Sach khoa hoc");
                    break;
                case "C":
                    System.out.println("Vi tri: Tang 3 - Sach ngoai ngu");
                    break;
                case "D":
                    System.out.println("Vi tri: Tang 4 - Sach tin hoc");
                    break;
                default:
                    break;
            }
        }

    }
}
