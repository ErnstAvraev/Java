package seminar2.seminar2HW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) {
        BufferedReader reader;
        StringBuilder new_string = new StringBuilder();

        try {
            reader = new BufferedReader(new FileReader("Journal.txt"));
            String line = reader.readLine();
            while (line != null) {
                String[] str_array = line.split("[\",:]");
                for (String s : str_array) {
                    switch (s) {
                        case "фамилия" -> new_string.append("Студент ");
                        case "оценка" -> new_string.append(" получил ");
                        case "предмет" -> new_string.append(" по предмету ");
                        default -> new_string.append(s);
                    }
                }
                System.out.println(new_string);
                new_string.setLength(0);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
