package lesson3;
import java.util.ArrayList;
public class Ex002 {

   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>(); // < > - обобщение(для явного указания типа данных)
    //    ArrayList list = new ArrayList();
    
       list.add(2809);
       list.add(1234);
       list.add(8976);
       list.add(5674);
       list.add(4839);


       for (Object o : list) {
           System.out.println(o);
       }
       System.out.println(list.get(0));
       System.out.println(list.subList(0, 5));
   }
}

// // Разные способы создания 

// ArrayList<Integer> list1 = new ArrayList<Integer>();
// ArrayList<Integer> list2 = new ArrayList<>();
// ArrayList<Integer> list3 = new ArrayList<>(10);
// ArrayList<Integer> list4 = new ArrayList<>(list3);


// // Функционал

// add(args) - добавляет элемент в список(в т.ч. на нужную позицию)
// get(pos) - возвращает элемент из списка по указанной позиции
// indexOf(item) - первое вхождение или -1
// lastIndexOf(item) - последнее вхождение или -1
// remove(pos) - удаление элемента на указаной позиции и его возвращение
// set(int pos, T item) - помещает значение item элементу, который находится на позиции pos
// sort(Comparator) - сортирует набор данных по правилу
// subList(int start, int end) - получение набора данных от позиции start до end