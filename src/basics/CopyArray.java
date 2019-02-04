package basics;

import java.util.Arrays;

public class CopyArray {
  public static void main(String[] args) {
    String[] names = {"Anna", "Hanna", "Sanna", "Jenna"};
    String[] copy = new String[names.length];
    System.out.println("Original array: " + Arrays.toString(names));

    for (int i = 0; i < names.length; i++) {
      copy[i] = names[i];
    }
    System.out.println("Copy of array: " + Arrays.toString(copy));
  }
}
