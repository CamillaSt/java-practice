package basics;

import java.util.Scanner;
import java.io.Console;

public class Problem42 {
  
  public static void main(String []args) {
    //creating a reference to the Console class
    Console con = System.console();

    System.out.print("Enter your password: ");
    //saving the input as a Char in char array
    char[] password = con.readPassword();
    
    //converting char array to String
    String psw = String.valueOf(password);
    System.out.print("Password is: " + psw);
  }
}
