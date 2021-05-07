import java.util.*;
public class AreaOfCircle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius :");
		float radi,Area,peri;
		radi=sc.nextFloat();
		Area=(22*radi*radi)/7;
		peri=(2*22*radi)/7;
		System.out.println("Area :"+Area);
		System.out.println("Perimeter :"+peri);
	}
}	