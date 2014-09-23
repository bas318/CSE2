//BA Sizemore
//CSE 002
//CourseNumber java Program
//
//Read six digit course number, then print out semester and year
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class CourseNumber {
    //main method required for every java program
    public static void main(String[] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        //call the scanner contrcutor
        myScanner = new Scanner ( System.in );
        //prompt user for course semester
        System.out.print("Enter a six digit number giving the course semester- ");
        
        int courseNumber;  //assign variable
        if(myScanner.hasNextInt()) {  //check to see if int
            courseNumber = myScanner.nextInt();  //if int, assign input to courseNumber
            if (courseNumber<186510 || courseNumber>201440) {  //check if number is in range
                System.out.println("The number was outside the range [186510,201440]");  //if not, print this
                return;  //leaves the program
            }
            //divide user input by 100
            double numberDecimal = (double)courseNumber/100;
            //convert to int to truncate to just the year
            int year = (int)numberDecimal;
            //subract year from decimal for course number
            double answer = numberDecimal - year;
            //round the answer to 2 places
            double semesterDecimal = (double) Math.round(answer * 100) / 100;
            //convert back to an int
            int semesterNumber = (int)((semesterDecimal * 100));
            //check to see if last two digits are 10, 20, 30, or 40.
            if (semesterNumber != 10 && semesterNumber != 20 && semesterNumber != 30 && semesterNumber != 40){
                System.out.println(semesterNumber + " is not a legitimate course number");
            }
            else if (semesterNumber == 10){
                System.out.println("The course was offered in the Spring semester of " + year);
            }
            else if (semesterNumber == 20){
                System.out.println("The course was offered in the Summer 1 semester of " + year);
            }
            else if (semesterNumber == 30){
                System.out.println("The course was offered in the Summer 2 semester of " + year);
            }
            else if (semesterNumber == 40){
                System.out.println("The course was offered in the Fall semester of " + year);
            }
        }
        else{  //if neither above conditions are true
        System.out.println("You did not enter a legitimate course number");  //show this
        return;  //leaves the program
        }
        
    } //end of main method
} //end of class