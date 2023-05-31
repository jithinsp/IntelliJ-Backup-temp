import java.util.Arrays;
import java.util.Scanner;
public class ArrayPrint {
    public static void main(String[] args) throws Exception {
        Scanner scan=new Scanner(System.in);
        int [] arr=new int[5];
        System.out.println("Enter your numbers:");
        for (int i=0;i<5;i++){
            arr[i]=scan.nextInt();
        }
        scan.close();
        String stringarr=Arrays.toString(arr);
        System.out.println(stringarr);
    }
}