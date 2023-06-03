package lesson3;

import java.util.Arrays;
import java.util.List;

public class Ex005 {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        List<StringBuilder> d = Arrays.asList(day, month, year);
        System.out.println(d); // [28, 9, 1990]
        day = new StringBuilder("09");
        System.out.println(d); // [28, 09, 1990]
    }
}

// // Функционал

// clear() - очистка списка
// toString() - конвертация списка в строку
// Arrays.asList - преобразует массив в список
// containsAll(col) - проверяет включение всех элементов из col
// removeAll(col) - удаляет элементы, имеющиеся в col
// retainAll(col) - оставляет элементы, имеющиеся в col
// toArray(type array) - конвертация списка в массив type
// List.copyOf(col) - возвращает копию списка на основе имеющегося
// List.of(item1, item2,...) - возвращает неизменяемый список