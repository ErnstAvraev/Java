package seminar6.seminar6;

import java.util.HashSet;

// 1. Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4, 5000, 6, 3}.
//  Распечатайте содержимое данного множества.

public class task1 {
    public static void main(String[] args) {
        // HashSet <Integer> HS = new HashSet<>();
        // HS.add(1);
        // HS.add(2);
        // HS.add(30000);
        // HS.add(2);
        // HS.add(4);
        // HS.add(5000);
        // HS.add(6);
        // HS.add(3);
        // System.out.println(HS);

        HashSet <Integer> userSet = newSet();
        printSet(userSet);
    }

    public static HashSet<Integer> newSet() {
        HashSet <Integer> res  = new HashSet<>();
        int[] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
        for (int i = 0; i < arr.length; i++){
            res.add(arr[i]);
        }
        return res;
    }

    public static void printSet(HashSet<Integer> set) {
        System.out.println(set);
    }
}
