package basics;

import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Hello " + name + "!");

    sc.close();
  }
}
