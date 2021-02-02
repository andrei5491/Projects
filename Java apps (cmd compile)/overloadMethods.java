class overloadMethods{

	static double area (double length, double breadth)
	{
		return length*breadth;
	}
	
	static double area (double radius)
	{
		return Math.PI*radius*radius;
	}
	
	
	
	
	
	
	
	static int reverse (int r)
	{
		int x= 0;
		while (n!=0)
		{
			x=x*10 + n%10;
			r=r/10;
		}
		return x;
	}
	
	int [] reverse (int A[])
	{
	int B[] = new int [A.length];
	
	for (int i = A.length, j=0 ; i>=0 ; i--, j ++)
	{
		B[j]=A[i];
		return B;
	}
	}
	
	
	
	
	static boolean validate (String name)
	{
		name.matches ("[a-zA-Z\\ss]*"); 
	}
	
	static boolean validate ( int age)
	{
		return age<=15 && age >= 3;
	}
	
	
	
	
	
	public static void main (String [] args)
	{
		
		
		
	}
	
	
	
}