package assignment.session04;

public class Kha01 {
    /*
     * Nhập vào tên sách, tác giả và thể loại
     * Loại bỏ khoảng trắng thừa ở hai đầu và giữa các từ
     * Định dạng lại: Tên sách viết hoa toàn bộ, Tên tác giả viết hoa chữ cái đầu
     * mỗi từ
     * Xuất ra chuỗi tổng hợp: [TÊN SÁCH] - Tác giả: [Tên Tác Giả]
     */
    public static void main(String[] args) {
        String title = "         Lap trinh java co ban     ";
        String author = "Nguyen van a";

        System.out.printf("[%s] - Tac gia: %s", title.trim().toUpperCase(), author);
    }
}
