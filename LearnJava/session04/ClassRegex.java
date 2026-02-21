package learnJava.session04;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRegex {
    public static void main(String[] args) {
        String text = "Liên hệ: 0912-345-678 hoặc 0988-555-111 để biết thêm chi tiết.";

        // 1. Định nghĩa Regex (Tìm định dạng số điện thoại xxxx-xxx-xxx)
        String regex = "\\d{4}-\\d{3}-\\d{3}";

        // 2. Biên dịch Pattern
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println(matcher.group() + matcher.start());
        }
    }
}
