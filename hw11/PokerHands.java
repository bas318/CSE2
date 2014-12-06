//BA Sizemore IV
//December 2, 2014
//CSE 002
//PokerHands java program
//prompts the user to enter a five card poker hand, prints out the hand, and then prints out the rank of the hand, e.g. “Straight.”
//
import java.util.Scanner;
public class PokerHands {


    public static void showOneHand(int hand[]) {
        String suit[] = {
            "Clubs:	", "Diamonds: ", "Hearts:   ", "Spades:   "
        };
        String face[] = {
            "A ", "K ", "Q ", "J ", "10 ", "9 ", "8 ", "7 ", "6 ", "5 ",
            "4 ", "3 ", "2 "
        };
        String out = "";
        for (int s = 0; s < 4; s++) {
            out += suit[s];
            for (int rank = 0; rank < 13; rank++)
                for (int card = 0; card < 5; card++)
                    if (hand[card] / 13 == s && hand[card] % 13 == rank)
                        out += face[rank];
            out += '\n';
        }
        System.out.println(out);
    }


    public static void main(String[] args) {
        //new scanner
        Scanner scan = new Scanner(System.in);
        //prompt user
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        String q = scan.next();
        while (q.equals("y")||(q.equals("Y"))) {
            

        //create array for the 52 cards in the deck
        int deck[] = new int[52];
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        //array for hand
        int[] hand = new int[5];
        //array for frequency of ranks
        int[] frequency = new int[13];
        //array that counts the frequency of 0s, 1s, 2s, 3s, and 4s in above array
        //tells you composition of hand
        int[] composition = new int[5];
        //array for the five suits
        String[] suit = new String[5];
        //array for the five card numbers
        int[] number = new int[5];



        for (int j = 0; j < 5; j++) {
            //prompt user for suit
            System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
            //check input
            String x = scan.next();
            while (!((x.equals("c")) || (x.equals("d")) || (x.equals("h")) || (x.equals("s")))) {
                System.out.println("You did not enter a valid response");
                System.out.println("Enter the suit: 'c', 'd', 'h', or 's'- ");
                x = scan.next();
            }
            //store input (x) to suit array
            suit[j] = x;
            //prompt user for card
            System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
            //check input
            String r = scan.next();
            while (!((r.equals("a")) || (r.equals("k")) || (r.equals("q")) || (r.equals("j")) ||
                    (r.equals("10")) || (r.equals ("9")) || (r.equals("8")) || (r.equals("7")) || (r.equals("6")) || (r.equals("5")) ||
                    (r.equals("4")) || (r.equals("3")) || (r.equals("2")))) {
                System.out.println("You did not enter a valid response");
                System.out.println("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
                r = scan.next();
            }
        }
        System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
        q = scan.next();
    }
    }

} //end of public class PokerHands