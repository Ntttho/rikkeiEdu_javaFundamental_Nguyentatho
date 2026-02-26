package assignment.Session01;

import java.util.Scanner;

public class Kha01 {

    public static void main(String[] args) {
        try (java.util.Scanner Scanner = new Scanner(System.in)) {
            System.out.print("BookId: ");
            String bookId = Scanner.nextLine();
            System.out.print("BookName: ");
            String bookName = Scanner.nextLine();
            System.out.print("publishYear: ");
            int publishYear = Scanner.nextInt();
            System.out.print("Price: ");
            double price = Scanner.nextDouble();
            System.out.print("isAvailable: ");
            boolean isAvailable = Scanner.nextBoolean();
            System.out.printf("bookId : %-10s - BookName: %-20s - publishYear: %-5d - price: %.2f - isAvailable - %b", bookId, bookName, publishYear, price, isAvailable);
        }
    }
}
