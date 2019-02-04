package basics;

public class ArrayIndex {
  public static void main(String[] args) {
    int[] numbers = {100,90,40,60,20};
    int search = 40;
    System.out.println(findIndex(numbers, search));
  }

  public static int findIndex(int[] numbers, int search) {
    for (int i = 0; i < numbers.length; i++) {
      if (search == numbers[i]) {
        return i;
      }
    }
    
    return -1;
  }
}
