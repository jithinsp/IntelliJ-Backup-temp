package Week3_Assignments;

import java.util.Scanner;

class ArrayMethod {
    int array1[][] = new int[10][10];
    int array2[][] = new int[10][10];
    int array3[][] = new int[10][10];
    int limit;

    public void getArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        limit = sc.nextInt();
        System.out.print("Enter array 1 Elements: ");
        for (int i = 0; i < limit; i++){
            for (int j = 0; j < limit; j++){
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter array 2 Elements: ");
        for (int i = 0; i < limit; i++){
            for (int j = 0; j < limit; j++){
                array2[i][j] = sc.nextInt();
            }
        }
    }
    void AddArray() {
        for (int i = 0; i < limit; i++) {
            for (int j = 0; j < limit; j++){
                array3[i][j] = array1[i][j] + array2[i][j];
            }
        }
    }

    void displayArray() {
        System.out.println("Sum of array 1 and array 2: ");
        for (int i = 0; i < limit ; i++){
            for (int j = 0; j < limit; j++){
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class W22Add2DArray {
    public static void main(String[] args) {
        ArrayMethod object = new ArrayMethod();
        object.getArrays();
        object.AddArray();
        object.displayArray();
    }
}