package Week3_Assignments;
import java.util.Scanner;
public class oddSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit = scan.nextInt();
        int sum = 0;
        for (int i = 1; i <= limit; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The sum of odd numbers for " + limit + " is: " + sum);
    }
}