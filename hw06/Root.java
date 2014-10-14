//BA Sizemore IV
//CSE 002
//10-10-14
//Root java program
//Find square root of a user inputted number
//import scanner before it can be used
import java.util.Scanner;
//define class
public class Root {
    //main method required for every java program
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner (System.in);
        //prompt user for number
        double x = 0.0;
        System.out.print("Enter a number- ");
        //take user input
        double i = scan.nextDouble();
            //make sure i > 0, if so set i to x
            if (i>0.0) {
                x=i;
            }
            else {
                System.out.println("You must enter a positive number");
                return;
            }
            
        double low = 0.0;
        double high = 1 + x;
        double middle = 0;
        
        while ((high - low) > (0.0000001*(x + 1))) {
            middle = (((high - low)/2)+low);
            //if the square of the middle value is greater than x, set high to middle squared
            if (middle*middle > x) {
                high = middle;
            }
            //if middle squared is less than x, set low equal to middle squared
            else if (middle*middle < x) {
                low = middle;
            }
        }
        
        
        System.out.println("The sqaure root is approximately " + middle);
                
        
    }  // end of main method
} //end of class