package basics;

import java.util.Scanner;
import java.io.File;

public class Problem45 {
  public static void main(String[] args) throws Exception {
    File file = new File("C:\\Users\\Camilla\\Desktop\\names.txt");
    Scanner sc =  new Scanner(file);
    System.out.print("This file contains following text: ");
    
    while (sc.hasNextLine()) {
       System.out.print(sc.nextLine() + " ");
    }

    sc.close();
    System.out.print("\nThe size of this file is: " + file.length() + " bytes");
  }
}