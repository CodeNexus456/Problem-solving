package Variable_and_Datatype;
import java.util.*;
// Reverse a given integer without converting it into a String.
public class Practice12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();

    int Reverse = 0;
    while (num != 0) {
      int digits = num % 10;
      Reverse = Reverse * 10 + digits;
      num = num / 10;
    }
    System.out.print("Reverse of a number is = " + Reverse);
  }
}
