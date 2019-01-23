package basics;

import java.util.Scanner;

public class Problem49 {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int input = sc.nextInt();

    sc.close();

    if (input % 2 == 0) {
        System.out.print("The number is even");
    }else {
        System.out.print("The number is odd");
    }
  }
}
