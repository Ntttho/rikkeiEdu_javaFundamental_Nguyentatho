import java.util.regex.Pattern;

public class Gioi04 {
    /*
     * Viết biểu thức chính quy (Regex) để kiểm tra mã thẻ nhập vào: 
     * Mã thẻ phải bắt đầu bằng 2 chữ cái viết hoa (ví dụ: TV - Thư Viện)
     * Tiếp theo là 4 chữ số năm vào học (ví dụ: 2023)
     * Kết thúc bằng 5 ký tự số ngẫu nhiên
     * Thông báo lỗi cụ thể nếu người dùng nhập sai định dạng (ví dụ:
     * "Năm không hợp lệ" hoặc "Thiếu tiền tố TV")
     */
    public static void main(String[] args) {
        String regex = "([A-Z]{2})(\\d{4})(\\d{5})";
        String textTest = "VT0001JKLJK"; 
        if(Pattern.matches(regex, textTest)){
            System.out.println("Text hop ly: "+textTest);
        }else{
            System.err.println("Text loi: "+textTest);
        }
    }
}
