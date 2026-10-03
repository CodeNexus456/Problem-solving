package Variable_and_Datatype;
import java.util.*;

// Convert temperature from Celsius to Fahrenheit.
// °C = (°F - 32) × 5/9
public class Practice4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temprature : ");
    int Fahrenheit = sc.nextInt();

    int celcius = (Fahrenheit - 32) * 5 / 9;
    System.out.println(celcius);

  }
}
