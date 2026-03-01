package assignment.session13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bt02 {
    public static void main(String[] args) {
        List<String> medicine = new ArrayList<>();

        medicine.add("Paracetamol");
        medicine.add("Ibuprofen");
        medicine.add("Panadol");
        medicine.add("Paracetamol");
        medicine.add("Aspirin");
        medicine.add("Ibuprofen");

        List<String> tempMedicine = new ArrayList<>();
        Iterator<String> it = medicine.iterator();
        while (it.hasNext()) {
            String me = it.next();
            if(tempMedicine.contains(me)){
                it.remove();
            }else{
                tempMedicine.add(me);
            }
        }

        for (String string : medicine) {
            System.out.println(string);
        }

    }
}
