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
    test(a,b,c);

    sc.close();
  }

  public static void test(int a, int b, int c){
    if (a + b == c) {
      System.out.println("The result is: True");
    } else {
      System.out.println("The result is : False");
    }
  }
 }
