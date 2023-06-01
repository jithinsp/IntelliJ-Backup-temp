package Week3_Assignments;
import java.util.Scanner;
public class EvenNos {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        int array[]=new int[10];
        System.out.println("Enter the array");
        for(int i=0;i<limit;i++){
            array[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<limit;i++){
            if(array[i]%2==0){
                count++;
            }
        }
        System.out.println("Number of even numbers in the given array is: "+count);
    }
}
