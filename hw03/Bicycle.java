//BA Sizemore IV
//CSE 002
//9-12-14
//Bicycle java program
//take seconds and counts from user, print distance traveled and avg. mph
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class Bicycle {
    //main method required for every java program
    public static void main(String[] args) {
        
        
        //declare instace of scanner object
        Scanner myScanner;
        //call the scanner constructor
        myScanner = new Scanner( System.in );
        //prompt user for number
        System.out.print (
            "Enter the number of seconds: ");
        //accept input from user
        int nSeconds = myScanner.nextInt();
         //promt user for number of counts
        System.out.print("Enter the number of counts: " );
        int nCounts = myScanner.nextInt();
        
        double wheelDiameter=27.0,  //diameter of wheel
        PI=3.14159,  //PI
        feetPerMile=5280,  //feet in a mile
        inchesPerfoot=12;  //inches in a foot
        int secondPerMinute=60;  //seconds in a minute
        double nMinutes = nSeconds/60;
        double nHours = (nMinutes/secondPerMinute);
        double distanceTrip;
        double avgMph;
        
        distanceTrip = nCounts*wheelDiameter*PI; //gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip/=inchesPerfoot*feetPerMile;  //converts distance in miles
        //rounding to two decimal places
        double roundDistTrip = (double) Math.round(distanceTrip*100)/100;
        //calculate average miles per hour
        avgMph = roundDistTrip/(nHours);
         double roundAvgMph = (double) Math.round(avgMph*100)/100;
        
        System.out.println("The distance was "+roundDistTrip+" miles and took "+nMinutes+" minutes.");
        System.out.println("The average mph was "+roundAvgMph);
        
    } //end of main method
} //end of class