public class HollowHalfPymd
{
    
    public static void main(String[] args) 
    {
        for (int i=1;i<=6;i++)
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
