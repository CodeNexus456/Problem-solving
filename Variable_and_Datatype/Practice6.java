package Variable_and_Datatype;
import java.util.*;
// Take the length and breadth of a rectangle and calculate its area and perimeter.
public class Practice6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter length of rectangle : ");
    double l = sc.nextDouble();
    System.out.print("Enter length of rectangle : ");
    double b = sc.nextDouble();

    double area = l * b;
    double perimiter = 2 * (l +  b);
    System.out.println("Area of rectangle is = " + area);
    System.out.println("Perimeter of rectengle is = " + perimiter);
  }
}
