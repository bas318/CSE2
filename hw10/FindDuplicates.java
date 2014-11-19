//B.A. Sizemore IV
//11-12-14 
//FindDuplicates java program
//check to see how many duplicates are in the list of entered ints
//
//import scanner
import java.util.Scanner;
//define class
public class FindDuplicates {
    //main method required for every java program
    public static void main(String[] arg) {
        //create new scanner
        Scanner scan = new Scanner(System.in);
        //declare and initialize the array num
        int num[] = new int[10];
        //initialize answer as a string
        String answer = "";
        //always do following
        do {
            //prompt user
            System.out.print("Enter 10 ints- ");
            //loop to take user input and store the 10 entered ints in the array num
            for (int j = 0; j < 10; j++) {
                num[j] = scan.nextInt();
            }
            //print "the array"
            String out = "The array ";
            //add the user input as an array to the string "The array"
            out += listArray(num); //return a string of the form "{2, 3, -9}"   
            if (hasDups(num)) {
                //if the array has duplicates, print has
                out += "has ";
            }
            //if the array does not have duplicates, print does not have
            else {
                out += "does not have ";
            }
            //print duplicates at the end of either "has " or "does not have "
            out += "duplicates.";
            System.out.println(out);
            //print out "The array"
            out = "The array ";
            out += listArray(num);
            //if the array has exactly one duplicate, print has
            if (exactlyOneDup(num)) {
                out += "has ";
            }
            //if the array doesn't have exactly one duplicate, print does not have
            else {
                out += "does not have ";
            }
            //print "exactly one duplicate."
            out += "exactly one duplicate.";
            System.out.println(out);
            //ask the user if they want to go again
            System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
            answer = scan.next();
            //if they enter Y or y, repeat the loop.  Otherwise exit the loop
        } while (answer.equals("Y") || answer.equals("y"));
    }

    //method to see if the user entered array has a duplicate
    public static boolean hasDups(int[] num) {
        //loops to move through different numbers in the array for comparison
        for (int i = 0; i < num.length; i++) {
            for (int k = 0; k < num.length; k++) {
                //return true if any of the numbers equal eachother, so long as they aren't the same number in the array
                if ((num[i] == num[k]) && (i != k)) {
                    return true;
                }
            }
        }
        //return false if the above condition is not true (there are no duplicates)
        return false;
    }//end of hasDups method

    //method to see if the user entered array has exactly one duplicate
    public static boolean exactlyOneDup(int[] num) {
        //initialize numDups to 0
        int numDups = 0;
        //loops to move through different numbers in the array for comparison
        for (int i = 0; i < num.length; i++) {
            for (int k = i; k < num.length; k++) {
                if ((num[i] == num[k]) && (i != k)) {
                    //every time a duplicate is found, increment numDups by 1.
                    numDups++;
                }
            }
        }
        //if numDups = 1, there is exactly one duplicate, so return true
        if (numDups == 1) {
            return true;
        }
        //return false if there isn't exactly one duplicate
        return false;
    }//end of exactlyOneDup method


    public static String listArray(int num[]) {
        String out = "{";
        for (int j = 0; j < num.length; j++) {
            if (j > 0) {
                //print a ", " if j > 0
                out += ", ";
            }
            //add the next number in the array to the string
            out += num[j];
        }
        //add a closing bracket
        out += "} ";
        //return the out string
        return out;
    } //end of listArray method
} //end of public class
