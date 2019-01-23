package basics;

import java.util.Scanner;
import java.io.Console;

public class Problem42 {
  
  public static void main(String []args) {
    Console con = System.console();

    System.out.print("Enter your password: ");
    char[] password = con.readPassword();

    String psw = String.valueOf(password);
    System.out.print("Password is: " + psw);
  }
}
