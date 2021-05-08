public class Ques6
{
    
    public static void main(String[] args) 
    {
        char ch;
		int j;
		for(int i=0;i<5;i++)
		{
			for(j=0;j<5;j++)
			{
			 if((i+j)<4)
			 System.out.print("  ");	 
		     else
		     System.out.print(" *");
			}
			
			System.out.println("");
		}
		
	}
}
