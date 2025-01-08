import java.util.*;
public class VolumeofCylinder{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Radius :");
   float radius = sc.nextFloat();
   System.out.print("Enter the Height :");
   float Height = sc.nextFloat();
   int Volume =(int) (3.14f*radius*radius*Height);
   System.out.print("Volume of Cylinder is :"+Volume);

  }
}
