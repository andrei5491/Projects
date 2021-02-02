function calculate(){
	 var a = document.getElementById("inputA").value;
	 var b = document.getElementById("inputB").value;
	 var c = document.getElementById("inputC").value;

	 var x = parseInt(a);
	 var y = parseInt(b);
	 var z = parseInt(c);

	 if (isNaN(x) == true || isNaN(y) == true || isNaN(z) == true) {
	 	alert ("Introduceti doar cifre!")	
	 	}
	 else
	 	alert (((x*y) + (y*z)) / (x+y))
}
//calculate()
function maxnumber(){
	var a = document.getElementById("binputA").value;
	var b = document.getElementById("binputB").value;
	var c = document.getElementById("binputC").value;
		if (a==""&&b==""&& c=="") {
		alert ("Introduceti cel putin o cifra!")
								}
				
	var x = parseInt(a);
	var y = parseInt(b);
	var z = parseInt(c);

	 
	 if(x>=y && x>=z)
		{
			alert(x);
		}
		else if(y>=x && y>=z)
		{
			alert(y);
		}
		else if(z>=x && z>=y)
		{
			alert(z);
		}
		else if (isNaN(z) == true && x>=y){   
	 	alert (x);
	 	}
	 	else if (isNaN(y)==true && x>=z){
	 		alert (x);
	 	}
	 	else if (isNaN(x)==true && y>=z) {
	 		alert (y);
	 	}
	 	else if (isNaN(z) == true && y>=x){   
	 	alert (y);
	 	}
	 	else if (isNaN(y) == true && z>=x){   
	 	alert (z);
	 	}
	 	else if (isNaN(x)==true && z>=y) {
	 		alert (z);
	 	}
	 	else if (isNaN(x)==true && isNaN(y)==true) {
	 		alert (z)
	 	}
	 	else if (isNaN(x)==true && isNaN(z)==true){
	 		alert (y)
	 	}
	 	else if (isNaN(y)==true && isNaN(z)==true){
	 		alert (x)
	 	}
	 	
	 	
	 }
	 	
function SumNumbers(){
	 var m = parseInt(document.getElementById("inputM").value);
     var n = parseInt(document.getElementById("inputN").value);
     var s = 0 ;
     var i;
    	if(n<m){
        i = n;
        while(i<=m){
            if(i%2==0) 
            s=s+i;
            i=i+1;
        }
        alert(s);
    }
    	else if(n>m) {
        i=m;
        while(i<=n){
            if(i%2==0)
            s=s+i;
            i=i+1;
        }
        alert(s);
    }
    else if (n==m){
    	alert ("Introduceti doua numere diferite!")
    }
    else if (isNaN(n)==true || isNaN(m)==true){
    	alert ("Folositi doar cifre!")
    }
}

