public class Ques13
{
    
    public static void main(String[] args) 
    {
         int n=5,k;
		 char ch;
		for(int i=0;i<n;i++) //rows
		{
			for(int j=n-i;j > 1;j--) //spaces
			{
			 System.out.print(" ");	 
			}
			for( k=0,ch=(char)(65+i);k<=i;k++)  //stars
			{
            System.out.print(ch+" ");			
		    }
			System.out.println("");
		}
		
	}
}
