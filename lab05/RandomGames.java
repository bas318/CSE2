//BA Sizemore
//CSE 002
//Random Games java Program
//have user pick roulette, craps, or pick a card.  
//Display result unsing random number generators
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class RandomGames {
    //main method required for every java program
    public static void main(String[] args) {
        
    //declare instance of scanner
    Scanner gameScanner;
    //call the scanner constructor
    gameScanner = new Scanner (System.in);
    //prompt user
    System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card-");
    //assign input to gameLetter
    String gameLetter = gameScanner.next();
    //if input is r or R...
    if (gameLetter.equals("r") || gameLetter.equals("R")) {
        int rouletteNum = (int)(Math.random()*37)+0;
        switch (rouletteNum){
            //print 00 if random num is 37, otherwise print number
            case 37:
                System.out.println("00");
                break;
            default:
                System.out.println("Roulette: "+rouletteNum);
                break;
        }
    }
    //if input is C or c...
    else if (gameLetter.equals("C") || gameLetter.equals("c")) {
        //get two random rolls, print added result
        int roll1 = (int)(Math.random()*6)+1;
        int roll2 = (int)(Math.random()*6)+1;
        System.out.println("Craps: "+roll1+" + "+roll2+" = "+(roll1+roll2));
    }
    //if input is p or P...
    else if (gameLetter.equals("p") || gameLetter.equals("P")) {
        //randomize numbers for suit and car
        int suitNum = (int)(Math.random()*4)+1;
        int cardNum = (int)(Math.random()*13)+1;
        //declare card and suit as String variables
        String card;
        String suit = "x";
        //assign random numbers [1,4] to suits
        switch (suitNum) {
            case 1:
                suit = "Hearts";
                break;
            case 2:
                suit = "Clubs";
                break;
            case 3:
                suit = "Spades";
                break;
            case 4:
                suit = "Diamonds";
                break;
        }
        //assign random numbers to cards (unless 2-10)
        switch (cardNum) {
            case 11:
                card = "Jack";
                break;
            case 12:
                card = "Queen";
                break;
            case 13:
                card = "King";
                break;
            case 1:
                card = "Ace";
                break;
            default:
                card = String.valueOf(cardNum);
                break;
        }
        //print the card
        System.out.println(card+" of "+suit);
    }
    //if the input is more than one character...
    else if (gameLetter.length() != 1) {
        System.out.println("a single character expected");
        return;
    }
    //if none of the above conditions are true
    else {
        System.out.println("'"+gameLetter+"'"+" is not one of 'R', 'r', 'C', 'c', 'P', or 'p'");
        return;
    }
    
    } //end of main method
}  //end of class