public class Ques12
{
    
    public static void main(String[] args) 
    {
         int n=5;
		for(int i=1;i<=n;i++) //rows
		{
			for(int j=n-i;j >= 1;j--) //spaces
			{
			 System.out.print(" ");	 
			}
			for(int k=1;k<=i;k++)  //stars
			{
            System.out.print(i+" ");			
		    }
			System.out.println("");
		}
		
	}
}
