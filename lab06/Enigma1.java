/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []arg){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
   System.out.println("You entered "+x+"%");
   //print out the proportion remaining for select percentages
   String proportion = String.format("%.2g%n", (1-x/100));
      System.out.println("The proportion remaining is " + proportion);

   }
}

/* Error report: 
The issue here was that all of those if else statements only provided
output for a select few of the 100 cases possible.  To make this
code work for every input (assuming the input is an int between
0 and 99), I made a new string variable called proportion that creates a string 
rounded to two decimal places.  This string is the proportion
out of 1 remaining.  The system then prints out this string.
 */