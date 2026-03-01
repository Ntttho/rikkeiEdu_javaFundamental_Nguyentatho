package assignment.session13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bt03 {

    public static <T> List<T> findCommonPatients(List<T> A, List<T> B ){
        List<T> newList = new ArrayList<>();
        Iterator<T> itA = A.iterator();
        while (itA.hasNext()) {
            T common = itA.next();
            if(B.contains(common)){
                newList.add(common);
            }
        }

        return newList;
    }

    public static void main(String[] args) {
        List<String> stringA = new ArrayList<>();
        List<String> stringB = new ArrayList<>();

        stringA.add("DN01");
        stringA.add("DN02");
        stringA.add("DN03");

        stringB.add("DN02");
        stringB.add("DN04");

        System.out.println("case 2");
        for (String string : findCommonPatients(stringA, stringB)) {
            System.out.println(string);
        }

        List<Integer> intA = new ArrayList<>();
        List<Integer> intB = new ArrayList<>();

        intA.add(101);
        intA.add(105);
        intA.add(102);
        intB.add(105);
        intB.add(108);
        intB.add(101);

        System.out.println("\ncase 1");
        for (Integer integer : findCommonPatients(intA, intB)) {
            System.out.println(integer);
        }
    }
}
