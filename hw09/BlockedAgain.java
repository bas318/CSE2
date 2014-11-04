//BA Sizemore IV
//11-1-14
//Blocked Again Java Program
//Print a pattern of blocks based on user's input that is verified to be an int
//and in the range (1,9)
//
//import scanner
import java.util.Scanner;
//define class
public class BlockedAgain {
    //main method required for every java program
    public static void main(String[] s) {
            int m;
            //force user to enter int in range 1-9, inclusive.
            m = getInt();
            allBlocks(m);
        }
        //method to check and return user input
    public static int getInt() {
            //declare instance of scanner
            Scanner scan1;
            //call the scanner contructor
            scan1 = new Scanner(System.in);
            //prompt user
            System.out.print("Enter an int between 1 and 9, inclusive: ");
            //initialize x to a default value
            int x = 0;
            //check to see if input was an integer and between 1 and 9
            if (checkInt(scan1) == true) {
                x = scan1.nextInt();
                if (checkRange(x) == true) {
                    //if input is an int between 1 and 9, return the number
                    return x;
                }
            }
            //if x either wasn't an integer or wasn't between 1 and 9, reprompt user and start over
            return getInt();

        }
        //method to see if user input is an int
    public static boolean checkInt(Scanner scan1) {
            if (scan1.hasNextInt())
            //return value true if input is an int
                return true;
            //if input is not an int, alert the user and return false
            else {
                System.out.println("You did not enter an int");
                return false;
            }
        }
        //method to check if the user input is in the range (1,9)
    public static boolean checkRange(int number) {
            //return true if input is in the range (1,9)
            if ((number >= 1) && (number <= 9)) {
                return true;
            }
            //if input is not in (1,9), alert the user and return false
            else {
                System.out.println("You did not enter an int in range [1,9]");
                return false;
            }
        }
    //method to print out the pattern of blocks based on user input
    public static void allBlocks(int m) {
        //call method block, which creates the pattern of blocks
        block(m);
    }

    //method that creates the pattern of blocks
    public static void block(int m) {
            for (int j = 0; j < m; j++) {
                //loop for number of lines printed
                for (int t = 0; t < j + 2; t++) {
                    //call line() to print spaces
                    line(m, j);
                    //loop for number of chars on a line printed
                    for (int k = 0; k < 2 * j + 1; k++) {
                        //print hyphens on last line of a number sequence
                        if (t == j + 1) {
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
        }
    //method to print the appropriate amount of spaces
    public static void line(int m, int j) {
        for (int i = 0; i < m - j; i++) {
            //keep printing one space so long as m-j > i
            System.out.print(" ");
        }
    }

} //end of public class
