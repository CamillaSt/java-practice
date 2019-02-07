package basics;

public class CheckArray {
  public static void main(String[] args) {
    int[] numbers = {2,0,3,9,8};
    System.out.println(check(numbers));
  }

  public static boolean check(int[] n) {
    for (int i = 0; i < n.length; i++) {
      if (n[i] == 0 || n[i] == -1) {
        System.out.println("Yes, this array does contain a 0 or -1 value");
        return true;
      }
    }
    System.out.println("No, this array does not contain 0 or -1");
    return false;
  }
}







