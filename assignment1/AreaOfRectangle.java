import java.util.*;
public class AreaOfRectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		float len,width,Area,peri;
		System.out.println("Enter Length:");
		len=sc.nextFloat();
		System.out.println("Enter Width:");
	    width=sc.nextFloat();
		Area=len*width;
		peri=2*(len+width);
		System.out.println("Area :"+Area);
		System.out.println("Perimeter :"+peri);
	}
}	