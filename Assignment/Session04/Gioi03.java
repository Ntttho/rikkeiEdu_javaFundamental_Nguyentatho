package assignment.Session04;
import java.time.LocalDate;

public class Gioi03 {
    /*
     * Tạo một danh sách các giao dịch (Mã sách, Ngày mượn)
     * Sử dụng StringBuilder để nối tất cả các giao dịch này thành một báo cáo duy
     * nhất, mỗi giao dịch nằm trên một dòng
     * Thêm thời gian hệ thống vào đầu báo cáo
     * So sánh thời gian thực thi nếu dùng phép cộng chuỗi + thông thường so với
     * StringBuilder
     */
    public static void main(String[] args) {
        String[] transactions = {"BK001-20/01", "BK002-21/01", "BK003-22/01"};
        LocalDate now = LocalDate.now();

        StringBuilder result = new StringBuilder("--- Bao cao muon sach ---\nNgay tao "+now+"\n");
        for (String string : transactions) {
            result.append("Giao dich: "+string+"\n");
        }
        System.out.println(result.toString());

    }
}
