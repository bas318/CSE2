/////////////////////////////////////////////////////////////////
//BA Sizemore Iv
//September 4, 2014
//CSE 001
//Cylcometer Java Program
//
//print the number of minutes for each trip
//print the number of counts for each trip
//print the distance for each trip in miles
//print the distance for the two trips combined
//
public class Cyclometer {
    //main method required for every Java Program
    public static void main (String[] Args) {
        int secsTrip1=480;  //seconds in trip 1 
        int secsTrip2=3220;  //seconds in trip 2
        int countsTrip1=1561;  //counts for trip 1
        int countsTrip2=9037;  //counts for trip 2
        double wheelDiameter=27.0,  //diameter of wheel
        PI=3.14159,  //PI
        feetPerMile=5280,  //feet in a mile
        inchesPerfoot=12,  //inches in a foot
        secondPerMinute=60;  //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance;  //specify as double
        
        System.out.println("Trip 1 took "+
        (secsTrip1/secondPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
        (secsTrip2/secondPerMinute)+" minutes and had "+
        countsTrip2+" counts.");
        
        //trip one took 8.0 minutes and had 1561 counts
        //trip 2 took 53.666666666666664 minutes and had 9037 counts
        //trip 1 was 2.0897820980113635 miles
        //trip 2 was 12.098245240056817 miles
        //the total distance was 14.18802733806818 miles
distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
//(for each count, a rotation of the wheel travels
//the diameter in inches times PI)
distanceTrip1/=inchesPerfoot*feetPerMile;  //converts distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerfoot/feetPerMile;  //
totalDistance=distanceTrip1+distanceTrip2;
//Print out the output data
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");


    } //end of main method
} //end of class

