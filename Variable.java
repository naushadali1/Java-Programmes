import java.util.Scanner;

import java.util.*;

public class Variable {
  public static void main(String[] args) {
    System.out.println("Enter first number");
    var sc = new Scanner(System.in); // create sc object of class Scanner which use for input

    int num1 = sc.nextInt(); // num1 is first variable that take input integer value from user
    System.out.println("Enter SEcond number");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.println(sum);
  }
}
