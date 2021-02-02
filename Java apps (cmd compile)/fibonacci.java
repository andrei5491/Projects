class fibonacci {

	public static void main (String [] args) {
	
        int a=7;
	int d=2;
	int n=10;

	for (int i =0 ; i<=n; i++){
		System.out.println("Arithmetic/ geometric progression is "+a);
		a = a+d; //for geometric progresion use a=a*d 
	}

	c=5;
	d=6;
	f=10;
	for (int x = 0; x<=f; x++){
	System.out.println(c);
		int e = c+d;
		c=d;
		d=e;
		
}
}

class nestedLoop{

print:
1
12
123
1234
12345

	for (int i=1; i<=5; i++){
		for (j=1; j<=i ;j++){
			System.out.print (j + " ");
			
	}
	System.out.println(" ");
}
}

print :
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

	int count=1;
    	for (int i=1; i<=5; i++){
		for (int j=1; j<=i ;j++){
			System.out.print (count++ +" " );
	    
		    
		}   
	System.out.println(" ");
}

print:
1 2 3 4 5
1 2 3 4 
1 2 3 
1 2
1
		for (int i=1; i<=5; i++){
		for (int j=1; j<=5-i+1 ;j++){
			System.out.print (j +" " );
	    
		    
		}   
	
	System.out.println(" ");
}



