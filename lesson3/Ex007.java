package lesson3;

import java.util.*;

public class Ex007 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        // for (int item : list) { // for each loop
        //     System.out.println(item);
        // }

        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()) {
            // col.remove();
            System.out.println(col.next());
            // col.next();
            
        }

    }
}

// // Функционал

// hasNext(), next(), remove()
// ListIterator<E>
// hasPrevious(), E previous(), nextIndex(), previousIndex(), set(E e), add(E e)