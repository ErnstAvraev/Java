package seminar3;

import java.util.ArrayList;
import java.util.Random;


// Создать список типа ArrayList<>. Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

public class task3 {
    public static void main(String[] args) {
        ArrayList mixed_list = new ArrayList<>();
        String[] words = new String[]{"word", "list", "photo", "way"};
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            int type = rnd.nextInt(0,2);
            if (type == 0){
                mixed_list.add(rnd.nextInt(1, 10));
            } else {
                mixed_list.add(words[rnd.nextInt(words.length)]);
            }
        }
        System.out.println(mixed_list);

// через for
        // for (int i = 0; i < mixed_list.size(); i++) {
        //     if (mixed_list.get(i) instanceof Integer){
        //         mixed_list.remove(i);
        //         i --;
        //     }
        // }
// через while
        // int i = 0;
        // while (i < mixed_list.size()) {
        //     if (mixed_list.get(i) instanceof Integer) {
        //         mixed_list.remove(i);
        //     } else {
        //         i++;
        //     }
            
        // }
// решение второго зала(идем с конца)
        for (int i = mixed_list.size() - 1; i >= 0; i--) {
            if (mixed_list.get(i) instanceof Integer) {
                mixed_list.remove(i);
            }
        }
        System.out.println(mixed_list);
    }
}
