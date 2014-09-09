//BA Sizemore
//CSE 002
//September 5, 2014

//Define a class
public class Arithmetic{
    
    //add main method
    public static void main (String[] Args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSockCost$;   //total cost of socks
        double totalGlassCost$;  //total cost of glasses
        double totalEnvelopesCost$;  //total cost of envelopes
        double totalCost$;  //total cost 
        double socksTax$;  //tax on socks
        double glassTax$;  //tax on glasses
        double envelopeTax$;  //tax on envelopes
        double totalCostBeforeTax$;  //total cost before tax
        double totalTax$;  //total tax
        
        totalSockCost$=(nSocks*sockCost$);
        totalGlassCost$=(nGlasses*glassCost$);
        totalEnvelopesCost$=(nEnvelopes*envelopeCost$);
        socksTax$=(totalSockCost$*taxPercent);
        glassTax$=(totalGlassCost$*taxPercent);
        envelopeTax$=(totalEnvelopesCost$*taxPercent);
        totalCostBeforeTax$=(totalSockCost$+totalEnvelopesCost$+totalGlassCost$);
        
        double roundedSocksTax = (double) Math.round(socksTax$*100)/100;    //rounding to two decimal places
        double roundedGlassTax = (double) Math.round(glassTax$*100)/100;
        double roundedEnvelopeTax = (double) Math.round(envelopeTax$*100)/100;
        
        totalTax$=(roundedSocksTax+roundedGlassTax+roundedEnvelopeTax);  //rounded total tax
        totalCost$=(totalCostBeforeTax$+totalTax$);  //total cost
        //print results
        System.out.println("I bought "+nSocks+" socks at $"+sockCost$+" a piece, for a total of $"+
            totalSockCost$+" and $"+roundedSocksTax+" sales tax.");
        System.out.println("I bought "+nGlasses+" glasses at $"+glassCost$+" a piece, for a total of $"+
            totalGlassCost$+" and $"+roundedGlassTax+" sales tax.");
        System.out.println("I bought "+nEnvelopes+" envelope at $"+envelopeCost$+" a piece, for a total of $"+
            totalEnvelopesCost$+" and $"+roundedEnvelopeTax+" sales tax.");
        System.out.println("The total cost of the purchases was $"+totalCostBeforeTax$+", and the total sales tax was $"+totalTax$+".");
        System.out.println("The total amount paid for this transaction was $"+totalCost$+".");

    } //end of main method
}  //end of class
    

