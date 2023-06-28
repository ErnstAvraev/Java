package seminar5.HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import seminar2.input;

public class task1 {
    public static void main(String[] args) {
        
       Map <String, ArrayList<Integer>> phone_book = new HashMap<>();
       while (true){
            int enter = input.Int("Введите действие(1 - добавить, 2 - показать тел. книгу, 0 - выйти): " );
            switch(enter){
                case 1 -> enter_contact(phone_book);
                case 2 -> print_contact(phone_book);
                case 0 -> System.exit(0);
            }
       }
    }

    public static void enter_contact(Map <String, ArrayList<Integer>> phone_book) {
        ArrayList <Integer> phone_nums = new ArrayList<>();
        String name_input = input.Str("Введите фамилию: ");
        int phone_input = input.Int("Введите номер телефона: ");
        if (!phone_book.containsKey(name_input)){
            phone_nums.add(phone_input);
            phone_book.put(name_input, phone_nums);
       }
       else {
           phone_nums = phone_book.get(name_input);
           phone_nums.add(phone_input);
           phone_book.put(name_input, phone_nums);
        }
    }

    public static void print_contact(Map <String, ArrayList<Integer>> phone_book) {
        for (Map.Entry<String, ArrayList<Integer>> entry : phone_book.entrySet()) {
            System.out.println(entry.getKey() + ": тел. " + entry.getValue());
        }
    }
}
