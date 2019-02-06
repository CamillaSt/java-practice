package basics;

import java.util.Arrays;

public class ArrayExcercise {
  public static void main(String[] args) {
     int[] num = {1,2};
     int[] rum = {1,2,3};

     int[] c = sumOfArray(num, rum);
     if (c != null) {
      System.out.println(Arrays.toString(c));
     } else {
      System.out.println("Error, could't get the sum");
     }
  }

  public static int[] sumOfArray(int[] a, int[] b) {
    if (a.length == b.length) {
      int[] sums = new int[a.length];  
      for (int i = 0; i < a.length; i++) {
        sums[i] = a[i] + b[i];
      }
      return sums;
    } else {
      return null;
    }
  }
}