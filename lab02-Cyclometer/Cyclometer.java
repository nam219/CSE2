/*
Nick McIntyre
Lab 02
Cyclometer Java Program

    first compile the program
        javac Cyclometer.java
    run the program
        java Cyclometer
*/
public class Cyclometer
{
    //main method
    public static void main (String[] args)
    {
        //input data
        int secsTrip = 480; //seconds of trip 1
        int secsTrip2 = 3220; //seconds of trip 2
        int countsTrip1 = 1561; //counts for trip 1
        int countsTrip2 = 9037; //counts for trip 2
        double wheelDiameter = 27.0; //diameter of trhe wheel
        double PI = 3.14159;//PI
        double feetPerMile = 5280;//the feet in a mile
        double inchesPerFoot = 12;//inches per foot
        double secondsPerMinute = 60; //seconds in a minute
        double distanceTrip1, distanceTrip2, totalDistance; //distance traveled on each trip and overall
        System.out.println("Trip 1 took " + (secsTrip/secondsPerMinute) +
            " minutes and had " + countsTrip1 + " counts.");
        System.out.println("trip 2 took " + (secsTrip2/secondsPerMinute) +
            " minutes and had " + countsTrip2 + " counts.");
        //caculating the distance traveled through the wheel diameter, 
        //counts, and PI so the we can get how far was traveled
        distanceTrip1 = countsTrip1 * wheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels the diameter
        //in inches times PI)
        distanceTrip1 /= inchesPerFoot * feetPerMile; //gives us distance in miles
        distanceTrip2 = countsTrip2 * wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance = distanceTrip1 + distanceTrip2;
        //prints the data
        System.out.println("Trip 1 was " + distanceTrip1 + " miles.");
        System.out.println("Trip 2 was " + distanceTrip2 + " miles.");
        System.out.println("The total distance was  " + totalDistance + 
            " miles.");
    }
}