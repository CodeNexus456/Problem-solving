package Variable_and_Datatype;
import java.util.*;
// Find the first digit and last digit of a given number.
public class Practice15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();

    int firstDigits = num;
    int lastDigits = num % 10;

    while (firstDigits > 10) {
      firstDigits = firstDigits / 10;
    }

    System.out.println("First Digit is = " + firstDigits);
    System.out.print("Last Digit is = " + lastDigits);
  }
}
