package seminar4;
// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и "запоминает" строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая последней.

// import java.io.BufferedReader; // для второго решения
import java.io.IOException; // для второго решения
// import java.io.InputStreamReader; // для второго решения
// import java.util.Deque; // для второго решения
// import java.util.LinkedList; // для второго решения
import java.util.Scanner; // для первого решения
import java.util.Stack; // для первого решения

public class task3 {
    public static void main(String[] args) throws IOException {
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
    



// Решение второго зала
        // BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
        // String tempIn1 = "";
        // Deque<String> list1 = new LinkedList<>();
        // for (int i = 0; ; i++) {
        //     tempIn1 = reader1.readLine();
        //     if (tempIn1.equals("print")){
        //         while(!list1.isEmpty()) {
        //             System.out.println(list1.pollLast());
        //         }
        //         break;
        //     } else {
        //         list1.add(tempIn1);
        //     }
        // }

    }
}