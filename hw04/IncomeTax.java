//BA Sizemore
//CSE 002
//Income Tax java Program
//
//Have user give thousands of dollars of income, then print tax
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class IncomeTax {
    //main method required for every java program
    public static void main(String[] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        //call the scanner contrcutor
        myScanner = new Scanner ( System.in );
        //prompt user for number of thousands of dollars
        System.out.print("Enter an int giving the number of thousands: "); //prompt user
        
        int numThousands;  //assign variable
            if(myScanner.hasNextInt()) {  //check to see if int
                numThousands = myScanner.nextInt();  //if int, assign input to numThousands
                if (numThousands<1) {  //check if number is less than 0
                    System.out.println("You did not enter a positive int");  //if < 0 print this
                    return;  //leaves the program
                }
            }
            else{  //if neither above conditions are true
            System.out.println("You did not enter an int");  //show this
            return;  //leaves the program
            }
        
        int income = numThousands*1000;
        
        if (numThousands<20) {
            int taxInt = (int)((income*.05)*100);
            double tax = taxInt/100.0;
            System.out.println("The tax rate on $" + income + " is " + "5.0%, and the tax is $" + tax);
        }
        else if (numThousands>=20 && numThousands<40) {
            int taxInt = (int)((income*.07)*100);
            double tax = taxInt/100.0;
            System.out.println("The tax rate on $" + income + " is " + "7.0%, and the tax is $" + tax);
        }
        else if (numThousands>=40 && numThousands<78) {
            int taxInt = (int)((income*.12)*100);
            double tax = taxInt/100.0;
            System.out.println("The tax rate on $" + income + " is " + "12.0%, and the tax is $" + tax);
        }
        else if (numThousands>=78) {
            int taxInt = (int)((income*.14)*100);
            double tax = taxInt/100.0;
            System.out.println("The tax rate on $" + income + " is " + "14.0%, and the tax is $" + tax);
        }
        
        
    } //end of main method
} //end of class
