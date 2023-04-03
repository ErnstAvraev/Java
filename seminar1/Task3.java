import java.util.Arrays;
import java.util.Scanner;

// Дан массив nums = [3,2,2,3,4,3] и число val вводим с клавиатуры 

// Если в массиве есть числа, равные заданному, нужно перенести 
// эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива 
// должны быть отличны от заданного, а остальные - равны ему.
// Ввод: 3
// Вывод:
// 2, 2, 4, 3, 3, 3

public class Task3 {
    // public static void main(String[] args) {
    //     int [] nums = new int[] {3, 2, 2, 3, 4, 3};
    //     Scanner input = new Scanner(System.in);
    //     System.out.println(Arrays.toString(nums));
    //     System.out.print("Введите val = ");
    //     int val = input.nextInt();
    //     int idx = 0;
    //     int [] nums_fixed = new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         if (nums[i] != val) {
    //             nums_fixed[idx] = nums[i];
    //             idx++;
    //         }
    //     }
    //     for (int i = idx; i < nums_fixed.length; i++) {
    //         nums_fixed[i] = val;
    //     }
    //     System.out.println(Arrays.toString(nums_fixed));
    //     input.close();
    


    // // решение через функцию
    // public static void main(String[] args) {
    //     int [] nums = new int[] {3, 2, 2, 3, 4, 3};
    //     Scanner input = new Scanner(System.in);
    //     System.out.println(Arrays.toString(nums));
    //     System.out.print("Введите val = ");
    //     int val = input.nextInt();
    //     System.out.println(Arrays.toString(formatedArray1(nums, val)));
    //     input.close();
    // }
    
    // public static int[] formatedArray1(int[] usersArray, int usersNum) {
    //     int[] formArr = new int[usersArray.length];
    //     int j = 0;
    //     int k = 0;
    //     for (int i = 0; i < usersArray.length; i++) {
    //         if (usersArray[i] == usersNum) {
    //             formArr[formArr.length-(k+1)] = usersArray[i];
    //             k++;
    //         }
    //         else {
    //             formArr[j] = usersArray[i];
    //             j++;
    //         }
    //     }
    //     return formArr;
    // }

// еще одно решение из 3 зала
    public static void main(String[] args) {
        int[] arr = new int[] {3,2,3,6,4,3,7,8,5,4,3};
        int[] mas = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;

        Scanner n = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = n.nextInt();
        n.close();

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                mas[right] = arr[i];
                right--;
            }
            else{
                mas[left] = arr[i];
                left++;
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
