package basics;

import java.util.Scanner;

public class Problem153 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    double a = sc.nextDouble();
    System.out.print("Enter the second number: ");
    double b = sc.nextDouble();
    System.out.print(test(a, b));

    sc.close();    
  }

  public static boolean test(double a, double b) {
    if ((a >= 0 && a <= 1) && (b >= 0 && b <= 1)) {
      return true;
    } else {
      return false;
    }
  }
}
