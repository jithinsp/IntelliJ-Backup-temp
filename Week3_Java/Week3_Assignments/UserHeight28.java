package Week3_Assignments;

import java.util.Scanner;

public class UserHeight28 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double userHeight;
    System.out.print("Enter height: ");
    try {
      userHeight = Double.parseDouble(input.nextLine());
      if (Double.isNaN(userHeight)) {
        throw new NotANumberError();
      } else if (userHeight > 200) {
        throw new HugeHeightError();
      } else if (userHeight < 40) {
        throw new TinyHeightError();
      } else {
        System.out.println("valid");
      }
    } catch (NumberFormatException e) {
      throw new NotANumberError();
    }
  }

  static class NotANumberError extends Error {
    public NotANumberError() {
      super("notANumberError");
    }
  }

  static class HugeHeightError extends Error {
    public HugeHeightError() {
      super("hugeHeightError");
    }
  }

  static class TinyHeightError extends Error {
    public TinyHeightError() {
      super("tinyHeightError");
    }
  }
}
