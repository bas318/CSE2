//BA Sizemore IV
//CSE 002
//Burger King Java Program
//
//ask users is they want burgers, sodas, or fries
//prompt users for details of their choices
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class BurgerKing {
    //main method required for every java program
    public static void main(String[] args) {
        //declare instance of scanner
        Scanner myScanner;
        //call the scanner constructor
        myScanner = new Scanner (System.in);
        //prompt user
        System.out.println("Enter a letter to indicate a choice of");
        System.out.println("    Burger (B or b)");
        System.out.println("    Soda (S or s)");
        System.out.print("    Fries (F or f)  ");
        //take input from user
        String mealLetter = myScanner.next();
        //if letter entered is B or b...
        if (mealLetter.equals("B") || mealLetter.equals("b")) {
            System.out.println("Enter A or a for all the fixins");
            System.out.println("    C or c for cheese");
            System.out.print("    N or n for none of the above  ");
            //take input from user
            String burgerFixins = myScanner.next();
            //print what user ordered
            switch (burgerFixins) {
                case "A":
                    System.out.println("You ordered a burger with all the fixins");
                    break;
                case "a":
                    System.out.println("You ordered a burger with all the fixins");
                    break;
                case "C":
                    System.out.println("You ordered a burger with cheese");
                    break;
                case "c":
                    System.out.println("You ordered a burger with cheese");
                    break;
                case "N":
                    System.out.println("You ordered a burger");
                    break;
                case "n":
                    System.out.println("You ordered a burger");
                    break;
                default:
                    System.out.println("You did not enter A, a, C, c, N, or n.");
                    return;
            }
        }
        else if (mealLetter.equals("S") || mealLetter.equals("s")) {
            //prompt user
            System.out.println("Do you want Pepsi (p or P),");
            System.out.print("  Coke (c or C), Sprite (s or S) or Mountain Dew (M or m)- ");
            //take input
            String sodaLetter = myScanner.next();
            //print what user ordered
            switch (sodaLetter){
                case "P":
                    System.out.println("You ordered a Pepsi");
                    break;
                case "p":
                    System.out.println("You ordered a Pepsi");
                    break;
                case "c":
                    System.out.println("You ordered a Coke");
                    break;
                case "C":
                    System.out.println("You ordered a Coke");
                    break;
                case "s":
                    System.out.println("You ordered a Sprite");
                    break;
                case "S":
                    System.out.println("You ordered a Sprite");
                    break;
                case "m":
                    System.out.println("You ordered a Mountain Dew");
                    break;
                case "M":
                    System.out.println("You ordered a Mountain Dew");
                    break;
                default:
                    System.out.println("You did not enter any of p, P, c, C, s, S, m, or M");
            }
        }
        else if (mealLetter.equals("F") || mealLetter.equals("f")) {
            //prompt user
            System.out.print("Do you want a large or small order of fries (l, L, s, or S)- ");
            //take input
            String friesOrder = myScanner.next();
            //print what user ordered
            switch (friesOrder) {
                case "l":
                    System.out.println("You ordered large fries");
                    break;
                case "L":
                    System.out.println("You ordered large fries");
                    break;
                case "s":
                    System.out.println("You ordered small fries");
                    break;
                case "S":
                    System.out.println("You ordered small fries");
                    break;
                default:
                    System.out.println("You did not enter l, L, s, or S");
            }
        }
        else {
            System.out.println("You did not enter any of B, b, S, s, F, or f");  //if no above conditions are true
        }
        
    }  //end of main method
}  //end of class
