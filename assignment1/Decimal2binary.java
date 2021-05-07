import java.util.*;
public class Decimal2binary
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int count=0;
		System.out.println("Enter any number");
		int num=sc.nextInt();
		int arr[]=new int[20]; 
		//int arr[10];
		while(num!=0)
		{
			arr[count++]=num%2;
			num=num/2;
			
		}
		for(int i=count-1;i>=0;i--)
			System.out.print(arr[i]);
	}
}