// import java.lang.ProcessBuilder.Redirect.Type;
// import java.util.Random;
// import java.util.Scanner;
// import java.io.*;

/**
 * Многострочный комментарий
 * всегда нужно объявлять класс
 */

 /**
 * Типы данных - ссылочные(массивы) и примитивные(int, boolean, short, long,
 * float, double, etc.)
 * тип идентификатор; идентификатор = значение
 */

// public class programm {
    // public static void main(String[] args) {
        // System.out.println("bye world");
        // System.out.println("again");
        // String s = "    2";                        // нужно задавать значение(хотя бы null)
        // short age = 10;
        // int salary = 123456;
        // float e = 2.7f; // использовать суффикс f(float)!
        // double pi = 3.1415;
        // char ch = '1';
        // System.out.println(Character.isDigit(ch)); // true
        // ch = 'a';
        // int a =123;
        // double d = a;
        // boolean flag = true & false;               // boolean
        // System.out.println(flag);
        // boolean flag1 = 123<=234;
        // System.out.println(flag1);
        // boolean flag2 = 123>=234;
        // System.out.println(flag2);
        // boolean flag3 = flag1^flag2;
        // System.out.println(flag3);
        // String msg = "Hello world";                   // String
        // System.out.println(msg);
        // var i = 123.456;                                 // Неявная типизация
        // System.out.println(i);
        // var u = 123;
        // System.out.println(u);
        // System.out.println(getType(u));
        // System.out.println(getType(i));
        // int a = 123;
        // System.out.println(Integer.MAX_VALUE);           // классы обертки(Integer, Double, etc) нужны для работы с типами данных(изменение типа и тд, пишутся с большой буквы)
        // System.out.println(a);
        // String s = "qwer";
        // s.charAt(1);
        // System.out.println(s.charAt(1));
        // int a = 123;
        // // // a++;
        // a = --a - a--;
        // // System.out.println(a++);                            // 123 можно написать ++а
        // System.out.println(a);                              // 124 приоритет инкремента ниже его вывода
        // boolean b = 123 != 124;
        // System.out.println(b);
        // int a = 8;                                              // побитовые операции
        // // 1000
        // // a = a<<1;                                            // добавляем бит
        // System.out.println(a<<1);
        // int a = 18; // 10010 = 18
        // System.out.println(a>>1); // 1001 = 9
        // int a = 5;
        // int b = 2;
        // System.out.println(a | b);                                  // побитовая операция или (+)
        // // 101 = 5
        // // 010 = 2
        // // 111 = 7
        // int a = 5;
        // int b = 2;
        // System.out.println(a & b);                            //побитовая операция и
        // 101 = 5
        // 010 = 2
        // 000 = 0
        // int a = 5;
        // int b = 2;
        // System.out.println(a ^ b); // разделителтная операция истина  строго одна из истина                                     
        // // 101 = 5
        // // 010 = 2
        // // 111 = 7
        // String s = "qwer1"; // 5(0...4)
        // // boolean a = s.length()>= 5 && s.charAt(4) == '1'; // быстрая операция(хотя бы одно условие должно выполняться)
        // // boolean a = s.length()>= 5 & s.charAt(4) == '1';
        // boolean b = s.length() >= 5 || s.charAt(4) == '1';
        // boolean c = s.length() >= 5 | s.charAt(4) == '1';
        // System.out.println(b);
        // System.out.println(d);
        // System.out.println(Character.isDigit(ch)); // false
        // System.out.println(pi);
        // System.out.println(e);
        // System.out.println(age);
        // System.out.println(salary);
        // System.out.println(s);


        // массивы

        // int [] arr = new int[10];
        // int [] arr1 = new int[] {1,2,3};
        // arr[3]= 13;
        // System.out.println(arr[3]);
        // System.out.println(arr1[1]);

        // // многомерные массивы
        // int [] arr[] = new int[3][5];
        // for (int i = 0; i < arr.length; i++){
        //     for (int j = 0; j < arr[i].length; j++){
        //         arr[i][j] = i*j;
        //         System.out.printf("%d", arr[i][j]);
        //     }
        //     System.out.println();
        // }

        // Преобразования
        // int i = 123; 
        // double d = i; 
        // System.out.println(i); // 123
        // System.out.println(d); // 123.0
        // byte b = Byte.parseByte("12"); // byte позволяет хранить значения от 0 до 255
        // System.out.println(b);

        

//     }
//     // static String getType(Object o){                  // метод getType возвращающий тип данных переменной
//     //     return o.getClass().getSimpleName();
//     // }
// }

// // получение данных из терминала]
// public class programm {
//     public static void main(String[] args) {
//         Scanner iScanner= new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();           // string
        // System.out.printf("Привет, %s!\n", name);
        // System.out.printf("int a: ");
        // int x = iScanner.nextInt();
        // System.out.printf("double b: ");
        // double y = iScanner.nextDouble();
        // System.out.printf("%d + %f = %f \n", x, y, x + y);
        // System.out.printf("int c: ");
        // boolean flag = iScanner.hasNextInt();
        // System.out.println(flag);
        // int i = iScanner.nextInt();
        // System.out.println(i);
        // iScanner.close();

        // форматированыый вывод
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = a + " + " + b + " = " + c;
        // System.out.println(res);
        // // Конкатинация строк
        // String s = "qwe";
        // int a = 123;
        // String q = s + a;
        // System.out.println(q);
        // int a = 1, b = 2;
        // int c = a + b;
        // String res = String.format("%d + %d = %d \n", a, b, c);
        // System.out.printf("%d + %d = %d \n", a, b, c);
        // System.out.println(res);
        // float pi = 3.1415f;
        // System.out.printf("%f\n", pi); // 3,141500
        // System.out.printf("%.2f\n", pi); // 3,14
        // System.out.printf("%.3f\n", pi); // 3,141
        // System.out.printf("%e\n", pi); // 3,141500e+00
        // System.out.printf("%.2e\n", pi); // 3,14e+00
        // System.out.printf("%.3e\n", pi); // 3,141e+00

        // // область видимости переменных - {} в которых определена переменная
        // int b = 111;
        // {
        //     int a = 222;
        //     System.out.println(a+b);
        // }
        // int a = 123;
        // System.out.println(a);
    // }


    
// }


//             // Функции и методы
// public class programm {

//     public static void main(String[] args) {
//         lib.sayHi();
//         System.out.println(lib.sum(1, 3));
//         System.out.println(lib.factor(5));
//     }
// }

// Управляющие конструкции
// public class programm{
//     public static void main(String[] args) {
//         int a = 1;
//         int b = 2;
//         int c = 0;
        // if (a > b){
        //     c = a;
        // } else {
        //     c = b;
        // }
        // if (a > b) c = a;
        // if (b > a) c = b;
        // System.out.println(c);
        // int min = a < b ? a : b; // тернарный оператор
        // System.out.println(min);
//     }
// }
// public class programm {
//     public static void main(String[] args) {
//         Scanner iScaner = new Scanner(System.in);
//         System.out.printf("number of month: \n");
//         int month = iScaner.nextInt();
//         System.out.printf("name of month: \n");
//         String text = iScaner.nextLine();
//         switch (month) {
//             case 1:
//                 text = "Autumn";
//                 break;
//             default:
//                 text = "mistake";
//         }

//         iScaner.close();
//         }
//     }

// // Циклы

// while

// public class programm {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         while (value != 0) {
//             value /= 10;
//             count++;
//         }
//         System.out.println(count);
//     }
// }

// do while

// public class programm {
//     public static void main(String[] args) {
//         int value = 321;
//         int count = 0;

//         do {
//             value /= 10;
//             count++;
//         } while (value != 0);
//         System.out.println(count);
//     }
// }

// continue, break

// public class programm {
//     public static void main(String[] args) {
//         for (int i = 0; i < 10; i++) {
//             if (i % 2 != 0) {
//                 // continue;
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
// }
//             for (int i = 0; i < 10; i++) {
//                 // break;
//                 for (int j = 0; j < 5; j++) {
//                     break;
//                 }
//                 // break;
//             }
//     }
// }    

// for

// public class programm {
//     public static void main(String[] args) {
//         int arr[] = new int[]{1,2,3,4,5,6,77};
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = 10;
//         }
//         for (int item : arr) {
//             System.out.println(item);
//         }
//         System.out.println();
//     }
// }

// // Работа с файлами

// Создание и запись/дозапись

// public class programm {
//     public static void main(String[] args) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write("line 1");
//             fw.append('\n');
//             fw.append('2');
//             fw.append('\n');
//             fw.write("line 3");
//             fw.flush();
//         } catch (IOException ex) {
//             System.out.println(ex.getMessage());
//         }
//     }
// }

// Чтение, вариант по символьно

// public class programm {
//     public static void main(String[] args) throws Exception {
//         FileReader fr = new FileReader("file.txt");
//         int c;
//         while ((c = fr.read()) != -1) {
//             char ch = (char) c;
//             if (ch == '\n') {
//                 System.out.print(ch);
//             } else {
//                 System.out.print(ch);
//             }
//         }
//     }
// }

// Вариант построчно

// public class programm {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new FileReader("file.txt"));
//         String str;
//         while((str = br.readLine()) != null) {
//             System.out.printf("== %s ==\n", str);
//         }
//         br.close();
//     }
// }