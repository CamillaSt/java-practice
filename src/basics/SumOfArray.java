package basics;

public class SumOfArray {
  public static void main(String[] args) {
    int sum = 0;
    int[] numbers = {4,5,9,16,20};
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    System.out.print("The sum is: " + sum);
  }
}
