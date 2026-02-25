package assignment.session09;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Bt05 {
    public static void main(String[] args) {
        int[] arr = {1,5,2,4,6,5};
        Set<Integer> arrset = Arrays.stream(arr).boxed().collect(Collectors.toSet());

        System.out.println(arrset);
    }
}
