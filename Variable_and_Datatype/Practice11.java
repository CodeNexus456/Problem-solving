package Variable_and_Datatype;
import java.util.*;
// Take an integer and calculate the sum of its digits.
public class Practice11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter integer value : ");
    int num = sc.nextInt();

    num = Math.abs(num);
    int sum = 0;
    while (num > 0) {
      int digits = num % 10;
      sum = sum + digits;
      num = num / 10;
    }

    System.out.println("Sum of digits is = " + sum);
  }
}
