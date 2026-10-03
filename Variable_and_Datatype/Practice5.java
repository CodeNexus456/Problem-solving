package Variable_and_Datatype;

import java.util.*;
// Calculate the area and circumference of a circle using its radius.h

// 3.14 = Math.PI

public class Practice5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter radous of circle : ");
    double radius = sc.nextDouble();
    double Area = Math.PI * (radius * radius);
    double circumference = 2 * Math.PI * radius;

    System.out.println("Arra of circle is = " + Area);
    System.out.println("Circumference of circle is = " + circumference);

  }
}
