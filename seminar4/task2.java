package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

import javax.lang.model.util.SimpleAnnotationValueVisitor9;
import javax.sql.StatementEventListener;

// Реализовать консольное приложение, которое: 
// 1. Принимает от пользователя строку
// 2. Сохранить text в связаный список.
// 3. Если введено print~num, выводит строку из позиции num в связаном списке и удаляет ее из списка

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList <String> linkArr = new LinkedList<>();
        while(true){
            System.out.println(linkArr);
            System.out.println("Введите строку: ");
            String text = input.nextLine();
            if (text.contains("print~")){
                int remove_ind = Integer.parseInt(text.split("~")[1]);
                try {
                    System.out.println(linkArr.get(remove_ind));
                    linkArr.remove(remove_ind);
                } catch (IndexOutOfBoundsException e){
                    System.out.println(e.getMessage());
                    System.out.println("Введите индекс объекта начиная с 0!");
                }
            } else if (text.contains("~stop")){
                input.close();
                break;
            } else {
                linkArr.add(text);
            }
        }
    }
}
