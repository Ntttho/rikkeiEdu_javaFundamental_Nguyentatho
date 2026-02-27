package learnJava.btthss4;

import java.util.Scanner;

public class FR4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.printf("Nhap vao mot chuoi bat ky: ");
            String input = sc.nextLine().trim();

            String[] arrS = input.split(" ");
            StringBuilder result = new StringBuilder();
            for (int i = arrS.length - 1; i >= 0; i--) {
                result.append(arrS[i]);
                if(i != 0){
                    result.append(" ");
                }
            }

            System.out.println("Result: ("+ result+")");
        }
    }
}
