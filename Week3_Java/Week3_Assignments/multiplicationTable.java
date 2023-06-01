package Week3_Assignments;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {                
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter a number:");
    int number=scan.nextInt();
    for(int i=1;i<=10;i++){
        System.out.println(i+" x "+number+" = "+i*number);
    }
}
}
