package seminar4.HW;
// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> linkList = new LinkedList<>();
        Random rnd = new Random();
        for (int i = 0; i < rnd.nextInt(20); i++) {
            linkList.add(rnd.nextInt(10));
        }
        System.out.println(linkList);
        LinkedList<Integer> revLinkList = new LinkedList<>();
        for (int i = linkList.size()-1; i >= 0; i--) {
            revLinkList.add(linkList.get(i));
        }
        System.out.println(revLinkList);
    }
}
