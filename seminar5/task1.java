package seminar5;
// Создать структуру для хранения номеров паспортов и фамилий сотрудников
// 123456 Иванов
// 321456 Васильев
// 234561 Петрова
// 234432 Иванов
// 654321 Петрова
// 345678 Иванов
// Вывести данные по сотрудникам с фамилией Иванов

import java.util.HashMap;
import java.util.Map;
import seminar2.input;

public class task1 {
    public static void main(String[] args) {
        HashMap<Integer, String> bd_pas = pasports();
        for (Map.Entry <Integer, String> item : bd_pas.entrySet()) {
            if(item.getValue().equals("Иванов")){
                System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue());
            }
        }
        for (Map.Entry <Integer, String> item : bd_pas.entrySet()){
            if (item.getKey() == 234561){
                System.out.printf("Key: %s Value: %s \n", item.getKey(), item.getValue());
            } 
        }
    }

    public static HashMap<Integer, String> pasports(){
        HashMap<Integer, String> pasport = new HashMap<>();
        pasport.put(123456, "Иванов");
        pasport.put(321456, "Васильев");
        pasport.put(234561, "Петрова");
        pasport.put(344321, "Иванов");
        pasport.put(654321, "Петрова");
        pasport.put(345678, "Иванов");
        int number = 1;
        while (number != 0) {
            number = input.Int("Введите номер пасспорта: ");
            String surname = input.Str("Введите фамилию: ");
            pasport.put(number, surname);
        }
        return pasport;
    }
}
