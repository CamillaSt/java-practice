package basics;

import java.util.Scanner;

public class Problem38 {

  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a word/sentence to calculate the amount of characters in it: ");
    String input = sc.nextLine();
    count(input);

    sc.close();
  }

  public static void count(String input) {
    int letters = 0;
    int spaces = 0;
    int numbers = 0;

    for (char c:  input.toCharArray()) {
      if (Character.isDigit(c)) {
        numbers ++;
      } else if (Character.isLetter(c)) {
        letters ++;
      } else if (Character.isWhitespace(c)) {
        spaces++;
      }
    }

    System.out.println("The amount of numbers is: " + numbers);
    System.out.println("The amount of letters is: " + letters);
    System.out.println("The amount of spaces is: " + spaces);
  }
}
