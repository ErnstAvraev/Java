package seminar4;
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и "запоминает" строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая последней.

import java.util.Scanner;
import java.util.Stack;

public class task3 {
    public static void main(String[] args) {
        Stack<String> heap = new Stack<>();
        Scanner input = new Scanner(System.in);
        String text = "";
        while(!text.contains("print")) {
            System.out.println(heap);
            System.out.println("Введите текст: ");
            text = input.next();
            if (text.contains("print")) {
                while(!heap.isEmpty()) {
                    System.out.println(heap.pop());
                }
                input.close();
            } else {
                heap.push(text);
            }
        }
    }
}
