package assignment.session13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bt01 {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(36.5);
        list.add(40.2);
        list.add(37.0);
        list.add(12.5);
        list.add(39.5);
        list.add(99.9);
        list.add(36.8);

        Iterator<Double> it = list.iterator();
        while (it.hasNext()) {
            double number = it.next();
            if(number < 34 || number > 42){
                it.remove();
            }
        }

        for (Double double1 : list) {
            System.out.println(double1);
        }
    }
}
