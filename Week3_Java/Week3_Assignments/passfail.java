package Week3_Assignments;
import java.util.Scanner;
public class passfail {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your marks:");
        double mark = scan.nextDouble();
        if(mark>=50){
            System.out.println("Passed");
        }
        else{
            System.out.println("Failed");
        }
    }
}
