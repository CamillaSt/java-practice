package basics;

public class Array {
  public static void main(String[] args) {
    int[] numbers = {1,2,3,4,5,6,7,8};
    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i] + " ");
    }

    String[] names = {"Anna", "Hanna", "Jenna", "Inna"};
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i] + " ");
    }
  }
}

