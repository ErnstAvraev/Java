package lesson3;

public class main {


    // // // Object


    // public static void main(String[] args) {
    //     Object o = 1; GetType(o);   // java.lang.Integer
    //     o = 1.2; GetType(o);        // java.lang.Double
    //     System.out.println(Sum(1, 2));
    //     System.out.println(Sum(1.0, 2));
    //     System.out.println(Sum(1, 2.0));
    //     System.out.println(Sum(1.2, 2.1));
    // }
    // static void GetType(Object obj){
    //     System.out.println(obj.getClass().getName());
    // }

    // static Object Sum(Object a, Object b){

    //     if ( a instanceof Double && b instanceof Double){
    //         return (Object)((Double) a + (Double) b);
    //     }
    //     else if (a instanceof Integer && b instanceof Integer) {
    //         return (Object)((Integer) a + (Integer) b);
    //     }
    //     else return 0;
    // }


    // // // Массивы


    // public static void main(String[] args) {
    //     int [] a = new int[] {1, 9};
    //     int [] b = new int[3];
    //     System.arraycopy(a, 0, b, 0, a.length); 

    //     for (int i : a) {System.out.printf("%d", i);} // 1 9

    //     for (int j : b) {System.out.printf("%d", j);} // 1 9 0 
    // }


    // // // Добавление по одному через метод


    // static int[] AddItem (int[] array, int item) {
    //     int length = array.length;
    //     int[] temp = new int[length + 1];
    //     System.arraycopy(array, 0, temp, 0, length);
    //     temp[length] = item;
    //     return temp;
    // }

    // public static void main(String[] args) {
    //     int[] a = new int[] {0, 9};
    //     for (int i : a) {System.out.printf("%d", i);}
    //     System.out.println();
    //     a = AddItem(a, 2);
    //     a = AddItem(a, 3);
    //     for (int j : a) {System.out.printf("%d", j);}
    // }


    // // // Collection


    // // ArrayList, LinkedList (List)

    // * см. Ex002.java
}
    // // List

    // * см. Ex005.java


    // // // Итератор


    // * см. Ex007.java
