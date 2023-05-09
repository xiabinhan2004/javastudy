package user1;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        Integer[] array = { 49, 38, 65, 97, 76, 13, 27 };
        Arrays.sort(array,new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
            
        });
        System.out.println(Arrays.toString(array));
    }
}
