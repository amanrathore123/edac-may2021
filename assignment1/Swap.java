import java.util.*;
public class Swap
{
	public static void main(String args[])
	{
		int num1,num2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two no :");
		num1=sc.nextInt();
		num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("values after swapping :");
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
	}
}