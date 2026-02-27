package learnJava.btthss4;

import java.util.Scanner;

public class FR2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Nhap do dai mang: ");
            int length = sc.nextInt();

            int[] array = new int[length];
            for (int i = 0; i < array.length; i++) {
                System.out.printf("Nhap vao mang pt thu %d: ",i);
                array[i] = sc.nextInt();
            }

            int i = 0;
            int j = length - 1;
            boolean flagEnd = true;
            while (flagEnd) {
                if(array[i] != 0){
                    i++;
                }else if(array[j] == 0){
                    j--;
                }else{
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }


                if(i == j){
                    flagEnd = false;
                }
            }

            for (int k : array) {
                System.out.println(k);
            }
        }
    }
}
