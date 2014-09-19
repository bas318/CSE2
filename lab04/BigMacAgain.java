//BA Sizemore
//CSE 002
//BigMacAgain java Program
//ask user how many big macs and whether or not they want fries
//print total cost
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class BigMacAgain {
    //main method required for every java program
    public static void main(String[] args) {
        
        
        //declare instance of scanner
        Scanner myScanner;
        //call the scanner contrcutor
        myScanner = new Scanner ( System.in );
        //prompt user for number of Big Macs
        System.out.print("Enter the number of Big Macs: "); //prompt user
        
            int numBigMacs;
            if(myScanner.hasNextInt()) {
                numBigMacs = myScanner.nextInt();
                if (numBigMacs<0) {  //check if number is less than 0
                    System.out.println("Your number must be greater than 0");
                    return;
                }
            }

            else{  //if neither above conditions are true
            System.out.println("You did not enter an int");  //show this
            return;  //leaves the program
        }
        //print total Big Mac Cost
        double totalBigMacCost = (numBigMacs*2.22);
        int BigMacs=(int)(totalBigMacCost*100);
        totalBigMacCost=BigMacs/100;
        System.out.println("You ordered " + numBigMacs + " Big Macs for a cost of " +
        numBigMacs + ("x") + ("$2.22 = $")+totalBigMacCost);
        
        System.out.print("Do you want an order of fries (Y/y/N/n)? ");  //prompt user
    
        String friesAnswer = myScanner.next();  //Take input for fries
            if (friesAnswer.equals("Y")||friesAnswer.equals("y")||friesAnswer.equals("N")||friesAnswer.equals("n")){ //check if y,Y,n,N
            }
            else {  // if not y,Y,n,N
                System.out.println("You must enter Y, y, N, or n");
                return;  //leave program
                }
                //if Y or y...
                if (friesAnswer.equals("Y")||friesAnswer.equals("y")){
                    System.out.println("You ordered fries at a cost of $2.15");
                    System.out.println("The total cost of the meal is $ " + (2.15+totalBigMacCost)); // Print out final cost
                }
                //if N or n...
                else if (friesAnswer.equals("N")||friesAnswer.equals("n")){  //check if n,N
                    System.out.println("The total cost of the meal is $ " + (totalBigMacCost)); // Print out final cost
                    }
  
        } //end of main method
    } //end of class
