class test{

public static void main (String[] args ){
 
String str ="://anysiteblabla.gov";

        switch (str.substring(str.lastIndexOf('.'+1)))
        {
            case "gov":
                System.out.println("it is governamental");
                break;
            case "com":
                System.out.println("commercial");
                break;
            case "net":
                System.out.println("network");
                break;
            default:
                System.out.println("nothing, try again");
        }

    }
}

Why is printing the default case? ("nothing, try again")