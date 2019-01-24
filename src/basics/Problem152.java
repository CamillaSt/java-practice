package basics;

import java.util.Scanner;

public class Problem152 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    System.out.print("Enter the third number: ");
    int c = sc.nextInt();
    System.out.print("Enter the fourth number: ");
    int d = sc.nextInt();
    test(a, b, c, d);

    sc.close();
  }

  public static void test(int a, int b, int c, int d) {
    if (a == b && a == c && a == d && b == c && b == d && c == d) {
      System.out.print("Equal");
    } else {
      System.out.print("Not equal");
    }
  }
}
