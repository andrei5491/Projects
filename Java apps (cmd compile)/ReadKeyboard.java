import java.util.*;


public class ReadKeyboard
{
	public static void main (String arg[])
	{
	
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Hi there, what is your name?");
	String x= sc.nextLine();
		
	System.out.println("Hello " + x + ", thank you because your are here!");
	System.out.println("Type a decimal number to convert in normal number");
	sc.useRadix(2);
	int y = sc.nextInt();
	System.out.println(y);	


	}
}
		
