//BA Sizemore
//CSE 002
//BoolaBoola Java Program
//print a question that has 3 random booleans and ask the user if its true
//return either "correct" or "Wrong; try again"
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class BoolaBoola {
    //define main method
    public static void main(String[] args) {
        
    boolean trueFalse1 = (Math.random() < 0.5);
    boolean trueFalse2 = (Math.random() < 0.5);
    boolean trueFalse3 = (Math.random() < 0.5);
    
    String randomOperator1;
    boolean random1 = (Math.random() < 0.5);
    if (! random1) {
        randomOperator1 = "&&";
    }
    else { randomOperator1 = "||";
    }
    
    String randomOperator2;
    boolean random2 = (Math.random() < 0.5);
    if (random2 == false) {
        randomOperator2 = "&&";
    }
    else { randomOperator2 = "||";
    }
    //prompt user
    System.out.print("Does " + trueFalse1 + " " + randomOperator1 +
        " " + trueFalse2 + " " + randomOperator2 + " " + trueFalse3 +
        " have the value true(t/T) of false(f/F)? ");
       
    //declare instance of scanner
    Scanner myScanner;
    //call the scanner constructor
    myScanner = new Scanner (System.in);
    //take input from user  
    String input = myScanner.next();
    
    //write random equation
    boolean finalEquation = true;
    if (randomOperator1.equals("&&") && randomOperator2.equals("&&")) {
        finalEquation = (trueFalse1 && trueFalse2 && trueFalse3);
    }
    else if (randomOperator1.equals("||") && randomOperator2.equals("||")) {
        finalEquation = (trueFalse1 || trueFalse2 || trueFalse3);
    }
     else if (randomOperator1.equals("||") && randomOperator2.equals("&&")) {
        finalEquation = (trueFalse1 || trueFalse2 && trueFalse3);
    }
     else if (randomOperator1.equals("&&") && randomOperator2.equals("||")) {
        finalEquation = (trueFalse1 && trueFalse2 || trueFalse3);
    }
    
    //print answer
    if (input.equals("T")) {
        if (finalEquation){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
            return;
        }
    }
    
    else if (input.equals("t")) {
        if (finalEquation){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
            return;
        }
    }
    
    else if (input.equals("f")) {
        if (! finalEquation){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
            return;
        }
    }
    
    else if (input.equals("f")) {
        if (! finalEquation){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong; try again");
            return;
        }
    }
        
    }  //end of main method
}  //end of class