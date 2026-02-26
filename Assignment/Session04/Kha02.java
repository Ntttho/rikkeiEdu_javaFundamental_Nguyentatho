package assignment.Session04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kha02 {
    /*
     * Cho một đoạn văn bản mô tả cuốn sách
     * Kiểm tra xem trong đoạn văn có chứa từ khóa "Kệ:" hay không
     * Nếu có, hãy trích xuất mã vị trí đứng ngay sau từ "Kệ:" cho đến hết dòng hoặc
     * đến dấu phẩy tiếp theo
     * Thay thế từ khóa "Kệ:" thành "Vị trí lưu trữ:" và in lại đoạn mô tả mới
     */
    public static void main(String[] args) {
        String description = "Sách Java nâng cao, Ke: A12-05, tình trạng mới.";

        Pattern pattern = Pattern.compile("Ke:\\s*([^,\\n]+)");
        Matcher matcher = pattern.matcher(description);

        if(matcher.find()){
            String viTri = matcher.group(1);
            System.out.println("vi tri: " + viTri);
            description = matcher.replaceAll("vi tri luu tru: "+matcher.group(1));
            System.out.println(description);
        }
    }
}
