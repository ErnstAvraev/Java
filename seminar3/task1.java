package seminar3;
// Заполнить список 10 случайными числами. Отсортировать методом sort() 

// и вывести его на экран

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        Random rnd = new Random();
        ArrayList<Integer> rnd_list = new ArrayList<Integer>(10);
        for (int i = 0; i < 10; i++) {
            rnd_list.add(rnd.nextInt(1, 10));
        }
        System.out.println(rnd_list);
        rnd_list.sort(Comparator.naturalOrder());
        System.out.println(rnd_list);
    }
}
