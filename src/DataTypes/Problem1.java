package DataTypes;

import java.util.Scanner;

public class Problem1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature in fahrenheit: ");
    double fahrenheit = sc.nextDouble();
    double celsius = (fahrenheit - 32.0) * (5.0 / 9.0);
    System.out.format("The temperature in celsius is: %.2f celsius", celsius);

    sc.close(); 
  }
}
