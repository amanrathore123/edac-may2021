import java.util.*; //for Scanner class
import java.lang.*; //for System class
public class Arithmatic 
{
public static void main(String args[])
{ 
//java program to find sum of two numbers

  System.out.println(74+36); 



//java program to find divide of two numbers

  System.out.println(50/3);  



//java program to perform following operations

  System.out.println(-5+8*6); 
  System.out.println((55+9)%9);
  System.out.println(20+ -3*5/8);
  System.out.println(5+15/3*2-8%3);


//java program that takes two arguments and display its product

  System.out.println("Enter any two numbers");
  Scanner s = new Scanner(System.in);
  int num1,num2,product;
  num1=s.nextInt();
  num2=s.nextInt();
  product=num1*num2;
  System.out.println("product is :"+product);



//java program that takes two arguments and display its product,addition,division,subtraction and remainder

  System.out.println("Enter any two numbers");
  //Scanner s = new Scanner(System.in);
  int multiply,sum,div,mod,subs; //num1,num2;
  num1=s.nextInt();
  num2=s.nextInt();
  sum=num1+num2;
  multiply=num1*num2;
  subs=num1-num2;
  
  System.out.println("Sum is :"+sum);
  System.out.println("Product is :"+multiply);
  System.out.println("Substraction is :"+subs);
  if(num2!=0)
  {
   div=num1/num2;
   System.out.println("Division is :"+div);
   mod=num1%num2;
   System.out.println("Remainder is :"+mod);
  }
  else
  System.out.println("Cannot apply modulus and division as inputted number is zero");
  
}
}