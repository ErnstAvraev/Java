package Java.lesson2;
// import java.io.File;
// import java.lang.System.Logger;
// import java.util.logging.XMLFormatter;

// public class lesson2 {
    // public static void main(String[] args) {
    //     var n = System.currentTimeMillis();
    //     String str = "";
    //     for (int i = 0; i < 1000000; i++) {
    //         str+="+";
    //     }
    //     System.out.println(System.currentTimeMillis() - n);
    // }
    // 43908 ms

    // public static void main(String[] args) {
        // var n = System.currentTimeMillis();
        // StringBuilder sb = new StringBuilder();
        // for (int i=0; i<1000000; i++){
        //     sb.append("+");
        // }
        // System.out.println(System.currentTimeMillis() - n);

    // }
    // // 10 ms
    
// // String функционал

//     concat(): объединение строк
//     valueOf(): преобразует Object в строковое представление(завязан на toString())
//     join(): объединяет набор строк в одну с учетом разделителя
//     charAt(): получение символа по индексу
//     indexOf(): первый индекс вхождения подстроки
//     lastIndexOf(): последний индекс вхождения подстроки
//     startsWith()/endsWith(): определяет, начинается/заканчивается ли строка с подстроки
//     replace(): замена одной подстроки на другую
//     trim(): удаляет начальные и конечные пробелы
//     substring(): возвращает подстроку, см.аргументы
//     toLowerCase()/toUpperCase(): возвращает новую строку в нижнем/верхнем регистре
//     compareTo(): сравнивает две строки
//     equals(): сравнивает строки с учетом регистра
//     equalsIgnoreCase(): сравнивает строки без учета регистра
//     regionMatches(): сравнивает подстроки в строках

    // public static void main(String[]args) {
    //     String[] name = {"С", "е", "р", "г", "е", "й"};
    //     String sk = "СЕРГЕЙ КА.";
    //     System.out.println(sk.toLowerCase()); // сергей ка.
    //     System.out.println(String.join(" ", name)); // С е р г е й
    //     System.out.println(String.join("", "С", "е", "р", "г", "е", "й")); // Сергей
    //     System.out.println(String.join("1", "С", "е", "р", "г", "е", "й")); // С1е1р1г1е1й
    //     }

    // StringBuilder - выгоднее использовать если мы собираемся компоновать, собирать материал
    // String - если нужно разобрать готовый материал


// Работа с файловой системой
// Для работы нужно
// File <name> = new File(<полный путь к файлу>)
        // File f1 = new File("file.txt")
        // File f2 = new File("/Users/ernstavraev/Desktop/Обучение/file.txt")
        // public static void main(String[] args) {
        //     String pathProject = System.getProperty("user.dir");
        //     String pathFile = pathProject.concat("/file.txt");
        //     File f3 = new File(pathFile);
        //     System.out.println(f3.getAbsolutePath());

        //     // /Users/ernstavraev/Desktop/Обучение/file.txt // mac
        // }

// Файлы. Ошибки
// использовать try catch finally
// try {
//     Код, в котором может появиться ошибка
// } catch (Exception e) {
//     Обработка, если ошибка случилась (файла не обнаружено и тд)
// }
// finally {
//     Код, который выполниться в любом случае
// }

    // public static void main(String[] args) {
    //     try {
    //         String pathProject = System.getProperty("user.dir");
    //         String pathFile = pathProject.concat("/file.txt");
    //         File f3 = new File(pathFile);
    //         System.out.println("try");
    //     } catch (Exception e) {
    //         System.out.println("catch");
    //     }
    //     finally {
    //         System.out.println("finally");
    //     }
        
    // }

// // File функционал
// isHidden(): возвращает истину, если каталог или файл является скрытым
// length(): возвращает размер файла в байтах
// lastModified(): возвращает время последнего изменения файла или каталога
// list(): возвращает массив файлов и подкаталогов, которые находятся в каталоге
// listFiles(): возвращает массив файлов и подкаталогов, которые находятся в определенном каталоге
// mkdir(): создант новый каталог
// renameTo(File dest): переименовывает файл или каталог

// Бинарные файлы

// Логирование

        // Использование
        // Logger logger = Logger.getLogger();

        // Уровни важности
        // INFO, DEBUG, ERROR, WARNING и др

        // Вывод
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);

        // Формат вывода: структкрированный, абы как*
        // XMLFormatter, SimpleFormatter


// }

