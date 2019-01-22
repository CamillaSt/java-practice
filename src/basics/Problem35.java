package basics;

import java.util.Scanner;

public class Problem35 {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the number of sides of the polygon: ");
    int sides = sc.nextInt();
    System.out.print("Input the length of on of the sides: ");
    double length = sc.nextDouble();
    System.out.format("The area of the polygon with %d sides is: %.2f", sides, area(sides, length));

    sc.close();
  }

  public static double area (int sides, double length) {
    return (sides * Math.pow(length, 2))/(4 * Math.tan(Math.PI / sides));
  }
}
