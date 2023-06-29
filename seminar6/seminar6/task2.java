package seminar6.seminar6;
// 1. Напишите метод, который заполнит массив из 100 элементов случайными цифрами от 0 до 100.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

// 2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите 
// процент уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.

// Для вычисления процента используйте формулу:

// процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> userList = fillArr();
        System.out.println(unique(userList) + "%");

    }

    public static LinkedList <Integer> fillArr() {
        Random rnd = new Random();
        LinkedList<Integer> usersArray = new LinkedList<>();
        for (int i = 0; i < 130; i++) {
            usersArray.add(rnd.nextInt(101));
        }
        
        return usersArray;
    }

    public static Double unique (LinkedList<Integer> list) {
        Set <Integer> set = new HashSet<>(list);
        System.out.println(set);
        return (double)set.size() * 100 / list.size();
    }

}
