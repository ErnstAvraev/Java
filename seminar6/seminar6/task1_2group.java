package seminar6.seminar6;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.
//  Распечатайте содержимое данного множества.

public class task1_2group {
    public static void main(String[] args) {
        HashSet <Integer> HS = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3)); // Инициализация сразу
        System.out.println("HashSet: " + HS);

        LinkedHashSet <Integer> LHS = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
        System.out.println("LinkedHashSet: " + LHS);

        TreeSet<Integer> TS = new TreeSet<>(Comparator.naturalOrder());
        int[] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
        for (int i = 0; i < arr.length; i++) {
            TS.add(arr[i]);
        }
        System.out.println("TreeSet: " + TS);
    }
}
