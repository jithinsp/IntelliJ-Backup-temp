package Week3_Assignments;

import java.util.Scanner;

class ArrayMeth {
    int array[] = new int[10];
    int limit;
    public void getArrays() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        limit = sc.nextInt();
        System.out.print("Enter array Elements: ");
        for (int i = 0; i < limit; i++)
            array[i] = sc.nextInt();
    }

    void displayArray() {
        for (int i=0;i<limit;i++)
            System.out.print(array[i] + " ");
    }
}

public class W15Array {
    public static void main(String[] args) {
        ArrayMeth object = new ArrayMeth();
        object.getArrays();
        object.displayArray();
    }
}