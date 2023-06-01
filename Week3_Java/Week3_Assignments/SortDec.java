package Week3_Assignments;
import java.util.Scanner;
public class SortDec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        int array[]=new int[10];
        System.out.println("Enter the array");
        for(int i=0;i<limit;i++){
            array[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                if(array[i]>array[j]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println("The sorted array:");
        for(int i=0;i<limit;i++){
            System.out.print(array[i]+" ");
    }
}
}
