//BA Sizemore
//CSE 002
//Month java Program
//
//Have user enter int of month, then display number of days in the month
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class Month {
    //main method required for every java program
    public static void main(String[] args) {
        
        //declare instance of scanner
        Scanner myScanner;
        //call the scanner contrcutor
        myScanner = new Scanner ( System.in );
        //prompt user for number of the month
        System.out.print("Enter an int giving the number of the month (1-12)- ");  //prompt for input
        
        int monthInt;  //assign variable
        if(myScanner.hasNextInt()) {  //check to see if int
            monthInt = myScanner.nextInt();  //if int, assign input to monthInt
            if (monthInt>=1 && monthInt<=12){  //check if number is less than 0
                if (monthInt == 1 || monthInt == 3 || monthInt == 5 || monthInt == 7 || monthInt == 8 || monthInt == 10 || monthInt == 12){ 
                    System.out.println("The month has 31 days");
                }
                else if (monthInt == 4 || monthInt == 6 || monthInt == 9 || monthInt == 11){
                    System.out.println("Your month has 30 days");
                }
                else if (monthInt == 2){
                    System.out.print("Enter an int giving the year -");  //prompt user
                    int intYear;  //assign variable
                    if(myScanner.hasNextInt()) {  //check to see if int
                    intYear = myScanner.nextInt();  //if int, assign input to intYear
                    
                        if (intYear<1) {  //check if number is less than 0
                            System.out.println("You did not enter a positive int");  //if < 0 print this
                            return;  //leaves the program
                        }    
                        else if (intYear%4 != 0){
                            System.out.println("Your month has 28 days");
                        }
                        else if (intYear%4 == 0){
                            System.out.println("Your month has 29 days");
                        }
                
                    }
                }
        else{  //if neither above conditions are true
        System.out.println("You did not enter a postitive int");  //show this
        return;  //leaves the program
        }
                    
        }
        else{  //if neither above conditions are true
        System.out.println("You did not enter and int between 1 and 12");  //show this
        return;  //leaves the program
        }
        }
        
    } //end of main method
} //end of class