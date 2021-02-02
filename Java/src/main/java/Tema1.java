import java.util.Scanner;

public class Tema1<i> {
   
//Calculate the sum of the first 100 numbers higher than 0
 public static void main(String[] args) {
        int u = 100;
        int s = u * (u + 1) / 2;
        System.out.println(s);
    }   
    


//Display the smallest number from an array of number (2 versions)
public static void main(String[] args) {
        int temp, size;
        int array[] = {5, 3, 21, 15, 13, 62};   //aici am facut cu arrays.sort, nu am reusit cu foreach
        size = array.length;
        Arrays.sort(array);
        System.out.println(array[0]);
    }   

    public static void main(String[] args) {
        int temp, size;
        int array[] = {5, 3, 21, 15, 13, 62};
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println(array[0]);
    }  


//Display the max digit from a number.
    public static void main(String[] args) {
        int n = 734108;
        int max = 0;

        while (n != 0) {
            if (n % 10 > max)
                max = n % 10;
            n = n / 10;
        }
        System.out.println(max);
    }   




//Check if a number is palindrom( e.g palindrom 1221, 34143)
    public static void main(String[] args) {

        int cn, un, ogl = 0;
        int n = 34430;
        cn = n;
        while (n > 0) {
            un = n % 10;
            ogl = (ogl * 10) + un;
            n = n / 10;
        }
        if (cn == ogl)
            System.out.println(cn + " este palindrom");
        else
            System.out.println(cn + " nu este palindrom");
    }  


//Display all the prime numbers lower than a given number
    public static void main(String[] args) {
        int n = 13;
        printPrime(n);
    }   


    static void printPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
    } 

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;


        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }  



//Implement a calculator and use only if-else instead of switch.
    public static void main(String[] args) {

        Scanner primul = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        double primulnr = primul.nextDouble();
        System.out.println(primulnr);


        Scanner aldoilea = new Scanner(System.in);
        System.out.println("Introduceti al doilea numar: ");
        double aldoileanr = aldoilea.nextDouble();
        System.out.println(aldoileanr);

        Scanner operator = new Scanner(System.in);
        System.out.println("Introduceti un operator: ");
        String operatorul = operator.next();


        if (operatorul.equals("*")) {

            System.out.println(primulnr * aldoileanr);
        }
        else if (operatorul.equals("/")) {

            System.out.println(primulnr / aldoileanr);
        }
        else if (operatorul.equals("+")) {
            System.out.println (primulnr+ aldoileanr);

        }
        else if (operatorul.equals("-")){
            System.out.println (primulnr-aldoileanr);
        }
        else
            System.out.println("Verificati input-ul!");

    }   


//Calculate and display the factorial of a given number n. (ex: 4! = 1*2*3*4)
    public static void main(String[] args) {
    int i,factorial=1;
    Scanner numar = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
    int n = numar.nextInt();


    	  for(i=1;i<=n;i++){
        factorial=factorial*i;
    }
    	  System.out.println("factorial de " + n + " este " + factorial);
}



//Write a Java program to remove the duplicate elements of a given array and return the new length of the array.
//Sample array: [20, 20, 30, 40, 50, 50, 50]
//After removing the duplicate elements the program should return 4 as the new length of the array.    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("Introduceti numarul elementelor din array: ");

        int n=s.nextInt();

        int arr[]=new int[n];

        System.out.println("Introduceti elementele array-ului: ");

        for(int a=0;a<n;a++){//for reading array
            arr[a]=s.nextInt();
        }

        int e = arr.length;

        e = removeDuplicates(arr, e);


        for (int i=0; i<e; i++)
            System.out.print(arr[i]+" ");
    }   



    static int removeDuplicates(int arr[], int e) {
        if (e == 0 || e == 1)
            return e;


        int j = 0;


        for (int i = 0; i < e-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];

        arr[j++] = arr[e-1];

        return j;
    }











