package seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

//  1) Замерьте время, за которое в ArrayList добавятся 100000 элементов.

// 2) Замерьте время, за которое в LinkedList добавятся 100000 элементов. 
// Сравните с предыдущим.

public class task1 {
    public static void main(String[] args) {
        
        ArrayList <Integer> arr = new ArrayList<>();
        long time1 = System.currentTimeMillis();
        int iterations = 1000000;
        for (int i = 0; i <= iterations; i++) {
            // arr.add(0, i);
            arr.add(i); //ArrayList выигрывает в скорости при добавлении в конец
        }
        long time2 = System.currentTimeMillis();
        int result1 = (int) (time2 - time1);
        System.out.println("Time in ms for " + iterations + " iterations in ArrayList is " + result1 + " ms.");
    
        LinkedList <Integer> linkArr = new LinkedList<>();
        long time3 = System.currentTimeMillis();

        for (int i = 0; i <= iterations; i++) {
            // linkArr.add(0, i); // LinkedList выигрывает в скорости при добавлении в начало(нужно менять только одну ссылку)
            linkArr.add(i);
        }

        long time4 = System.currentTimeMillis();
        int result2 = (int)(time4 - time3);

        System.out.println("Time in ms for " + iterations + " iterations in LinkedList is " + result2 + " ms.");
    }
}
