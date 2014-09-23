//BA Sizemore
//CSE 002
//TimePadding java Program
//
//Have user give seconds passed during the day, then
//display in conventional form
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class TimePadding {
    //main method required for every java program
    public static void main(String[] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        //call the scanner contrcutor
        myScanner = new Scanner ( System.in );
        //prompt user for number of seconds
        System.out.print("Enter the time in seconds: ");  //prompt user
        
        int numSeconds;  //assign variable
        if(myScanner.hasNextInt()) {  //check to see if int
            numSeconds = myScanner.nextInt();  //if int, assign input to numSeconds
            if (numSeconds<1) {  //check if number is less than 0
                System.out.println("You did not enter a positive int");  //if < 0 print this
                return;  //leaves the program
            }
        }
        else{  //if neither above conditions are true
        System.out.println("You did not enter an int");  //show this
        return;  //leaves the program
        }
        
        int secondsPerMinute = 60;
        int minutesPerhour = 60;
        
        int numMinutes = numSeconds/secondsPerMinute;  //find number of minutes
        int seconds = numSeconds%secondsPerMinute;  //find how many seconds are left over
        int hours = numMinutes/minutesPerhour;  //find how many hours
        int minutes = numMinutes%minutesPerhour;  //find how many minutes are left over
        String paddedMinutes = String.format("%02d", minutes);  //pad the minutes with a zero if <10
        String paddedSeconds = String.format("%02d", seconds);  //pad the seconds
        
        //print result
        System.out.println("The time is " + hours + ":" + paddedMinutes  + ":" +paddedSeconds);
        
    } //end of main method
} //end of class