import java.util.*;
import java.util.Scanner;
public class TemperatureConversion{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Temperature in Celsius");
   double Celsius = sc.nextDouble();
   double Fahrenheit = (Celsius*9/5)+32;
   System.out.print(Celsius+"C is equal to"+Fahrenheit+"f");

  }
}
