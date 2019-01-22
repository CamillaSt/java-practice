package basics;

import java.util.Scanner;

public class Problem37 {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word or a setnence:");
    String name = sc.nextLine();
    System.out.print("The reveresed version of your input is: ");
    reverse(name);

    sc.close();
  }

  public static void reverse (String name) {
    
    StringBuilder reverseName = new StringBuilder();
    reverseName.append(name);
    reverseName = reverseName.reverse();
    System.out.print(reverseName);
  }
}