package seminar3.seminar3HW;

import java.util.ArrayList;
import java.util.Random;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа
public class task1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<Integer>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(1,11));
        }
        System.out.println(list);

        for(int i = list.size()-1; i >= 0; i--) {
            if (list.get(i)%2 ==0) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
