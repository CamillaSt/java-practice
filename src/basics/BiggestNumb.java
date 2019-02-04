package basics;

public class BiggestNumb {
  public static void main(String[] args) {
    int[] num = {25,30,55,97,75,78};
    System.out.print(findMax(num));
  }

  public static int findMax(int[] num) { 
    int max = num[0];
    for (int i = 1; i < num.length; i++) {
      if (num[i] > max) {
        max = num[i];
      }
    }
    return max;
  }
}
