public class Ques9
{
    
    public static void main(String[] args) 
    {
         int n=5,k;
		 char ch;
		for(int i=1;i<=n;i++) //rows
		{
			for(int j=n-i;j>=1;j--) //spaces
			{
			 System.out.print(" ");	 
			}
			for( k=1,ch='A';k<=i;k++,ch++)  //stars
			{
            System.out.print(ch+" ");			
		    }
			System.out.println("");
		}
		
	}
}
