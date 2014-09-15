//BA Sizemore IV
//CSE 002
//9-12-14
//Root Java Program
//Return crude guess of cube root of user input, and this guess cubed
//import scanner before it can be used
import java.util.Scanner;
//define class
public class Root {
    //main method required for every java program
    public static void main(String[] args) {
        
        //declare instace of scanner object
        Scanner myScanner;
        //call the scanner constructor
        myScanner = new Scanner( System.in );
        //prompt user for number
        System.out.print("Enter a double, and the cube root will be printed- ");
        //accept input from user
        double userDouble = (double) myScanner.nextDouble();
        
        double guess = userDouble/3;
        //improve guess four times
        double secondGuess = (2*guess*guess*guess+userDouble)/(3*guess*guess);
        double thirdGuess = (2*secondGuess*secondGuess*secondGuess+userDouble)/(3*secondGuess*secondGuess);
        double fourthGuess = (2*thirdGuess*thirdGuess*thirdGuess+userDouble)/(3*thirdGuess*thirdGuess);
        double fifthGuess = (2*fourthGuess*fourthGuess*fourthGuess+userDouble)/(3*fourthGuess*fourthGuess);
        double cubeRoot = (2*fifthGuess*fifthGuess*fifthGuess+userDouble)/(3*fifthGuess*fifthGuess);
        //cube final guess
        double cubed = (cubeRoot*cubeRoot*cubeRoot);

        //print results
        System.out.println("The cube root is "+cubeRoot);
        System.out.println(cubeRoot+" + "+cubeRoot+" + "+cubeRoot+" = "+cubed);

    } //end of main method
} //end of class