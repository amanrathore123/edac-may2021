public class Pyramid1
{
    
    public static void main(String[] args) 
    {
         int n=9,a=1;
		for(int i=0;i<n;i++) //rows
		{
			for(int j=n-i;j > 1;j--) //spaces
			{
			 System.out.print(" ");	 
			}
			for(int k=0;k<=i;k++)  //stars
			{
            System.out.print(a+" ");			
		    }
			System.out.println("");
			a++;
		}
		
	}
}
