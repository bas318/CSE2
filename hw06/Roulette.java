//BA Sizemore IV
//CSE 002
//10-10-14
//Roulette java program
//Run roulette simulation 1,000 times and return result
//
//import scanner before it can be used
import java.util.Scanner;
//define class
public class Roulette {
    //main method required for every java program
    public static void main(String[] args) {
    
    //assign a random number to bid on to rouletteNum
    int rouletteNum = (int)(Math.random()*37)+0;
    //intialize variables
    int counter1 = 0;
    int counter2 = 0;
    int counterLoss = 0;
    int moneyWon100 = 0;
    int counterWin = 0;
    int madeAProfit = 0;
    int lostEverything = 0;
    int totalWinnings = 0;
    
    
    //want to repeat the 100 sequence 1000 times with outside loop
    while (counter1 < 1000) {
        counter2 = 0;
    //bet 100 times on same number
        while (counter2 < 100) {
            //pick a random number (spin wheel)
            int randomNumber = (int)(Math.random()*37)+0;
            //see if your bet wins, if it wins add 1 to the counterWin
            if (rouletteNum == randomNumber) {
                counterWin = counterWin + 1;
                
            }
            //if the numbers dont match, add one to counterLoss
            else {
                counterLoss = counterLoss + 1;
            }
            
        counter2++;
        }
        
        //if you win more than three times you made a profit, so add 1 to the madeAProfit counter
        
        if(counterWin >= 3){
            madeAProfit = madeAProfit + 1;
        }
        //if the numbers never matched you lost everything
        if (counterWin == 0) {
            lostEverything = lostEverything + 1;
        }
    counter1++;
    //totalWinnings is how many times you won multiplied by $36
    totalWinnings += (counterWin*36);
    //reset counters
    counterWin = 0;
    counterLoss = 0;
    }
    int totalProfit = totalWinnings-100000;
    //total profit = your total winnings minus $100,000, which was the cost to buy in
    
    
//print results of running the 100 sequence 1000 times
System.out.println("You made a profit " + madeAProfit + " times");
System.out.println("You lost everything " + lostEverything + " times");
System.out.println("Your total winnings are $" + totalWinnings);
System.out.println("Your total profit is $" + totalProfit);
        
        
    } //end of main method
} //end of class