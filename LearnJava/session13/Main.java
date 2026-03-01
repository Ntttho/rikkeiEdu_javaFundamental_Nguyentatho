package learnJava.session13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Sring 12");
        list.add("Hello");
        list.add("anh em ddaau");

        // for each
        // for (String string : list) {
        //     System.out.println(string);
        // }

        // iterator
        // mỗi iterator chỉ có thể duyệt được một lần duy nhất
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
            if (s.equals("Sring 12")) {
                it.remove(); // <--- Lệnh này sẽ xóa trực tiếp phần tử khỏi 'list'
            }
        }

        System.out.println("\nlist iterator");
        // list iterator
        ListIterator<String> lit = list.listIterator();
        while (lit.hasNext()) {
            System.out.println(lit.next());
        }

        while (lit.hasPrevious()) {
            System.out.println(lit.previous());
        }
        
    }
}