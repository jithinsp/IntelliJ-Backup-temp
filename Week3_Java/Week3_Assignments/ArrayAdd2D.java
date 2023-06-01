package Week3_Assignments;
import java.util.Scanner;
public class ArrayAdd2D {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit:");
        int limit=sc.nextInt();
        int array1[][]=new int[10][10];
        int array2[][]=new int[10][10];
        int array3[][]=new int[10][10];
        System.out.println("Enter the first array");
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                array1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the second array");
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                array2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                array3[i][j]=array1[i][j]+array2[i][j];
            }
        }
        System.out.println("The resultant array is:");
        for(int i=0;i<limit;i++){
            for(int j=0;j<limit;j++){
                System.out.print(array3[i][j]+" ");
            }
            System.out.println();
        }
    }  
}
