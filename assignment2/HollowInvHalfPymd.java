public class HollowInvHalfPymd
{
    
    public static void main(String[] args) 
    {
        for (int i=6;i>=1;i--)
		{
			 if(i==6 || i==1)
		      {
			  for(int j=1;j<=i;j++)
		      System.out.print("* ");
		      }
		     else
		      {
		       for (int j=1;j<=i;j++)
			   {
                  if(j==1 ||j==i)
                   System.out.print("* ");
                  else
					System.out.print("  ");  
			   }
              
			  }
			  System.out.println("");
		}
		
		
	}
}
