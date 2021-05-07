import java.util.*;
public class Average
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);
   int num1,num2,num3;
   float avg;
   System.out.println("enter any 3 numbers");
   num1=sc.nextInt();
   num2=sc.nextInt();
   num3=sc.nextInt();
   avg=(float)(num1+num2+num3)/3;
   System.out.println("Average :"+avg);
 }
}