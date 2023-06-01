// package Week3_Assignments;
// import java.util.Scanner;
// public class grade {
//     public static void main(String[] args) {
//         Scanner scan =new Scanner(System.in);
//         System.out.println("Enter your marks:");
//         double mark = scan.nextDouble();
//         if(mark>=90){
//             System.out.println("Your grade is A");
//         }else if(mark>=80){
//             System.out.println("Your grade is B");
//         }else if(mark>=70){
//             System.out.println("Your grade is C");
//         }else if(mark>=60){
//             System.out.println("Your grade is D");
//         }else if(mark>=50){
//             System.out.println("Your grade is E");
//         }else{
//             System.out.println("You are failed");
//         }
//     }
// }
package Week3_Assignments;
import java.util.Scanner;
public class grade {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your marks:");
        double mark = scan.nextDouble();
        switch(mark)




        if(mark>=90){
            System.out.println("Your grade is A");
        }else if(mark>=80){
            System.out.println("Your grade is B");
        }else if(mark>=70){
            System.out.println("Your grade is C");
        }else if(mark>=60){
            System.out.println("Your grade is D");
        }else if(mark>=50){
            System.out.println("Your grade is E");
        }else{
            System.out.println("You are failed");
        }
    }
}