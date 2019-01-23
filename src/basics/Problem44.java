package basics;

import java.util.Scanner;

public class Problem44 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");  
    int input = sc.nextInt();
    System.out.printf("%d + %d%d + %d%d%d\n", input, input, input, input, input, input);

    sc.close();
  }
}

