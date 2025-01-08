import java.util.*;
public class KilotoMile{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Kilometer :");
   double kilo = sc.nextDouble();
   double miles = kilo*0.621371;
         System.out.print("The result is :"+miles);
  }
}
