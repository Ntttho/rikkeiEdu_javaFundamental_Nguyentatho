package btth.session08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            StudentManager lop1 = new StudentManager();
            // StudentManager lop2 = new StudentManager();
            boolean flag = true;
            while (flag) {

                System.out.println("\n1. Them sinh vien moi lop 1");
                // System.out.println("2. Them sinh vien vao lop 2");
                // System.out.println("3. Show sinh vien lop 1");
                System.out.println("2. Show sinh vien lop 1");
                System.out.print("Nhap lua chon: ");
                int choice = sc.nextInt();
                System.out.println();
                switch (choice) {
                    case 1:
                        sc.nextLine();
                        System.out.print("Nhap ten: ");
                        String name = sc.nextLine();
                        System.out.print("Nhap tuoi: ");
                        int age = sc.nextInt();

                        lop1.addStudent(new Student(name, age));
                        break;
                    case 2:
                        System.out.println("Danh sach sinh vien");
                        lop1.showStudent();
                        break;
                    
                    case 0:
                        flag = false;
                        break;
                }
            }
        }

    }
}
