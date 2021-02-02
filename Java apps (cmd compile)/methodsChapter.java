
public class methodsChapter{
	
	public static void main(String[] args) {
		
	   //System.out.println(isPrime(7));
		//System.out.println(gcd(25,10));
		int A[]= {5,10,15,4,3,22,4};
		System.out.println(maxArrNumber(A));
	}
	
	static boolean isPrime(int p)
	{
	    
	    for (int i = 2; i <= p/2; i++)
	    {
	        
	   
	        if (p%i==0)
	            return false;
	        
	    }
	        return true;
	    }

    static int gcd (int m, int n)
	{
		while (m!=n)
		{
			if (m>n) m= m-n;
			else n=n-m;
		}
		return m;
    }

	static int maxArrNumber (int A[])
	{
		int max=0;
		for (int i = 0 ; i< A.length; i++)
		{
			if (A[i] > max) max=A[i];
		}	
		return max;
	}














}


	