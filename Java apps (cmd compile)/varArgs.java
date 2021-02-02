class varArgs{
	
	//calculate maximum of numbers using varargs
	//calculate sum of all elements using varargs

 static int max(int ...A)
    {
        if(A.length==0)return Integer.MIN_VALUE;
        int max=A[0];
        for(int i=1;i<A.length;i++)
            if(A[i]>max)max=A[i];
        
        return max;
        
    }
    
    static int sum(int ...A)
    {
		
        int s=0;
        for(int i=0;i<A.length;i++)
            s+=A[i];
        
        return s;
    }
	
	public static void main (String [] args){
		
		System.out.println(max(5,10,2,3));
		System.out.println (sum(1,2,3,4,5));
		
		
		
		
	}
}