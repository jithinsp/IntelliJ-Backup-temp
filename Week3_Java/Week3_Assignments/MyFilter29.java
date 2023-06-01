package Week3_Assignments;

import java.util.function.*;

public class MyFilter29 {
  public static int myFilter(int[] myArray, IntPredicate callback) {
    int sum = 0;
    for (int num : myArray) {
      if (callback.test(num)) {
        sum += num;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] myArray = {1, 2, 3, 4, 5};
    int sumOfEvenNumbers = myFilter(myArray, num -> (num % 2 == 0));
    int sumOfOddNumbers = myFilter(myArray, num -> (num % 2 != 0));
    System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    System.out.println("Sum of odd numbers: " + sumOfOddNumbers);
  }
}
