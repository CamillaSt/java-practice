package basics;

public class ArrayAvg {
  public static void main(String[] args) {
    int[] numbers = {7,6,9,30};
    System.out.println("The avarage is: " + avarage(numbers));
  }

  public static double avarage(int[] numbers) {
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {
      sum += numbers[i];
    }
    return sum / numbers.length;
  }
}
