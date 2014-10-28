//BA Sizemore IV
//hw08
//10-23-14
//create methods for expected output
//
//import scanner
import java.util.Scanner;
//define class
public class HW8 {
    //main method required for every java program
    public static void main(String[] arg) {
        char input;
        //declare scanner and call scanner contructor
        Scanner scan = new Scanner(System.in);
        //prompt user
        System.out.print("Enter 'C' or 'c' to continue, anything else to quit- ");
        //force the user to enter c or C, assign to input
        input = getInput(scan, "Cc");
        //print out what they entered
        System.out.println("You entered '" + input + "'");
        //prompt user
        System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
        //force user to enter y, Y, n or N
        input = getInput(scan, "yYnN", 5); //give up after 5 attempts
        // if they entered something, print what they entered
        if (input != ' ') {
            System.out.println("You entered '" + input + "'");
        }
        //force the user to enter a digit of 0123456789
                input = getInput(scan, "Choose a digit.", "0123456789");
       // print out the digit they entered
                System.out.println("You entered '" + input + "'");
    }

    //define getInput method
    public static char getInput(Scanner scan, String a) {
        scan = new Scanner(System.in);
        String input = scan.next();
        char x = input.charAt(0);

        if (input.length() > 1) {
            System.out.println("You did not enter one character. Try again- ");
            return getInput(scan, a);
        }
        else {
            if (x == (a.charAt(0)) || x == (a.charAt(1))) {
                return x;
            }
        }

        System.out.println("You did not enter a character from the list 'Cc'; try again- ");
        return getInput(scan, a);
    }


    public static char getInput(Scanner scan1, String b, int n) {
        int j = 0;
        while (j < n) {
                scan1 = new Scanner(System.in);
                String input = scan1.next();
                char x = input.charAt(0);

                if (input.length() > 1) {
                    System.out.println("You did not enter one character. Try again- ");
                    return getInput(scan1, b, n);
                }
                else {
                    if (x == (b.charAt(0)) || (x == (b.charAt(1))) || (x == (b.charAt(2))) || (x == (b.charAt(3)))) {
                        return x;
                    }
                }

                System.out.println("You did not enter a character from the list 'YyNn'; try again- ");
                j++;
            }
            System.out.println("You failed after five tries.");
            return getInput(scan1, "Choose a digit.", "0123456789");
        }


        public static char getInput(Scanner scan2, String prompt, String c) {
            System.out.println(prompt);
            System.out.println("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
            scan2 = new Scanner(System.in);
            String input = scan2.next();
            char x = input.charAt(0);
            
              if (input.length() > 1) {
                    System.out.println("You did not enter only one character. Try again- ");
                    return getInput(scan2, prompt, c);
                }
                else {
                    if (x == (c.charAt(0)) || (x == (c.charAt(1))) || (x == (c.charAt(2))) || (x == (c.charAt(3))) || 
                    (x == (c.charAt(4))) || (x == (c.charAt(5))) || (x == (c.charAt(6))) || (x == (c.charAt(7))) || 
                    (x == (c.charAt(8))) || (x == (c.charAt(9))) || (x == (c.charAt(10)))) {
                        return x;
                    }
                }

                System.out.println("You did not enter an acceptable character");
                return getInput(scan2, prompt, c);
          }




    }