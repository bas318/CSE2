//BA Sizemore IV
//CSE 002
//9-11-14
//BigMac java program
//Display total cost of buying n Big Macs based on user input
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class BigMac {
    //main method required for every java program
    public static void main(String[] args) {
        //declare instace of scanner object
        Scanner myScanner;
        //call the scanner constructor
        myScanner = new Scanner( System.in );
        //prompt user for number
        System.out.print (
            "Enter the number of Big Macs (an integer > 0): ");
        //accept input from user
        int nBigMacs = myScanner.nextInt();
        
        //promt user for the cost Big Mac and %sales tax and accept input
        System.out.print("Enter the cost per Big Mac as"+
            " a double (in the form xx.xx) : " );
        double bigMac$ = myScanner.nextDouble();
        System.out.print(
            "Enter the percent tax as a whole number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100;  //user enters percent, but i want proportion
        
        //print the output now that all user input is recieved
        double cost$;
        int dollars;  //whole dollar amount of cost
        int dimes;
        int pennies; //for storing digits to the right of the decimal
                            //point for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate);
        //get the whole amount, dropping decimal fraction
        dollars=(int)cost$;
        //get dimes amount
        dimes=(int)(cost$*10)%100;
        //get pennies amount
        pennies=(int)(cost$*100)%10;
        System.out.println("The total cost of " +nBigMacs
        +" BigMacs, at $"+bigMac$ +" per bigMac, with a" +
        " sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+
        dimes+pennies);

    } //end of main method
} //end of class