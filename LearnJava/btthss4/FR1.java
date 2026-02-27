package learnJava.btthss4;

import java.util.Scanner;

public class FR1 {
    /*
     * 
     * Input: Một mảng số nguyên và một số nguyên target.
     * Thuật toán: Tìm hai chỉ số i, j sao cho arr[i] + arr[j] = target.
     * Output: In ra cặp chỉ số hoặc thông báo không tìm thấy.
     * 
     */
    public static void main(String[] args) {
        try (
            // input
            Scanner sc = new Scanner(System.in)) {
            // nhap so phan tu mang
            System.out.printf("Nhap vao so phan tu cua mang: ");
            int length = sc.nextInt();
            int[] array = new int[length];

            for(int i = 0; i < length; i++){
                System.out.printf("nhap phan tu thu " + i +": ");
                array[i] = sc.nextInt();
            }

            System.out.printf("Target???: ");
            int target = sc.nextInt();

            boolean flagEnd = false;
            for(int i = 0; i < length && !flagEnd; i++){
                for (int j = i; j < length; j++){
                    if(i != j && array[i] + array[j] == target){
                        System.out.printf("target = %d = %d + %d array[%d] + array[%d]\n", target, array[i], array[j], i, j);
                        System.out.printf("Result = (%d - %d)\n", i, j);
                        flagEnd = true;
                        break;
                    }
                }
            }

            if (!flagEnd) {
                System.out.println("Khong tim thay ket qua");
            }

        }

    }
}
