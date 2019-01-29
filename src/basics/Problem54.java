package basics;

import java.util.Scanner;

public class Problem54 {
  public static void main(String[] args) {
    System.out.println("I'm thinking of a number between 0 and 10");
    System.out.println("Your job is to guess that number");   
    long randomNumber = Math.round(Math.random() * 10);
    boolean win = false;
    Scanner sc = new Scanner(System.in);

    while (!win) {
      System.out.print("Enter the number: ");
      int guess = sc.nextInt();
      if (guess == randomNumber) {
        win = true;
      } else if (guess > randomNumber) {
        System.out.println("The secret number is lower");
      } else if (guess < randomNumber) {
        System.out.println("The secret number is higher");
      }
    }
    System.out.print("You win!");
    sc.close();
  }
}
