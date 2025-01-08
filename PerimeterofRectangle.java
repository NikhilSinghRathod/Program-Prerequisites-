import java.util.*;
import java.util.Scanner;
public class PerimeterofRectangle{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the lenghth:");
   double Length = sc.nextDouble();
   System.out.print("Enter the Width :");
   double Width = sc.nextDouble();
   double Perimeter =(float)2*(Length+Width);
   System.out.print("Perimeter of Rectangle  is :"+Perimeter);

  }
}
