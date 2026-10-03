package Variable_and_Datatype;
// Swap two numbers without using a third variable.
public class Practice8 {
  public static void main(String[] args) {
    int a = 20;
    int b = 10;
    System.out.println("before swapping...");
    System.out.println(a);
    System.out.println(b);

    a = a + b;
    b = a - b;
    a = a - b;
    System.out.println("After swapping...");
    System.out.println(a);
    System.out.println(b);

  }
}
