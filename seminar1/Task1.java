import java.util.Scanner;

public class Task1 {
//     1. Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
//     Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
    public static void main(String [] args) {
        Scanner iScanner = new Scanner(System.in);
        // Scanner iScanner = new Scanner(System.in, "Cp866")
        System.out.println("Здравстуйте!");
        System.out.println("Введите пожалуйста имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }
}
// iScaner.nextLine - считывает строку
// iScaner.nextInt - считывает целое число
// iScaner.next - считывает следующий элемент
