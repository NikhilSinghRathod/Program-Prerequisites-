import java.util.*;
public class SimpleInterest{
  public static void main(String[]args){
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter the Principal :");
   float principal = sc.nextFloat();
   System.out.print("Enter the Time :");
   float Time = sc.nextFloat();
   System.out.print("Enter the Rate:");
   float Rate = sc.nextFloat();
   int SimpleInterest =(int) (principal*Rate*Time)/100;
   System.out.print("Simple Interest is :"+SimpleInterest);

  }
}
