package heap;

import java.util.Comparator;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Integer[] numbers = {6, 4, 5, 2, 1, 0, 3};
        HeapSort.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }, numbers);
        for(int x : numbers) {
            System.out.print(x + " ");
        }
    }
}
