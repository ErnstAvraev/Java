package seminar3.seminar3HW;

import java.util.ArrayList;
import java.util.Random;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
// среднее ариф. из этого списка.
public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(rnd.nextInt(1, 50));
        }
        System.out.println(list);
        System.out.println("Минимальное число в списке: " + min(list));
        System.out.println("Максимальное число в списке: " + max(list));
        System.out.println("Среднее арифметическое число из этого списка: " + average(list));
    }

    public static int min(ArrayList<Integer> list) {
        int min = 50;
        for (int i = 0; i < list.size(); i++) {
            int index = (int) list.get(i);
            if (index < min) {
                min = index;
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> list) {
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int index = (int) list.get(i);
            if (index > max) {
                max = index;
            }
        }
        return max;
    }

    public static double average(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            int index = (int) list.get(i);
            sum = sum + index;
        }
        
        double average = (double) sum / (double) list.size();
        return average;
    }
    
}
