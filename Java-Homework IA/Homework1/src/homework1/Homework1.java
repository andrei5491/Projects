package homework1;

/**
 *
 * @author Andrei
 */
public class Homework1 {

    public static void main(String[] args) {
        // randomNumber(); //Create a program to generate and print a number (0-100) using Math.random()
        // randomNumberMinMax(7, 15); //Generate a random number between minimum and maximum. Make sure your min is grater than max and both are positive!
        // retireCalculator(65);   //Implements a program that calculates the age until retirement. We consider that the retirement age is 65.
        // numberComparator(); //Generate 2 random numbers. Print both and a message showing which number is greater. The higher number will be displayed first
        // findHypotenuse(); //Generate random numbers for legs of a right triangle. Find hypotenuse using Math.sqrt()
        // divisibleChecker(); //Generate a random number and print if it's divisible with 2, 3 or 5.
        // switchTrafficLight();   //Create a program that randomly displays the color of the traffic light(red, green, yellow)
        // identicOrConsecutive(); //Create a program that generate numbers with 2 digits. Print a message if number has identic digits (ex: 66) or consecutive digits (ex: 45 or 54)
           cnpGenerator(); // Generate a CNP number so that:  First digits show the sex of the person (1 and 5- masculine, 2 and 6 - feminine). The Second and third digits indicate year of birth. The fourth and fifth digits indicate the mounth of birth. 
                            // The sixth and seventh digits indicates the day of birth and the last 6 digits will be randomly generate. Will be displayed the sex of the person, if he/she was borned in a leap year and the season of birth (spring, summer, autumn, winter) 
    }

    public static void cnpGenerator() {
        int genre = (int) (Math.random() * 4);
        String sGenre = "";
        if (genre == 0) {
            sGenre = "6";
        }
        if (genre == 1) {
            sGenre = "5";
        }
        if (genre == 2) {
            sGenre = "2";
        }
        if (genre == 3) {
            sGenre = "1";
        }
        System.out.println("Genre number is " + sGenre);

        int year = (int) (Math.random() * 100);
        String sYear = "";
        if (year == 0) {
            sYear = "00";
        } else if (year == 1) {
            sYear = "01";
        } else if (year == 2) {
            sYear = "02";
        } else if (year == 3) {
            sYear = "03";
        } else if (year == 4) {
            sYear = "04";
        } else if (year == 5) {
            sYear = "05";
        } else if (year == 6) {
            sYear = "06";
        } else if (year == 7) {
            sYear = "07";
        } else if (year == 8) {
            sYear = "08";
        } else if (year == 9) {
            sYear = "09";
        } else {
            sYear = sYear.valueOf(year);
        }
        System.out.println("Year is " + sYear);

        int mounth = (int) (Math.random() * (13 - 1)) + 1;
        String sMounth = "";
        if (mounth == 1) {
            sMounth = "01";
        } else if (mounth == 1) {
            sMounth = "01";
        } else if (mounth == 2) {
            sMounth = "02";
        } else if (mounth == 3) {
            sMounth = "03";
        } else if (mounth == 4) {
            sMounth = "04";
        } else if (mounth == 5) {
            sMounth = "05";
        } else if (mounth == 6) {
            sMounth = "06";
        } else if (mounth == 7) {
            sMounth = "07";
        } else if (mounth == 8) {
            sMounth = "08";
        } else if (mounth == 9) {
            sMounth = "09";
        } else {
            sMounth = sMounth.valueOf(mounth);
        }
        System.out.println("Mounth is " + sMounth);

        int dayb = (int) (Math.random() * (29 - 1)) + 1;
        String sDay = "";
        if (dayb == 1) {
            sDay = "01";
        } else if (dayb == 2) {
            sDay = "02";
        } else if (dayb == 3) {
            sDay = "03";
        } else if (dayb == 4) {
            sDay = "04";
        } else if (dayb == 5) {
            sDay = "05";
        } else if (dayb == 6) {
            sDay = "06";
        } else if (dayb == 7) {
            sDay = "07";
        } else if (dayb == 8) {
            sDay = "08";
        } else if (dayb == 9) {
            sDay = "09";
        } else {
            sDay = sDay.valueOf(dayb);
        }
        System.out.println("Day of birth is " + sDay);

        int lastDigits = (int) (Math.random() * (1000000 - 100000)) + 100000;
        System.out.println("Last 6 Digits are:  " + lastDigits);

        System.out.println("Your generate CNP is: " + sGenre + sYear + sMounth + sDay + lastDigits);
        if (sGenre.equals("1") || sGenre.equals("5")) {
            System.out.println("The Genre is: Masculine");
        }
        if (sGenre.equals("2") || sGenre.equals("6")) {
            System.out.println("The Genre is: Feminine");
        }

        int intYear = Integer.parseInt(sYear);

        if (intYear > 21) {
            sYear = "19" + sYear.valueOf(intYear);
        } else if (intYear == 0) {
            sYear = "20" + "00";
        } else if (intYear == 1) {
            sYear = "20" + "01";
        } else if (intYear == 2) {
            sYear = "20" + "02";
        } else if (intYear == 3) {
            sYear = "20" + "03";
        } else if (intYear == 4) {
            sYear = "20" + "04";
        } else if (intYear == 5) {
            sYear = "20" + "05";
        } else if (intYear == 6) {
            sYear = "20" + "06";
        } else if (intYear == 7) {
            sYear = "20" + "07";
        } else if (intYear == 8) {
            sYear = "20" + "08";
        } else if (intYear == 9) {
            sYear = "20" + "09";
        } else {
            sYear = "20" + sYear.valueOf(intYear);
        }

        int leapYear = Integer.parseInt(sYear);
        if (leapYear % 4 == 0 && leapYear % 100 != 0 && leapYear % 400 == 0) {
            System.out.println("The person is born in a leap year");
        } else {
            System.out.println("The person isn't born in a leap year");
        }

        if (sMounth.equals("03") || sMounth.equals("04") || sMounth.equals("05")) {
            System.out.println("The person were borned in spring");
        } else if (sMounth.equals("06") || sMounth.equals("07") || sMounth.equals("08")) {
            System.out.println("The person were borned in summer");
        } else if (sMounth.equals("09") || sMounth.equals("10") || sMounth.equals("11")) {
            System.out.println("The person were borned in autumn");
        } else {
            System.out.println("The person were borned in winter");
        }

    }

    public static void divisibleChecker() {
        int aNumber = (int) (Math.random() * 101);
        if (aNumber % 2 == 0) {
            System.out.println(aNumber + " is divisible with 2");
        }
        if (aNumber % 3 == 0) {
            System.out.println(aNumber + " is divisible with 3");
        }
        if (aNumber % 5 == 0) {
            System.out.println(aNumber + " is divisible with 3");
        } else {
            System.out.println(aNumber + " isn't divisible with 2/3/5");
        }
    }

    public static void findHypotenuse() {
        int sideOne = (int) (Math.random() * 101);
        int sideTwo = (int) (Math.random() * 101);
        System.out.println("First side of triangle has " + sideOne + " cm and second has " + sideTwo + " cm. The hypotenuse has " + (int) Math.sqrt((sideOne * sideOne) + (sideTwo * sideTwo)) + " cm");
    }

    public static void numberComparator() {
        int first = (int) (Math.random() * 101);
        int second = (int) (Math.random() * 101);
        System.out.println("First number generate is " + first + " and second is " + second);
        System.out.println("Number " + Math.max(first, second) + " is grather than " + Math.min(first, second));
    }

    public static void randomNumber() {
        int d = (int) (Math.random() * 101);
        System.out.println("A random number from 0-100 is: " + d);
    }

    public static void retireCalculator(int age) {
        if (age >= 65) {
            System.out.println("Age is valide for retirement!");
        } else {
            System.out.println("Age is not valide for retirement! You have " + (65 - age) + " years left!");
        }
    }

    public static void randomNumberMinMax(int min, int max) {
        if (min < max && min >= 0 && max >= 0) {
            int nr = (int) (Math.random() * (max - min)) + min;
            System.out.println("Congrats, numbers are valide! A random number between them is: " + nr);
        } else {
            System.out.println("Make sure your min is grater than max and both are positive!");
        }
    }

    public static void switchTrafficLight() {
        int lightnr = (int) (Math.random() * 3);
        if (lightnr == 0) {
            System.out.println("TrafficLight is now green");
        } else if (lightnr == 1) {
            System.out.println("TrafficLight is now yellow");
        } else {
            System.out.println("TrafficLight is now red");
        }
    }

    public static void identicOrConsecutive() {
        int min = 10;
        int max = 100;
        int nr = (int) (Math.random() * (max - min)) + min;
        int firstdigit = nr / 10;
        int secdigit = nr % 10;
        System.out.println("The number generate is: " + nr);
        if (firstdigit == secdigit) {
            System.out.println("First digit of number is same with second digit");
        }
        if (++firstdigit == secdigit || firstdigit - 2 == secdigit) {
            System.out.println("The digits of the number are consecutive");
        }
    }
}
