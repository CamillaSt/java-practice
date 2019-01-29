package basics;

import java.util.Scanner;

public class Problem52 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = sc.nextInt();
    System.out.print("Enter the second number: ");
    int b = sc.nextInt();
    System.out.print("Enter the third number: ");
    int c = sc.nextInt();
    System.out.println("The result is: " + test(a, b, c));

    sc.close();
  }
  

  public static boolean test(int a, int b, int c){
    if ((a + b) == c || (b + c) == a || (c + a) == b) {
      return true;
    } else {
      return false;
    }
  }
 }
 