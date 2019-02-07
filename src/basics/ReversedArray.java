package basics;

public class ReversedArray {
  public static void main(String[] args) {
    int[] numbers = {2,4,6,7,8,9};
    System.out.println("Original array: ");
    for (int i = 0; i <numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    
    System.out.println("Reversed array");
    for (int i = numbers.length - 1; i >= 0; i--) {
      System.out.println(numbers[i]);
    }
  } 
}






