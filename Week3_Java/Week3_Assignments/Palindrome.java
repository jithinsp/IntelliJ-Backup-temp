package Week3_Assignments;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String sentence=sc.nextLine();
        int size = sentence.length();
        int j=size;
        int flag=0;
        for(int i=0;i<size;i++){
            if(sentence.charAt(i)!=sentence.charAt(j-1)){
                flag=1;
                break;
            }
            else{
                j--;
            }
        }
        if(flag==1){
            System.out.println("The entered string is not a palindrome");
        }
        else{
            System.out.println("The entered string is a palindrome");
        }
    }
}
