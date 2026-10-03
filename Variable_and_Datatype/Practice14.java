package Variable_and_Datatype;

import java.util.*;

// Count the number of digits in a given integer.
public class Practice14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter num : ");
    int num = sc.nextInt();

    int count = 0;

    // while(num != 0) {
    // // int digits = num % 10;
    // num = num / 10;
    // count++;
    // }
    // System.out.println(count);

    if (num == 0) {
      count = 1;
    } else {
      while (num > 0) {
        num = num / 10;
        count++;
      }
    }
    System.out.println("Number of digits is = " + count);
  }
}
