package Assignment.Session01;

import java.util.Scanner;

public class Gioi02 {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập giá sách: ");
            double price = scanner.nextDouble();

            long priceVND = (long) (price * 25450.0);
            System.out.println(priceVND + " VND");
        }
    }
}
