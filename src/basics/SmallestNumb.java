package basics;

public class SmallestNumb {
  public static void main(String[] args) {
    int[] num = {100,2,98,33,62,29};
    System.out.print(findMin(num));
  }
  
  public static int findMin(int[] num) {
    int min = num[0];
    for (int i = 1; i < num.length; i++) {
      if (num[i] < min) {
        min = num[i]; 
      }
    }
    return min;
  }
}

