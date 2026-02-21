package assignment.session03;

import java.util.Random;

public class Gioi04 {

    public static void main(String[] args) {
        // 1. Khởi tạo mảng ngẫu nhiên
        int[] books = new int[5];
        Random rand = new Random();
        for (int i = 0; i < books.length; i++) {
            books[i] = rand.nextInt(100); // Ngẫu nhiên từ 0-99
        }

        System.out.println("--- Trước khi sắp xếp ---");
        displayBooks(books);

        // 2. Gọi hàm sắp xếp
        sortBooks(books);

        System.out.println("\n--- Sau khi sắp xếp (Tăng dần) ---");
        displayBooks(books);
    }

    // Phương thức sắp xếp đổi chỗ trực tiếp (Interchange Sort)
    public static void sortBooks(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Hoán vị (Swap)
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    // Phương thức in mảng
    public static void displayBooks(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println(); // Xuống dòng sau khi in xong
    }
}