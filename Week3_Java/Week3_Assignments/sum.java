package Week3_Assignments;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=scan.nextInt();
        double num2=scan.nextDouble();
        double sum=num1+num2;
        System.out.println("The sum is: "+ sum);
    }
}
