package Week3_Assignments;

import java.util.Scanner;

class ArrayMethods {
    int array[] = new int[10];
    int array2[] = new int[10];
    int limit;

    public void getArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        limit = sc.nextInt();
        System.out.print("Enter array Elements: ");
        for (int i = 0; i < limit; i++)
            array[i] = sc.nextInt();
    }

    void MultArray() {
        for (int i = 0; i < limit; i++) {
            array2[i] = array[i] * array[i + 1];
        }
    }

    void displayArray() {
        for (int i = 0; i < limit - 1; i++)
            System.out.print(array2[i] + " ");
    }
}

public class W21ArrayMult {
    public static void main(String[] args) {
        ArrayMethods object = new ArrayMethods();
        object.getArrays();
        object.MultArray();
        object.displayArray();
    }
}