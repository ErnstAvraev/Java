

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addNumber(String name, String phoneNumber) {
        List<String> numbers = contacts.getOrDefault(name, new ArrayList<>());
        numbers.add(phoneNumber);
        contacts.put(name, numbers);
    }

    public void printAll() {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            String name = entry.getKey();
            List<String> numbers = entry.getValue();
            System.out.println("Name: " + name);
            System.out.println("Phone numbers: ");
            for (String number : numbers) {
                System.out.println(number);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        Scanner scanner = new Scanner(System.in);

        int choice = -1;

        while (choice != 0) {
            System.out.println("Выберите команду:");
            System.out.println("1 - Добавить номер");
            System.out.println("2 - Показать все номера");
            System.out.println("0 - Выход");

            choice = scanner.nextInt();
            scanner.nextLine(); // Очистка буфера

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите номер: ");
                    String phoneNumber = scanner.nextLine();
                    phoneBook.addNumber(name, phoneNumber);
                    System.out.println("Номер добавлен");
                    break;
                case 2:
                    System.out.println("Все номера:");
                    phoneBook.printAll();
                    break;
                case 0:
                    System.out.println("Программа завершена");
                    scanner.close();
                    break;
                default:
                    System.out.println("Некорректный выбор");
                    break;
            }
        }
    }
}