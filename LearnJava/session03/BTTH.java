package learnJava.session03;

import java.util.Scanner;

public class BTTH {
    public static void showMenu(){
        System.out.println("1. Xem danh sach");
        System.out.println("2. Them sach moi");
        System.out.println("3. Cap nhap so luong");
        System.out.println("4. Xoa sach");
        System.out.println("5. Tim kiem sach");
        System.out.println("6. Sap xep theo so luong");
        System.out.println("7. Thoat\n\n");

    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            boolean flag = true;
            String[] listid = new String[100];
            String[] listBook = new String[100];
            int[] listPage = new int[100];
            
            int size = 0;

            while (flag) {
                showMenu();
                System.out.println("Nhap lua chon cua ban: ");
                int choice = sc.nextInt();
                System.out.println();

                switch (choice) {
                    case 1:
                        System.out.println("Id - Name - Page");
                        if (size == 0) {
                            System.out.println("Chua co cuon sach nao");
                        }else{
                            for(int i = 0; i<size; i++){
                                System.out.printf("%s - %s - %d\n", listid[i], listBook[i], listPage[i]);
                            }
                        }
                        System.out.println("\n\n\n");
                        break;
                    case 2:
                        System.out.println("aksjdflajs");
                        sc.nextLine();
                        System.out.print("Id: ");
                        listid[size] = sc.nextLine();
                        System.out.print("Name: ");
                        listBook[size] = sc.nextLine();
                        System.out.print("page: ");
                        listPage[size] = sc.nextInt();
                        System.out.println();
                        size++;
                        break;
                    case 3:
                        
                        break;
                    case 7:
                        flag = false;
                        break;
                    default:
                        break;
                }
            }
        }
        
    }
    
}
/*
 * Giả sử thư viện cần quản lý 3 thông tin chính của sách. Vì chưa học Class, ta
 * sẽ lưu trữ vào 3 mảng riêng biệt nhưng có chỉ số (index) tương ứng với nhau:
 * 
 * int[] ids: Lưu mã sách (duy nhất).
 * String[] titles: Lưu tên sách.
 * int[] quantities: Lưu số lượng tồn kho.
 * Ví dụ: ids[0], titles[0] và quantities[0] là thông tin của cùng một cuốn sách
 * 
 * Xem danh sách: Hiển thị bảng danh sách sách dạng cột (Mã | Tên | Số lượng)
Thêm sách mới: Nhập thông tin sách mới (Kiểm tra nếu mã sách đã tồn tại thì báo lỗi, nếu mảng đầy thì báo lỗi)
Cập nhật số lượng: Nhập mã sách, tìm và cho phép sửa lại số lượng (Ví dụ: Nhập hàng thêm)
Xóa sách: Nhập mã sách, xóa sách đó khỏi hệ thống (Dồn mảng cả 3 mảng)
Tìm kiếm: Nhập một từ khóa, hiển thị tất cả sách mà tên có chứa từ khóa đó (Tìm kiếm gần đúng)
Sắp xếp theo số lượng: Sắp xếp danh sách giảm dần theo số lượng (Lưu ý: Khi đổi chỗ quantities, phải đổi chỗ cả ids và titles tương ứng)
Thoát
 */