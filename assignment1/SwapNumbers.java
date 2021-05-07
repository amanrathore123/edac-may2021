
import java.util.*;
import java.lang.*;
public class SwapNumbers
{
 public static void main (String args[])
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any two number ");
    int num1= sc.nextInt();
    int num2= sc.nextInt();
    System.out.println("Before swap");
    System.out.println("Number1 :"+num1);
    System.out.println("Number2 :"+num2);
    num1=num1+num2; //num1=num1^num2; 
    num2=num1-num2; //num2=num1^num2;
    num1=num1-num2; //num1=num1^num2;
    System.out.println("After swap");
    System.out.println("Number1 :"+num1);
    System.out.println("Number2 :"+num2);
  }
}    
    
    
    
  
