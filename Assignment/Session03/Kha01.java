package Assignment.Session03;

import java.util.Scanner;

public class Kha01 {
    public static void addBookToLibraries(int n){
        try (Scanner scanner = new Scanner(System.in)) {
            int[] listLibrary = new int[n];
            for (int i = 0; i < n; i++){
                System.out.printf("Sach thu %d:", i);
                listLibrary[i] = scanner.nextInt();
            }

            System.out.printf("\n--- ket qua ---\nDanh sach ma sach:\t");
            for (int i : listLibrary) {
                System.out.print(i+"\t");
            }
        }
    }
    public static void main(String[] args) {
        /*
         * Viết phương thức addBookToLibraries(int n): Cho phép người dùng nhập vào n mã
         * sách và trả về một mảng số nguyên.
         * Viết phương thức displayLibraries(int[] arr): Nhận vào mảng mã sách và in các
         * mã này ra màn hình, mỗi mã cách nhau một dấu phẩy.
         * Trong hàm main, yêu cầu người dùng nhập số lượng sách n, gọi hàm nhập và sau
         * đó gọi hàm hiển thị
         */
        addBookToLibraries(5);
    }

}
