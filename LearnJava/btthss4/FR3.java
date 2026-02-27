package learnJava.btthss4;

import java.util.Scanner;

public class FR3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String regex = "[^a-z]";

            System.out.print("Nhap vao cau bat ky: ");
            String sentence = sc.nextLine().toLowerCase().replaceAll(regex, "");

            String[] charArray = sentence.split("");
            int i = 0, length = charArray.length - 1;
            boolean flag = true;
            while (i < length/2) {
                System.out.printf("%s %s \n", charArray[i], charArray[length-i-1]);
                if(charArray[i].equals(charArray[length-i-1])){
                    i++;
                }else{
                    flag = false;
                    break;
                }
            }

            if(flag){
                System.out.println("chuoi doi xung");
            }else{
                System.out.println("chuoi khong doi xung");
            }
            
        }
    }
}
