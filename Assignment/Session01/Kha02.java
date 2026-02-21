package Assignment.Session01;

import java.util.Scanner;

public class Kha02 {
    public static void main(String[] args) {
        try (// Nhập số ngày chậm trễ (n) và số lượng sách mượn (m).
                // Tính tiền phạt theo công thức: Total = n *  m * 5000
                // Sử dụng toán tử logic để kiểm tra điều kiện đặc biệt:
                // Nếu n > 7 và m ≥ 3: Tăng thêm 20% tổng tiền phạt (phạt do mượn nhiều mà trả quá muộn).
                // Sử dụng toán tử so sánh để in ra thông báo: true nếu tiền phạt > 50,000đ (Yêu cầu khóa thẻ), false nếu ngược lại
        java.util.Scanner scanner = new Scanner(System.in)) {
            System.out.print("Nhập số ngày chậm trể n: ");
            int n = scanner.nextInt();
            System.err.print("Số lượng sách mượn m:");
            int m = scanner.nextInt();

            int Total = n * m * 500;
            if (n > 7 && m >= 3) {
                Total *= 1.2;
            }

            if (Total >= 50000) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
        }
    }
}
