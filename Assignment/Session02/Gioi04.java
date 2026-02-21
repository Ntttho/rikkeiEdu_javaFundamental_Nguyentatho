package Assignment.Session02;

import java.util.Scanner;

public class Gioi04 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int id = 0;
            do {
                System.out.print("Nhap ma id sach moi (phai > 0) : ");
                id = scanner.nextInt();
                if (id <= 0){
                    System.out.println("Loi: Id phai la so duong. Moi nhap lai.\n");
                }
            } while (id < 0);

            System.out.printf("\nXac nhan: Ma sach %d da duoc ghi nhan.", id);
        }
    }
}
