import java.lang.reflect.Array;
import java.util.Arrays;

// Дан массив двоичных чисел, например [1,1,0,1,1,1,1,0,1,1,1],
// вывести максимальное количество подряд идущих 1.

// Вывод: 4
public class Task2 {
    // public static void main(String[]args) {
    //     int [] arr = new int [] {1,1,2,1,11,1,1,1,1,1,0,1,1,1,1};
    //     int count = 0;
    //     int temp = 0;
    //     for (int i = 0; i < arr.length; i++){
    //         if (arr[i] == 1){
    //             temp ++;
    //         }
    //         else {
    //             if (temp > count){
    //                 count = temp;
    //             }
    //             temp = 0;
    //         }
    //     }
    //     if (temp > count){
    //         count = temp;}
    //     System.out.println(Arrays.toString(arr));
    //     System.out.println(count);
    // }


// Решение через функцию
    public static void main (String[] args) {
        int [] init_arr = new int [] {1,0,1,0,0,0,0,1,1,1,1,2,0,1,0,0,1,1,1,1,1};
        System.out.println(Arrays.toString(init_arr));
        System.out.printf("Максимальная последовательность = %d\n", calc1(init_arr));
    }
    public static int calc1(int[] arr) {
        int count = 0;
        int temp_count = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                temp_count++;
            }
            if (temp_count > count) {
                count = temp_count;
            }
            if (arr[i] != 1) {
                temp_count = 0;
            }
        }
        return count;
    }



}
