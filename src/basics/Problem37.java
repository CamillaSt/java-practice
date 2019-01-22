package basics;

import java.util.Scanner;

public class Problem37 {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word or a sentence: ");
    String name = sc.nextLine();
    System.out.print("The reveresed version of your input is: " + reverse(name));

    sc.close();
  }

  public static String reverse(String name) {
    StringBuilder reverseName = new StringBuilder(name);
    return reverseName.reverse().toString();
  }
}
