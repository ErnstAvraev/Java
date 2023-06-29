package seminar6.seminar6;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class task1_1group {
    public static void main(String[] args) {
        LinkedHashSet <Integer> userSet = newLinkedSet();
        printLinkedSet(userSet);
        HashSet <Integer> userS = newSet();
        printSet(userS);
    }

    public static LinkedHashSet<Integer> newLinkedSet() {
        LinkedHashSet <Integer> res  = new LinkedHashSet<>();
        int[] arr = {1, 2, 30000, 2, 4, 5000, 6, 3};
        for (int i = 0; i < arr.length; i++){
            res.add(arr[i]);
        }
        return res;
    }

    public static void printLinkedSet(LinkedHashSet<Integer> set) {
        System.out.println("LinkedHashSet: " + set.toString());
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
        System.out.println("HashSet: " + set);
    }
}
