import java.util.*;
import java.util.Scanner;
public class AreaofCircle{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Radius");
   float radius = sc.nextFloat();
   int  Area =(int) (3.14f*radius*radius);
   System.out.print(Area);

  }
}
