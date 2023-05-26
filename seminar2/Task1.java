package Java.seminar2;

import java.util.Scanner;

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который 
// вернет строку длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

// 6 a b
// Вернуть: ababab



public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число N: ");
        Scanner input = new Scanner(System.in);
        int users_num = input.nextInt();
        System.out.println("Введите первый символ: ");
        String users_char_1 = input.next();
        System.out.println("Введите второй символ: ");
        String users_char_2 = input.next();
        input.close();
        System.out.println(String_Maker(users_char_1, users_char_2, users_num));
    }

    public static String String_Maker(String char_1, String char_2, int string_length) {
        StringBuilder final_string = new StringBuilder();
        
        for (int i = 0; i < string_length/2; i++) {
            final_string.append(char_1).append(char_2);  // можно добавлять подряд в одну строку
            // final_string.append(char_1);
            // final_string.append(char_2);
        }
        if (string_length%2 != 0){
            final_string.append(char_1);
        }
        return final_string.toString();
    }
}


