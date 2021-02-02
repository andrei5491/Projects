import java.lang.*;
import java.util.Scanner;

class Expression
{
	public static void main (String args[])
	{
		
	float base, height, area;
Scanner sc = new Scanner (System.in);
System.out.println("Enter base and height of the triangle: ");
	base=sc.nextFloat();
	height=sc.nextFloat();
	
	area=base*height/2;
	System.out.println ("Area of triangle is " + area);
}
		}