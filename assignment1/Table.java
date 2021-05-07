import java.lang.*;
import java.util.*;
public class Table
{ 
 public static void main(String args[])
 {
  System.out.println("Enter any number");
  Scanner sc = new Scanner(System.in);
  int num; //prod;
  num=sc.nextInt();
  for(int i=1;i<=10;i++)
  {
	  //prod=num*i;
  System.out.println(num+"*"+i+"="+num*i);
  }
}
} 