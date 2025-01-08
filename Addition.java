import java.util.*;
import java.util.Scanner;
public class Addition{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the first Number");
   int x = sc.nextInt();
   System.out.print("Enter the Second Number");
   int y = sc.nextInt();
   int z = x+y;
   System.out.print("sum is :"  +z);   
  }
}
