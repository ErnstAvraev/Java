import java.util.Scanner;
public class seminar1HW {
    public static void main(String[] args) {
        Scanner scan_line = new Scanner(System.in);

        
        while (true) {
            System.out.print("\nWhich task to start (1, 2, 3 or 4, press any to stop): ");
            String task = scan_line.next();
            switch (task) {
                case "1" -> {
                    System.out.print("TASK 1:");
                    System.out.print("\nEnter num N: ");
                    int N = scan_line.nextInt();
                    task_01(N);
                }
                case "2" -> {
                    System.out.print("\nTASK 2:\n");
                    task_02();
                }
                case "3" -> {
                    System.out.println("TASK 3:");
                    System.out.print("Enter first num: ");
                    int num_1 = scan_line.nextInt();
                    System.out.print("Enter operation: ");
                    String oper = scan_line.next();
                    System.out.print("Enter second num: ");
                    int num_2 = scan_line.nextInt();
                    task_03(num_1, oper, num_2);
                }
                case "4" -> {
                    System.out.println("TASK 3:");
                    System.out.print("Enter first num: ");
                    int num_1 = scan_line.nextInt();
                    System.out.print("Enter second num: ");
                    int num_2 = scan_line.nextInt();
                    System.out.print("Enter result: ");
                    int num_3 = scan_line.nextInt();
                    task_04(num_1, num_2, num_3);
                }
                default -> System.exit(0);
            }
        }
    }

    public static void task_01 (int N) {
        int count_sum = 0;
        int count_fuck = 1;
        for (int i = 1; i <= N; i ++){
            count_sum += i;
            count_fuck *= i;
        }
        System.out.printf("Sum of nums from 1 to %s is %s", N, count_sum);
        System.out.printf("\nFactorial of num %s is %s", N, count_fuck);
        System.out.println();
    }

    public static void task_02(){
        int print_count = 0;
        for (int i = 2; i <= 1000; i ++){
            boolean simple_num = true;
            for (int j = 2; j <= i - 1; j ++){
                if (i % j == 0){
                    simple_num = false;
                    break;
                }
            }
            if (simple_num) {
                System.out.print(i +" ");
                print_count ++;
            }
            if (print_count == 10) {
                System.out.println();
                print_count = 0;
            }
        }
        System.out.println();
    }

    public static void task_03(int num_1, @NotNull String oper, int num_2){
        int res = switch (oper) {
            case "-" -> num_1 - num_2;
            case "+" -> num_1 + num_2;
            case "/" -> num_1 / num_2;
            case "*" -> num_1 * num_2;
            default -> 0;
        };
        System.out.print("Result is " + res);
    }

    public static void task_04(int num_1, int num_2, int num_3){
        System.out.printf("Looking for %s? + ?%s = %s ...", num_1, num_2, num_3);
        if (num_3 - num_2 - num_1 * 10 < 0){
            System.out.print("\nNo suggestions!");
        }
        else{
            num_1 = num_1 * 10 + (num_3 - num_2) % 10;
            num_2 = num_3 - num_1;
            System.out.printf("\nResult is %s + %s = %s", num_1, num_2, num_1 + num_2);
        }
    }
    

}