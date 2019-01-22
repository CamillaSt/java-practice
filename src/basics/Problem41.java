package basics;

import java.util.Scanner;

public class Problem41 {
  
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input a letter to see it's ascii value: ");
    char letter = sc.next(".").charAt(0);
    
    char character = letter;
    int ascii = (int) character;
    System.out.format("The ascii value of %c is: %d", letter, ascii);
  }
}