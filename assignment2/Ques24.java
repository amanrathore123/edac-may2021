public class Ques24
{
    
    public static void main(String[] args) 
    {
		int n=4;
        for(int i=0;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
            }
			for(int j=0;j<=(2*i);j++)
            {
             System.out.print("*");				
			}
			System.out.println("");
		}
		
		
		
		n=5;
		for(int i=1,k=5;i<=n;i++,k--)
		{
			for(int j=n-1;j>(n-1)-i;j--)
			{
				System.out.print(" ");
            }
			for(int j=2*k;j>1;j--)
            {
             System.out.print("*");				
			}
			System.out.println(" ");
		}
	}
}
