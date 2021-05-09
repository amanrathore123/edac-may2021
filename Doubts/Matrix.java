import java.util.Scanner;
class Calculation
{
	public int[][] A=new int[2][3];
	public int[][] B=new int[3][4];
	public int[][] C= new int[3][3];
	void getData()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements of first array");
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				A[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter elements of second array");
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<B[0].length;j++)
			{
				B[i][j]=sc.nextInt();
			}
		}
		
	}
	void matrixMultiplication()
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<4;j++)
			{
				 C[i][j]=0;
				for(int k=0;k<3;k++)
				{
			      C[i][j]+=A[i][k]*B[k][j];
				}
			}
		}
	}
	void printMatrix(int[][] D)
	{
		for(int x[]:D)
		{
			for(int y:x)
		    {
			System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	

}
			
public class Matrix
{
	public static void main(String agrs[])
     {
		 Calculation obj =new Calculation();
         obj.getData();
         obj.matrixMultiplication();
         obj.printMatrix(obj.A);
         obj.printMatrix(obj.B);
         obj.printMatrix(obj.C);
}
}