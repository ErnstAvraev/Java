package seminar2;
import java.io.File;
import java.io.FileWriter;


public class filewriting {
    public static void main(String[] args) {
        Integer n = 10;
        String text = "TEST";
        File file = new File("1.txt");
        try{
            FileWriter writer = new FileWriter(file,false); // false - файл перезапичывается, true - дописывается
            for (int i = 0; i < n; i++){
                writer.write(text);
                writer.write("\n");
            }
            writer.close();
            System.out.println("Получилось!");
        }
        catch(Exception e){
            System.out.println("Что то пошло не так");
        }
    }
        
}

