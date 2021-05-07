/* import.java.lang.*
public class Test
{
 public static void main (String args[])
  {
    //scanner sc = new scanner(system.in);
    System.out.println("first no :"+ args[0]);
    System.out.println("second no :"+ args[1]);
    int a=args[0];
    int b=args[1];
    int c= a+b;
    System.out.println("sum :"+ c);
  }
}
*/


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
    num1=num1+num2;
    num2=num1-num2;
    num1=num1-num2;
    System.out.println("After swap");
    System.out.println("Number1 :"+num1);
    System.out.println("Number2 :"+num2);
  }
}    
    
    
    
    
  }
}
