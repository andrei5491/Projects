import java.util.Scanner;

public class JavaApplication3 {

    
    public static void main(String[] args) {
       String a; 
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter a number: ");
    a= sc.nextLine();
    
    if(a.matches("[01]+")){
    System.out.println("it is binary");

}
    else if(a.matches("[0-7]+")) {
System.out.println ("it is octal");


}

else if (a.matches("[0-9A-F]+")){
    System.out.println ("it is hexa");
    }
else{
System.out.println("it is decimal");
}

}
}
