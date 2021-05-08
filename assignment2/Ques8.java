public class Ques8
{
    
    public static void main(String[] args) 
    {
         int n=5;
		for(int i=0;i<n;i++) //rows
		{
			for(int j=n-i;j>1;j--) //spaces
			{
			 System.out.print(" ");	 
			}
			for(int k=0,l=5-i;k<=i;k++,l++)  //stars
			{
            System.out.print(l+" ");			
		    }
			System.out.println("");
		}
		
	}
}
