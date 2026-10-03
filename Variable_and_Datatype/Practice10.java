package Variable_and_Datatype;
import java.util.*;

import javax.swing.plaf.synth.SynthTreeUI;
// Calculate the simple interest using principal, rate, and time.
public class Practice10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of Principle : ");
    double p = sc.nextDouble();
    System.out.print("Enter value of Principle : ");
    double r = sc.nextDouble();
    System.out.print("Enter value of Principle : ");
    double t = sc.nextDouble();

    double SI = (p * r * t) / 100;
    System.out.println("Simple interest is = " + SI);

  }
}
