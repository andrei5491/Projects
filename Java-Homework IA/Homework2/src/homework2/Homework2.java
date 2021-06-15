package homework2;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Andrei
 */
public class Homework2 {

    public static void main(String[] args) {
        //exercise1();
        Random r = new Random();
        int zar = r.nextInt(6);
        //divisibleChecker();
        //divisibleCheckerInSwitch();// generate a random number and print if is divisible with 2,3 or 5 
        //printNumbersWithLoops(); //print all numbers from 1 to 10 using for loop, while loop and do/ while loop. Add instructions for loops to skip the values of 5;
        //arithmeticProgression( 2, 5, 100); //generate a arithmetic progression. Use byte variable. What happend if you increase ratio(difference between numbers)?
        //arrayNumberFinder(5); //Create an array with random numbers and find a specific one by printing his first position in the array. After that, print each appears and times. 
        //insertANumberInArray(7, 9669); // Delete and insert a number into an array and copy existing elements in another. 
        //generateAndVerify(); //generate 100 000 random number from 0 to 30. Print number of duplicate for each number.
        //matrixAdding(); //Add 2 matrix.
        //generateRandomMatrix(); //Generate 2 random matrixes (elements and dimensions) and check if arrays have same rows and columns. Add them if both are matrix.
        //bubbleSort(); //Implement bubble sort on characters
        //arrayOddAndEven(10); Create an array with n random numbers. Print how many are odd and how many are even and then create 2 arrays with them. 
    }

    public static int randomNumber(int min, int max) {
        int nr = (int) (Math.random() * (max + 1 - min)) + min;
        return nr;
    }

    public static void exercise1() {
        int[] ex1 = new int[10];
        for (int i = 0; i < ex1.length; i++) {
            ex1[i] = randomNumber(1, 10);
        }
        for (int y : ex1) {
            System.out.println(y);
        }
        System.out.println(" ");

        for (int i = 0; i < ex1.length; i++) {
            for (int j = i + 1; j < ex1.length; j++) {
                if (i != j && ex1[i] == ex1[j]) //count ++;
                {
                    System.out.println("sunt la " + ex1[j]);
                }
            }
        }

    }

    public static void divisibleChecker() {
        int x = (int) (Math.random() * 1001);
        System.out.println(x);
        if (x % 2 == 0) {
            System.out.println("Number " + x + " is divisible with 2");
        }
        if (x % 3 == 0) {
            System.out.println("Number " + x + " is divisible with 3");
        }
        if (x % 5 == 0) {
            System.out.println("Number " + x + " is divisible with 5");
        } else {
            System.out.println("Number " + x + " is not divisible with 2 , 3 or 5");
        }
    }

    public static void divisibleCheckerInSwitch() {
        int nr = (int) (Math.random() * 1001);
        switch (nr % 2) {
            case 0:
                switch (nr % 3) {
                    case 0:
                        System.out.println("Its divisible with 3!");
                        break;
                    default:
                        System.out.println("Nothing from 3");
                }
                switch (nr % 2) {
                    case 0:
                        System.out.println("Its divisible with 2!");
                        break;
                    default:
                        System.out.println("Nothing from 2");
                }
                switch (nr % 5) {
                    case 0:
                        System.out.println("Its divisible with 5!");
                        break;
                    default:
                        System.out.println("Nothing from 5");

                }
            default:
                System.out.println("The number is not divisible with 2, 3 or 5");
        }
    }

    public static void throwDice() {

        /* switch (zar) {
            case 1: System.out.println("First dice is ONE \nDice 1: " + zar);
            break;
             case 2: System.out.println("First dice is TWO \nDice 1: " + zar);
            break;
             case 3: System.out.println("First dice is THREE \nDice 1: " + zar);
            break;
             case 4: System.out.println("First dice is FOUR \nDice 1: " + zar);
            break;
             case 5: System.out.println("First dice is FIVE \nDice 1: " + zar);
            break;
             case 0: System.out.println("First dice is SIX \nDice 1: " + zar+6);
            break;
             default:
                 System.out.println("Error");
        }
         */
        if (zar == 1) {
            System.out.println("First dice is ONE \nDice 1: " + zar);
        } else if (zar == 2) {
            System.out.println("First dice is TWO \nDice 1: " + zar);
        } else if (zar == 3) {
            System.out.println("First dice is THREE \nDice 1: " + zar);
        } else if (zar == 4) {
            System.out.println("First dice is FOUR \nDice 1: " + zar);
        } else if (zar == 5) {
            System.out.println("First dice is FIVE \nDice 1: " + zar);
        } else if (zar == 0) {
            System.out.println("First dice is SIX \nDice 1: " + zar + 6);
        }

        int zar2 = r.nextInt(6);

        /* switch (zar2) {
            case 1: System.out.println("Second dice is ONE \nDice 2: " + zar2);
            break;
             case 2: System.out.println("Second dice is TWO \nDice 2: " + zar2);
            break;
             case 3: System.out.println("Second dice is THREE \nDice 2: " + zar2);
            break;
             case 4: System.out.println("Second dice is FOUR \nDice 2: " + zar2);
            break;
             case 5: System.out.println("Second dice is FIVE \nDice 2: " + zar2);
            break;
             case 0: System.out.println("Second dice is SIX \nDice 2: " + zar2+6);
            break;
             default:
                 System.out.println("Error");
        }
         */
        if (zar2 == 1) {
            System.out.println("First dice is ONE \nDice 2: " + zar2);
        } else if (zar2 == 2) {
            System.out.println("First dice is TWO \nDice 2: " + zar2);
        } else if (zar2 == 3) {
            System.out.println("First dice is THREE \nDice 2: " + zar2);
        } else if (zar2 == 4) {
            System.out.println("First dice is FOUR \nDice 2: " + zar2);
        } else if (zar2 == 5) {
            System.out.println("First dice is FIVE \nDice 2: " + zar2);
        } else if (zar2 == 0) {
            System.out.println("First dice is SIX \nDice 2: " + zar2 + 6);
        }

        if (zar == zar2) {
            System.out.println("Congrats, it's double!");
        }
        if (zar - zar2 == 2 || zar - zar2 == -2) {
            System.out.println("Congrats, it's 'poarta-n casa'");
        }

    }

    public static void printNumbersWithLoops() {
        System.out.print("From for loop: ");
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.print(i + ", ");
        }
        System.out.print("\nFrom while loop: ");
        int j = 1;
        while (j <= 10) {
            if (j == 5) {
                j++;
                continue;
            }
            System.out.print(j + ", ");
            j++;

        }
        System.out.print("\nFrom do/while loop: ");
        int k = 1;
        do {
            if (k == 5) {
                k++;
                continue;
            }
            System.out.print(k + ", ");

            k++;

        } while (k <= 10);
    }

    public static void arithmeticProgression(int start, int dif, int n) {

        int prog = start;
        System.out.print("Arithmetic progression is: ");
        for (int i = 1; i <= n; i++) {
            System.out.print((byte) prog + " ");
            prog = prog + dif;

        }
        //result will oscillates between 127 and (-128)
    }

    public static void arrayNumberFinder(int findNr) {

        int array[] = new int[10];

        System.out.println("");
        System.out.print("Your array is : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = randomNumber(1, 10);
            System.out.print(array[i] + " , ");
        }
        int count = 0;
        System.out.println("");
        for (int j = 0; j < array.length; j++) {
            if (array[j] == findNr) {
                System.out.println("Position of the " + findNr + " in array is: " + (1 + j));
                count++;
            }

        }
        System.out.println("Number " + findNr + " appear " + count + " times in array");

    }

    public static void insertANumberInArray(int replaceNr, int replaceWith) {
        int[] A = {1, 6, 4, 7, 12, 6, 9, 11};
        System.out.print("Your array is ");
        for (int y : A) {
            System.out.print(y + " , ");
        }
        int[] B = new int[A.length];
        System.out.println("");
        System.out.print("Your array after replace " + replaceNr + " with " + replaceWith + " is :");
        for (int i = 0; i < A.length; i++) {
            if (A[i] == replaceNr) {
                B[i] = replaceWith;
                continue;
            }
            B[i] = A[i];

        }
        for (int x : B) {
            System.out.print(x + " , ");
        }

    }

    public static void generateAndVerify() {
        int[] A = new int[20];
        for (int i = 0; i < A.length; i++) {
            A[i] = randomNumber(0, 30);
        }

        Arrays.sort(A);
        System.out.println("");
        for (int y : A) {
            System.out.print(y + " ,");
        }
        System.out.println("");
        int count = 0;

        for (int i = 0; i < A.length; i++) {

            for (int j = 0; j < A.length; j++) {
                if (A[i] == A[j]) {
                    count++;
                }
            }

            //if (A[i]!=A[i+1])
            System.out.println("Number " + A[i] + " apear in array for " + count + " times ");
            count = 0;
        }
    }

    public static void matrixAdding() {
        int A[][] = {{3, 6, 9}, {2, 4, 6}, {5, 3, 2}};
        int B[][] = {{2, 3, 2}, {5, 4, 8}, {4, 7, 8}};

        int C[][] = new int[3][3];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        for (int x[] : C) {
            for (int y : x) {
                System.out.print(y + " ");

            }
            System.out.println("");
        }

    }

    public static void generateRandomMatrix() {
        int a = randomNumber(2, 4);
        int b = randomNumber(2, 4);
        int x = randomNumber(2, 4);
        int y = randomNumber(2, 4);
        int A[][] = new int[a][b];
        int B[][] = new int[x][y];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = randomNumber(1, 10);
            }
        }
        System.out.println("First array is:\n");
        for (int z[] : A) {
            for (int g : z) {
                System.out.print(g + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                B[i][j] = randomNumber(1, 10);
            }
        }
        System.out.println("\nSecond array is:\n");
        for (int z[] : B) {
            for (int g : z) {
                System.out.print(g + " ");
            }
            System.out.println("");
        }
        System.out.println("");
        if (A.length == B.length && A[0].length == B[0].length) {
            System.out.println("Arrays ARE matrix\nSum of them is : \n");
            int C[][] = new int[A.length][A[0].length];

            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    C[i][j] = A[i][j] + B[i][j];
                }
            }

            for (int q[] : C) {
                for (int w : q) {
                    System.out.print(w + " ");

                }
                System.out.println("");
            }

        } else {
            System.out.println("Arrays ARE NOT matrix");
        }
    }

    public static void bubbleSort() {
        char arr[] = {'Z', 'H', 'Y', 'A', 'F', 'G'};
        int n = arr.length;
        char temp = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (char x : arr) {
            System.out.print(x + " ");
        }

    }

    public static void arrayOddAndEven(int length) {
        int A[] = new int[length];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < A.length; i++) {
            A[i] = randomNumber(1, 10);
            if (A[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }

        }
        System.out.println("Your array with random numbers is : ");
        for (int x : A) {
            System.out.print(x + " , ");
        }
        System.out.println("");
        System.out.println("There are " + even + " even numbers in array");
        System.out.println("There are " + odd + " odd  numbers in array");

        int[] arrOdd = new int[odd];

        for (int i = 0; i < arrOdd.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 1) {
                    arrOdd[i] = A[j];
                    i++;

                }

            }

        }
        System.out.println("Odd array is :");
        for (int o : arrOdd) {
            System.out.print(o + ", ");
        }

        int[] arrEven = new int[even];
        for (int i = 0; i < arrEven.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[j] % 2 == 0) {
                    arrEven[i] = A[j];
                    i++;

                }

            }

        }

        System.out.println("\nEven array is :");
        for (int o : arrEven) {
            System.out.print(o + ", ");
        }

    }
}
