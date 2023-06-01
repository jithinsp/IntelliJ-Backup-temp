package Week3_Assignments;
import java.util.Scanner;
public class interest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        int amount=scan.nextInt();
        System.out.println("Enter the number of years");
        double years=scan.nextDouble();
        System.out.println("Enter the interest rate");
        double interest=scan.nextDouble();
        double calculated=(amount*interest*years)/100;
        System.out.println("Interest is: "+ calculated);
    }
}
