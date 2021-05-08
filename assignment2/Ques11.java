public class Ques11
{
    
    public static void main(String[] args) 
    {
         int n=5;
		for(int i=0;i<n;i++) //rows
		{
			for(int j=n-i;j > 1;j--) //spaces
			{
			 System.out.print(" ");	 
			}
			for(int k=0;k<=i*2;k++)  //stars
			{
            System.out.print("*");			
		    }
			System.out.println("");
		}
		
	}
}
