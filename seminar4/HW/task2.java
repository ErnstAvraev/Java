package seminar4.HW;

import java.util.LinkedList;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        enqueue(linkList, 1);
        enqueue(linkList, 2);
        enqueue(linkList, 3);
        enqueue(linkList, 4);
        enqueue(linkList, 5);
        enqueue(linkList, 6);
        enqueue(linkList, 7);
        System.out.println(linkList);
        dequeue(linkList);
        dequeue(linkList);
        dequeue(linkList);
        first(linkList);
    }

    public static LinkedList<Integer> enqueue(LinkedList<Integer> list, int num) {
        list.add(num);
        return list;
    }
    public static LinkedList<Integer> dequeue(LinkedList<Integer> list) {
        System.out.println(list.removeFirst());
        return list;
    }
    public static LinkedList<Integer> first(LinkedList<Integer> list) {
        System.out.println(list.peekFirst());
        return list;
    }
}
