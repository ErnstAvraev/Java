package seminar2.seminar2HW;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class task1 {
    public static void main(String[] args) {
        int [] arr = new int [] {6,4,5,3,8,9,0,1};
        int temp;
        String log;
        boolean isSorted = false;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i + 1]){
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            try (FileWriter writer = new FileWriter("log.txt", true)){
                Date date = new Date();
                String date_to_write = date + ": " + "i-" + i + " ";
                writer.write(date_to_write);
                log = Arrays.toString(arr);
                writer.write(log);
                writer.append('\n');
                writer.flush();
            }
            catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
