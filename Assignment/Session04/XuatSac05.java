package assignment.Session04;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class XuatSac05 {
    public static void main(String[] args) {
        String regex1 = "^(?<date>[^|]+)\\|\\sUser:\\s(?<user>[^|]+)\\|\\sAction:\\s(?<action>[^|]+)\\|\\sBookId:\\s(?<bookId>.+)$";
        // ?<date> dung de dat ten date = group 1
        String text = "2024-05-20 | User: NguyenVanA | Action: BORROW | BookId: BK12345";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            // Lấy dữ liệu theo tên Group cực kỳ tường minh
            System.out.println("Ngày: " + matcher.group("date").trim());
            System.out.println("Người dùng: " + matcher.group("user").trim());
            System.out.println("Hành động: " + matcher.group("action").trim());
            System.out.println("Mã sách: " + matcher.group("bookId").trim());
        }
    }
}
