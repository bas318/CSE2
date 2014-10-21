//BA Sizemore
//CSE 002
//10-17-14
//force the user to enter an integer between 1 and 9, inclusive, and then print out displays that depend on the value entered
//
//import scanner
import java.util.Scanner;
//define class
public class NumberStack {
    //main method
    public static void main(String[] args) {
            //declare instance of scanner
            Scanner scan;
            //call the scanner constructor
            scan = new Scanner(System.in);
            //prompt user
            int number = 0;
            //prompt user
            System.out.print("Enter an int between 1 and 9- ");
            //check if user input is an integer
            if (scan.hasNextInt()) {
                int input = scan.nextInt();
                //check if user input is in the range 1-9
                if ((input >= 1) && (input <= 9)) {
                    //assign user's input to number
                    number = input;


                    //use for loops to display output
                    //outer loop controls other loops
                    for (int j = 0; j < number; j++) {
                        //loop for number of lines printed
                        for (int m = 0; m < j + 2; m++) {
                            //loop for number of spaces printed before numbers
                            for (int i = 0; i < number - j; i++) {
                                System.out.print(" ");
                            }
                            //loop for number of chars on a line printed
                            for (int k = 0; k < 2 * j + 1; k++) {
                                //print hyphens on last line of a number sequence
                                if (m == j + 1) {
                                    System.out.print("-");
                                }
                                //for every other line print the number (equal to j+1)
                                else {
                                    System.out.print(j + 1);
                                }
                            }
                            //go to a new line after loop runs
                            System.out.println();
                        }
                    }

                    //return same output as above using while loops instead of for loops
                    //set counter equal to 0
                    int j = 0;
                    //outside loop will run as long as the counter is less than the number entered by the user
                    while (j < number) {
                        int m = 0;
                        //loop for number of lines printed
                        while (m < j + 2) {
                            int i = 0;
                            //loop for spaces before the numbers start printing
                            while (i < number - j) {
                                System.out.print(" ");
                                i++;
                            }
                            int k = 0;
                            //loop for number of chars are printed on a line
                            while (k < 2 * j + 1) {
                                //for the last line of the number sequence print dashes
                                if (m == j + 1) {
                                    System.out.print("-");
                                }
                                //for the rest of the lines print the number equal to j + 1
                                else {
                                    System.out.print(j + 1);
                                }
                                //increment the counter k by 1
                                k++;
                            }
                            //start a new line of numbers/dashes
                            System.out.println();
                            //increment the counter m by one
                            m++;
                        }
                        // incrememnt the counter j by one
                        j++;
                    }


                    //return the same output again, this time using do-while loops
                    //reset counter j to 0
                    j = 0;
                    do {
                        int m = 0;
                        do {
                            int i = 0;
                            do {
                                //spaces before the numbers/dashes start to print
                                System.out.print(" ");
                                i++;
                            } while (i < number - j);
                            int k = 0;
                            do {
                                //print dashes for the last line of the number sequence, otherwise print the number (j+1)
                                if (m == j + 1) {
                                    System.out.print("-");
                                }
                                else {
                                    System.out.print(j + 1);
                                }
                                k++;
                            } while (k < 2 * j + 1);
                            System.out.println();

                            m++;
                        } while (m < j + 2);

                        j++;
                    } while (j < number);

                }
                //if the user input is not between 1 and 9 print this
                else {
                    System.out.println("You did not enter an int bewtween 1 and 9");
                }
            }
            //if the user input is not an int print this
            else {
                System.out.println("You did not enter an int between 1 and 9");
            }

        } //end of class
} //end of main method
