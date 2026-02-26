package assignment.Session03;

import java.util.Scanner;

public class Kha02 {
    /*
     * Khai báo và khởi tạo sẵn một mảng String[] books chứa tên của ít nhất 5 cuốn
     * sách
     * Viết phương thức searchBooks(String[] arr, String search): Trả về vị trí
     * (index) của cuốn sách nếu tìm thấy, hoặc trả về -1 nếu không tìm thấy
     * Trong main, cho người dùng nhập tên sách cần tìm, gọi phương thức và in ra
     * kết quả: "Tìm thấy tại vị trí X" hoặc "Sách không tồn tại"
     */
    public static int searchBooks(String[] arr, String seachString){
        for(int i = 0; i<arr.length;i++){
            if (arr[i].equals(seachString)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String[] listS = {"Sach 1", "Sach 2", "Sach 3", "Sach 4", "Sach 5"};
            System.out.print("Nhap sach ban muon tim kiem: ");
            String searchString = scanner.nextLine();
            System.out.println(searchBooks(listS, searchString));
        }

    }
}
