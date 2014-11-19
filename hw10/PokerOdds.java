//B.A. Sizemore IV
//11-14-14
//PokerOdds java program
//

//import random
import java.util.Random;
//import scanner
import java.util.Scanner;
//define class
public class PokerOdds {
  //main method required for every java program
  public static void main(String[] arg) {
      //call showHands method
      showHands();
      //call simulateOdds method
      simulateOdds();
    } //end of main method


  //method to generate a random hand
  public static void showHands() {
      //create array for the 52 cards in the deck
      int deck[] = new int[52];
      for (int i = 0; i < deck.length; i++) {
        deck[i] = i;
      }

      //array to initialize all hand values to -1.
      int[] hand = new int[5];
      for (int j = 0; j < hand.length; j++) {
        hand[j] = -1;
      }

      //counter for the hand
      int handIndex = 0;
      //loop to draw a random card 5 times, storing the values in hand[]
      for (int l = 51; l < 52 && l > 46; l--) {
        //get random int between 0 and 51, inclusive
        int draw = (int)(Math.floor(Math.random() * 52));
        //set random number in a value of hand[];
        
        int n = deck[l];
        deck[draw] = n;
        deck[l] = -1;
        
        hand[handIndex] = draw;
        //increment hand index
        handIndex++;
      }


        String diamonds[] = new String[5];
        String hearts[] = new String[5];
        String clubs[] = new String[5];
        String spades[] = new String[5];
        int i = 0;
        int k = 0;
        int p = 0;
        int j = 0;
      for (int m = 0; m < hand.length; m++) {
        if (hand[m] / 13 == 0) {
          
          if (hand[m] % 13 == 0) {
            clubs[i] = "A";
            i++;
          }
          else if (hand[m] % 13 == 1) {
            clubs[i] = "K";
            i++;
          }
          else if (hand[m] % 13 == 2) {
            clubs[i] = "Q";
            i++;
          }
          else if (hand[m] % 13 == 3) {
            clubs[i] = "J";
            i++;
          }
          else if (hand[m] % 13 == 4) {
            clubs[i] = "10";
            i++;
          }
          else if (hand[m] % 13 == 5) {
            clubs[i] = "9";
            i++;
          }
          else if (hand[m] % 13 == 6) {
            clubs[i] = "8";
            i++;
          }
          else if (hand[m] % 13 == 7) {
            clubs[i] = "7";
            i++;
          }
          else if (hand[m] % 13 == 8) {
            clubs[i] = "6";
            i++;
          }
          else if (hand[m] % 13 == 9) {
            clubs[i] = "5";
            i++;
          }
          else if (hand[m] % 13 == 10) {
            clubs[i] = "4";
            i++;
          }
          else if (hand[m] % 13 == 11) {
            clubs[i] = "3";
            i++;
          }
          else if (hand[m] % 13 == 12) {
            clubs[i] = "2";
            i++;
          }

        }
        else if (hand[m] / 13 == 1) {
          if (hand[m] % 13 == 0) {
            diamonds[j] = "A";
            j++;
          }
          else if (hand[m] % 13 == 1) {
            diamonds[j] = "K";
            j++;
          }
          else if (hand[m] % 13 == 2) {
            diamonds[j] = "Q";
            j++;
          }
          else if (hand[m] % 13 == 3) {
            diamonds[j] = "J";
            j++;
          }
          else if (hand[m] % 13 == 4) {
            diamonds[j] = "10";
            j++;
          }
          else if (hand[m] % 13 == 5) {
            diamonds[j] = "9";
            j++;
          }
          else if (hand[m] % 13 == 6) {
            diamonds[j] = "8";
            j++;
          }
          else if (hand[m] % 13 == 7) {
            diamonds[j] = "7";
            j++;
          }
          else if (hand[m] % 13 == 8) {
            diamonds[j] = "6";
            j++;
          }
          else if (hand[m] % 13 == 9) {
            diamonds[j] = "5";
            j++;
          }
          else if (hand[m] % 13 == 10) {
            diamonds[j] = "4";
            j++;
          }
          else if (hand[m] % 13 == 11) {
            diamonds[j] = "3";
            j++;
          }
          else if (hand[m] % 13 == 12) {
            diamonds[j] = "2";
            j++;
          }
        }
        else if (hand[m] / 13 == 2) {
          if (hand[m] % 13 == 0) {
            hearts[k] = "A";
            k++;
          }
          else if (hand[m] % 13 == 1) {
            hearts[k] = "K";
            k++;
          }
          else if (hand[m] % 13 == 2) {
            hearts[k] = "Q";
            k++;
          }
          else if (hand[m] % 13 == 3) {
            hearts[k] = "J";
            k++;
          }
          else if (hand[m] % 13 == 4) {
            hearts[k] = "10";
            k++;
          }
          else if (hand[m] % 13 == 5) {
            hearts[k] = "9";
            k++;
          }
          else if (hand[m] % 13 == 6) {
            hearts[k] = "8";
            k++;
          }
          else if (hand[m] % 13 == 7) {
            hearts[k] = "7";
            k++;
          }
          else if (hand[m] % 13 == 8) {
            hearts[k] = "6";
            k++;
          }
          else if (hand[m] % 13 == 9) {
            hearts[k] = "5";
            k++;
          }
          else if (hand[m] % 13 == 10) {
            hearts[k] = "4";
            k++;
          }
          else if (hand[m] % 13 == 11) {
            hearts[k] = "3";
            k++;
          }
          else if (hand[m] % 13 == 12) {
            hearts[k] = "2";
            k++;
          }
        }
        else if (hand[m] / 13 == 3) {
      
          if (hand[m] % 13 == 0) {
            spades[p] = "A";
            p++;
          }
          else if (hand[m] % 13 == 1) {
            spades[p] = "K";
            p++;
          }
          else if (hand[m] % 13 == 2) {
            spades[p] = "Q";
            p++;
          }
          else if (hand[m] % 13 == 3) {
            spades[p] = "J";
            p++;
          }
          else if (hand[m] % 13 == 4) {
            spades[p] = "10";
            p++;
          }
          else if (hand[m] % 13 == 5) {
            spades[p] = "9";
            p++;
          }
          else if (hand[m] % 13 == 6) {
            spades[p] = "8";
            p++;
          }
          else if (hand[m] % 13 == 7) {
            spades[p] = "7";
            p++;
          }
          else if (hand[m] % 13 == 8) {
            spades[p] = "6";
            p++;
          }
          else if (hand[m] % 13 == 9) {
            spades[p] = "5";
            p++;
          }
          else if (hand[m] % 13 == 10) {
            spades[p] = "4";
            p++;
          }
          else if (hand[m] % 13 == 11) {
            spades[p] = "3";
            p++;
          }
          else if (hand[m] % 13 == 12) {
            spades[p] = "2";
            p++;
          }
        }
        }
        System.out.print("Clubs: ");
        for (int r = 0; r < i; r++) {
          System.out.print(clubs[r] + " ");
        }
        System.out.println();
        System.out.print("Diamonds: ");
        for (int r = 0; r < j; r++) {
          System.out.print(diamonds[r] + " ");
        }
        System.out.println();
        System.out.print("Hearts: ");
        for (int r = 0; r < k; r++) {
          System.out.print(hearts[r] + " ");
        }
        System.out.println();
        System.out.print("Spades: ");
        for (int r = 0; r < p; r++) {
          System.out.print(spades[r] + " ");
        }
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.print("Go again? Enter 'y' or 'Y', anything else to quit- ");
        String answer = scan.next();
        if ((answer.equals("y")) || (answer.equals("Y"))) {
          showHands();
        }
        } //end of showHands method

public static void simulateOdds() {
  System.out.println("rank of freq of exactly one pair:");
  String labels[] = {
    "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2", "1"
  };
 // for (int u = 0; u < 10000; u++) {
  //  for (int z = 0; z<5; z++) {
      
      
      //create array for the 52 cards in the deck
      int deck[] = new int[52];
      for (int i = 0; i < deck.length; i++) {
        deck[i] = i;
      }

      //array to initialize all hand values to -1.
      int[] hand = new int[5];
      for (int j = 0; j < hand.length; j++) {
        hand[j] = -1;
      }

      //counter for the hand
      int handIndex = 0;
      //loop to draw a random card 5 times, storing the values in hand[]
      for (int l = 51; l < 52 && l > 46; l--) {
        //get random int between 0 and 51, inclusive
        int draw = (int)(Math.floor(Math.random() * 52));
        //set random number in a value of hand[];
        
        int n = deck[l];
        deck[draw] = n;
        deck[l] = -1;
        
        hand[handIndex] = draw;
        //increment hand index
        handIndex++;
      
      
      
    if (FindDuplicates.exactlyOneDup(hand) == true){
      for (int j = 0; j < 11; j++) {
    System.out.println(labels[j] + ": 322");
    }
    }
    //}
    //}
   
   
   

}


  System.out.println("----------------");
  System.out.println("total not exactly one pair: 5789");
}
} //end of public class