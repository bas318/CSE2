//BA Sizemore IV
//11-8-14
/*
1. Create an array that can hold 10 ints
2. Ask the user enter 10 ints and store them in the array
3. Search the array for the highest entry and print it out
4. Search the array for the lowest entry and print it out
5. Sum the ints in the array and print out the sum
6. Copy the contents of the array into a second array in reverse order 
7. Print the contents of the two arrays in two columns, side by side. 
8. Below is sample output that your program should resemble:
*/


//import scanner
import java.util.Scanner;
//define class
public class ArrayPractice {
    //main method
    public static void main(String[] arg) {
        //scanner
        Scanner scan;
        scan = new Scanner(System.in);
        int numEntries = 10;
        //create a new array
        int[] userInput;
        userInput = new int[numEntries];
        //prompt user
        System.out.print("Enter 10 ints- ");
        //take 10 ints from user and store them in the array
        userInput[0] = scan.nextInt();
        userInput[1] = scan.nextInt();
        userInput[2] = scan.nextInt();
        userInput[3] = scan.nextInt();
        userInput[4] = scan.nextInt();
        userInput[5] = scan.nextInt();
        userInput[6] = scan.nextInt();
        userInput[7] = scan.nextInt();
        userInput[8] = scan.nextInt();
        userInput[9] = scan.nextInt();
        //loop to find min
        int maxIndex = 0;
        int max = userInput[0];
        for (int i = 1; i < userInput.length; i++) {
            if (userInput[i] > max) {
                max = userInput[i];
                maxIndex = i;
            }
        }
        //loop to find max
        int minIndex;
        int min = userInput[0];
        for (int i = 1; i < userInput.length; i++) {
            if (userInput[i] < min) {
                min = userInput[i];
                minIndex = i;
            }
        }
        //sum of all components of the array
        int sum = userInput[0] + userInput[1] + userInput[2] + userInput[3] + userInput[4] + userInput[5] + userInput[6] + userInput[7] + userInput[8] + userInput[9];

        //print out the min max and sum
        System.out.println("The highest entry is: " + max);
        System.out.println("The lowest entry is: " + min);
        System.out.println("The sum is: " + sum);

        //loop to copy the array in reverse order
        int x = 9;
        int[] reverse = new int[userInput.length];
        for (int n = 0; n < userInput.length; n++) {
            reverse[n] = userInput[x];
            x--;
        }

        //loop to print the arrays in two columns
        for (int k = 0; k < userInput.length; k++) {
            System.out.println("  " + userInput[k] + "  " + reverse[k]);
        }


    }
}


