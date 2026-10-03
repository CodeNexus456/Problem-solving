package Variable_and_Datatype;
import java.util.*;
// Check whether a given integer is a palindrome number.
public class Practice13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number : ");
    int num = sc.nextInt();

    int Reverse = 0;
    int originalNum = num;
    while (num != 0) {
      int digits = num % 10;
      Reverse = Reverse * 10 + digits;
      num = num / 10;
    }

     System.out.println(Reverse);
      if(originalNum == Reverse) {
        System.out.println("Number is Palindrome");
      } else {
        System.out.println("Num is not palindrome");
      }
  }
}
