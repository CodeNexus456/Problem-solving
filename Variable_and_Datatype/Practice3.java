package Variable_and_Datatype;

import java.util.*;

// Take two numbers and print their sum, difference, product, quotient, and remainder.
public class Practice3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number : ");
    int a = sc.nextInt();
    System.out.print("Enter first number : ");
    int b = sc.nextInt();
    System.out.println("Sum = " + (a + b));
    System.out.println("diffe = " + (a - b));
    System.out.println("multi = " + (a * b));
    System.out.println("quotient = " + (a % b));
    System.out.println("remainder = " + (a / b));
  }
}
