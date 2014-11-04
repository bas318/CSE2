//BA Sizemore IV
//CSE 002
//LoopTheLoop java program
//import scanner
import java.util.Scanner;
//define class
public class LoopTheLoop {
    //main method required for every java program
    public static void main(String[] args) {
        while (true) {
            //declare instance of scanner
            Scanner scan;
            //call the scanner constructor
            scan = new Scanner(System.in);
        int nStars = 0;
        int counter = 0;
        System.out.print("Enter an int between 1 and 15- ");
        if (scan.hasNextInt()) {
                int input = scan.nextInt();
                //check if user input is in the range 1-15
                if ((input >= 1) && (input <= 15)) {
                    //assign user's input to number
                    nStars = input;
                   
        while (nStars > counter) {
            System.out.print("*");
            counter++;
        }
            System.out.println();  
            int i = 0;
            while (i < nStars) {
                i++;
                int counter1 = 0;
                 while (i > counter1) {
                    System.out.print("*");
                    counter1++;
        }
              System.out.println();
                
            }


                }
                //if the user input is not between 1 and 15 print this
                else {
                    System.out.println("You did not enter an int bewtween 1 and 15");
                    continue;
                }
            }
            //if the user input is not an int print this
            else {
                System.out.println("You did not enter an int between 1 and 15");
                continue;
            }
            
                    
        System.out.print("Enter y or Y to go again- ");
        String continueOrNo = scan.next();
        //if letter entered is Y or y...
        if (continueOrNo.equals("Y") || continueOrNo.equals("y")) {
            continue;
        }
        else {
            break;
        }
    }

}
}
