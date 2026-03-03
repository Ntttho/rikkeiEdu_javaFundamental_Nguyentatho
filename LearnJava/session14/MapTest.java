package learnJava.session14;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        
        // khoi tao map
        Map<String, Integer> map = new HashMap<>();
        
        // them moi phan tu
        map.put("Nguyen ta tho", 20);
        map.put("Le trung nguyen", 25);
        map.put("Dao duc hai", 24);
        map.put("Hoa thien cot", 22);

        // duyet map
        System.out.println("map: ");
        map.forEach((String s, Integer value) -> System.out.println(s + " " + value));

        // các phương thức thêm với map 
        map.putIfAbsent("string 5", 100); // thêm mới nếu chưa tồn tài key, còn tồn tại rồi thì không ảnh hưởng
        map.replace("Nguyen ta tho", 30); // sửa giá trị theo key
        map.replace("Nguyen ta tho", 30, 20); // sửa giá trị nếu giá trị củ đúng
        map.computeIfAbsent("key 1", v -> 20); // nếu khoá không tồn tại thì tính toán và thêm mới giá trị
        map.computeIfAbsent("string 5", v -> 20); // tồn tại rồi nên không có thay đổi
        map.computeIfPresent("key 1", (k, v) -> {return v * 2 + k.length();}); // nếu khoá tôn tại thì sẽ tính toán dựa trên giá trị mới không thì sẽ không ảnh hưởng

        // cung co the duye theo kieu nay
        System.out.println("\nforeach mapentry:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            // entry duyet qua tung cap key - value
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // duyet key của map
        System.out.println("\nkey: ");
        for (String string : map.keySet()) {
            // get value by key
            System.out.println(string+ ": " + map.get(string));
            
        }

        // duyet value cua map
        System.out.println("\nvalue: ");
        for (Integer integer : map.values()) {
            System.out.println(integer);
        }

        // 


    }
}
