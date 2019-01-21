package basics;

import java.util.Scanner;

public class Problem33 {
  private static double area(double sideLength) {
    return (6 * Math.pow(sideLength, 2))/(4 * Math.tan(Math.PI / 6));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Input the length of a side of the hexagon: ");
    double sideLength = sc.nextDouble();
    System.out.print("The area of the hexagon is: " + area(sideLength));

    sc.close();
  }
}