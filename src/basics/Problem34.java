package basics;

import java.util.Scanner;

public class Problem34 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    boolean exit = false;
    while (!exit) {
      System.out.print("Input a number: ");
      int num = sc.nextInt();
      
      int sum = 0;
      while (num > 0) {
        sum += num % 10;
        num /= 10;
      }

      System.out.println("The sum of digits is: " + sum);
      System.out.println("Do you want to make a new calculation?");
      System.out.println("Yes/No");
      sc.nextLine();
      String answer = sc.nextLine();
      if (answer.equalsIgnoreCase("no")) {
        exit = true;
      }
    }

    sc.close();
  }
}
