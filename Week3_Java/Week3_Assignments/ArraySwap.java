package Week3_Assignments;
import java.util.Scanner;
public class ArraySwap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        int array1[]=new int[10];
        int array2[]=new int[10];
        System.out.println("Enter the first array");
        for(int i=0;i<limit;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the second array");
        for(int i=0;i<limit;i++){
            array2[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<limit;i++){
            temp=array2[i];
            array2[i]=array1[i];
            array1[i]=temp;
        }
        System.out.println("The first array:");
        for(int i=0;i<limit;i++){
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("The second array:");
        for(int i=0;i<limit;i++){
            System.out.print(array2[i]+" ");
        }
    }
}
