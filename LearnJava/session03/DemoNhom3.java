package learnJava.session03;

import java.util.Scanner;

public class DemoNhom3 {
    public static void main(String[] args) {
        // Khởi tạo trực tiếp
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Thêm phần tử vào cuối mảng
        int capacity = 100; // Sức chứa tối đa
        int[] arr = new int[capacity]; // tất cả các phần tử đều là 0
        int currentSize = 0; // Chưa có phần tử nào

        // Thao tác CREATE: Thêm phần tử vào cuối mảng
        if (currentSize < capacity) {
            arr[currentSize] = 50;
            currentSize++;
        }

        if (currentSize < capacity) {
            arr[currentSize] = 15;
            currentSize++;
        }
        // Kết quả: Mảng có 2 phần tử thực tế là [50, 15]

        // OKELA hơn sẽ sử dụng code này nè
        // for(int i = 0; i < capacity; i++){
        //     try (Scanner sc = new Scanner(System.in)) {
        //         arr[i] = sc.nextInt();
        //     }
        // }

        // Đọc phần tử tại vị trí index = 0
        System.out.println("Phần tử đầu tiên: " + arr[0]);

        // Duyệt mảng (Chỉ duyệt các phần tử thực tế)
        System.out.print("Danh sách mảng: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");
        }

        // Tìm kiếm một giá trị (Ví dụ: tìm số 15)
        int searchVal = 15;

        for (int i = 0; i < currentSize; i++) {
            if (arr[i] == searchVal) {
                System.out.println("\nTìm thấy tại index: " + i);
                break;
            }
        }

        // Update
        int indexToUpdate = 1;

        if (indexToUpdate >= 0 && indexToUpdate < currentSize) {
            arr[indexToUpdate] = 99;
            System.out.println("Cập nhật thành công!");
        } else {
            System.out.println("Vị trí không hợp lệ!");
        }

        // Duyệt mảng (Chỉ duyệt các phần tử thực tế)
        System.out.print("Danh sách mảng: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Lúc này mảng là: [50, 99]

        // Yêu cầu: Xóa phần tử tại vị trí k (ví dụ index = 0)
        int k = 0;

        if (k >= 0 && k < currentSize) {
            // Dời tất cả phần tử từ k+1 sang trái 1 bước
            for (int i = k; i < currentSize - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // (Tùy chọn) Xóa vết dữ liệu thừa ở cuối
            arr[currentSize - 1] = 0;

            // Giảm số lượng phần tử thực tế
            currentSize--;

            System.out.println("Đã xóa phần tử tại index " + k);
        }
        System.out.print("Danh sách mảng: ");
        for (int i = 0; i < currentSize; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
