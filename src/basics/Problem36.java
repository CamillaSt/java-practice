package basics;

import java.util.Scanner;

public class Problem36 {
    public static void main(String []args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the latitude of the first coordinate:");
      double lat1 = sc.nextDouble();
      System.out.print("Enter the longitude of the first coordinate:");
      double lon1 = sc.nextDouble();
      System.out.print("\n" + "Enter the latitude of the second coordinate:");
      double lat2 = sc.nextDouble();
      System.out.print("Enter the longitude of the second coordinate:");
      double lon2 = sc.nextDouble();
      System.out.print("The distance between those points is: " + distance(lat1, lon1, lat2, lon2) + " kilometers");

      sc.close();
    }
    
    public static double distance(double lat1, double lon1, double lat2, double lon2) {
      lat1 = Math.toRadians(lat1);
      lon1 = Math.toRadians(lon1);
      lat2 = Math.toRadians(lat2);
      lon2 = Math.toRadians(lon2);

      double earthRadius = 6371.01;
      return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    }
}