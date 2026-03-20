package assignment.session15.btth;

import java.util.Scanner;

public class Btth {
    static final Scanner sc = new Scanner(System.in);
    static int showMenu(){
        System.out.println("=============== Menu ==============");
        System.out.println("1. Dang ky kham benh");
        System.out.println("2. Goi kham benh");
        System.out.println("3. Xem danh sach hang doi");
        System.out.println("4. Tim kiem benh nhan");
        System.out.println("5. Sap xep hang doi");
        System.out.println("6. Xem lich su dieu tri");
        System.out.println("7. Thoat");
        System.out.println("===================================");

        System.out.print("Nhap lua chon cua ban: ");
        return sc.nextInt();
    }

    public static void main(String[] args) {

        // Queue<Patient> queuePatient = new PriorityQueue<>((p1, p2) -> Integer.compare(p1.getPriority(), p2.getPriority()));
        // Patient p1 = new Patient(null, 12, null);
        // Patient p2 = new EmergencyPatient(null, 0, null, 12);

        // queuePatient.add(p1);
        // queuePatient.add(p2);

        // for (Patient patient : queuePatient) {
        //     patient.showInfo();
        // }

        boolean flag  = true;
        ManagerHospital managerHospital = new ManagerHospital();
        while (flag) {
            int choice = showMenu();
            switch (choice) {
                case 1:
                    // nhận giá trị endline của nextInt
                    sc.nextLine();

                    // nhập thông tin bênh nhân và thêm vào queue
                    System.out.println("Benh nhan thuong (nhap phim 1 hoac khac phim 0) - Benh nhan cap cuu (nhap phim 0)");
                    String choiceP = sc.nextLine();
                    

                    System.out.print("Nhap ten: "); String name = sc.nextLine();
                    System.out.print("Nhap tuoi: "); int age = sc.nextInt();
                    System.out.print("Nhap tinh trang: "); sc.nextLine(); String condition = sc.nextLine();
                    switch (choiceP) {
                        case "0":
                            System.out.print("Nhap do uu tien (nhap so): "); int priority = sc.nextInt();
                            Patient patient0 = new EmergencyPatient(name, age, condition, priority);
                            managerHospital.add(patient0);
                            break;
                        default:
                            Patient patient1 = new Patient(name, age, condition);
                            managerHospital.add(patient1);
                            break;
                    }

                    

                    break;
                case 2:
                    
                    break;
                case 3:
                    managerHospital.display();
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    System.out.println("Ket thuc chuong trinh");
                    flag = false;
                    break;
                default:
                    break;
            }
        }
    }
}