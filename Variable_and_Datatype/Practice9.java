package Variable_and_Datatype;

import java.util.*;

// Convert a given number of days into years, weeks, and remaining days.
public class Practice9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of days : ");
    int days = sc.nextInt();

    int years = (days / 365);
    int remaindays = (days % 365);
    int week = (remaindays / 7);
    int leftdays = (remaindays % 7);

    System.out.println("Years = " + years);
    System.out.println("Weeks =" + week);
    System.out.println("remaining days = " + remaindays);
    System.out.println("Days Left = " + leftdays);

    sc.close();
  }

}
