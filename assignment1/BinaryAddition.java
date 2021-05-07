import java.util.*;
class BinaryAddition
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int num1,num2,count,carry;
		count=0;
	    carry=0;
		System.out.println("Enter 1'st binary no :");
		num1=sc.nextInt();
		System.out.println("Enter 1'st binary no :");
		num2=sc.nextInt();
		int Arr1[] = new int[20];
		int Arr2[] = new int[20];
		int Arr3[] = new int[40];
		while(num1!=0 && num2!=0)
		{
			Arr1[count]=num1%10;
			Arr2[count]=num2%10;
			count++;
			num1=num1/10;
			num2=num2/10;
		}

		for(int i=0;i<=count;i++)
		{
			Arr3[i]=Arr1[i]+Arr2[i]+carry;
			if(Arr3[i]==2)
			{
				Arr3[i]=0;
				carry=1;
			}
			else 
			{
				if(Arr3[i]==3)
			    {
				  Arr3[i]=1;
				  carry=1;
			    }
			    else
				carry=0;
			}
		}
		
		for(int i=count;i>=0;i--)
		System.out.print(Arr3[i]);
		}
	}
	