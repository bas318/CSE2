//BA Sizemore IV
//CSE 002
//9-12-14
//FourDigits java program
//print out the first four digits to the right of the decimal in
//a double entered by the user
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class FourDigits {
    //main method required for every java program
    public static void main(String[] args) {
        
        //declare instace of scanner object
        Scanner myScanner;
        //call the scanner constructor
        myScanner = new Scanner( System.in );
        //prompt user for number
        System.out.print (
            "Enter a double and I display the four digits to the right of the decimal point- ");
        //accept input from user
        double userDouble = myScanner.nextDouble();
        
        //multiply user double by 10,0000
        double noDecDouble = userDouble*10000;
        //cast double to int
        int firstInt = (int) noDecDouble;
        //take last four digits from int
        int lastFourDigits = firstInt % 10000;
        //cast last four digits to String. This allows 00s to be displayed
        String finalAnswer = String.format("%04d", lastFourDigits);
        //print result
        System.out.println("The four digits are "+finalAnswer);
        
    } //end of main method
} //end of class