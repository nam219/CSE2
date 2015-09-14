import java.util.*;
/**
 * finds the time until dinner
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Timer
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);//new scanner
        System.out.println("What is the current time?");//asks for time
        int time1 = scan.nextInt();//takes in the time
        System.out.println("Enter the time that youu will start dinner");//asks for start of dinner
        int time2 = scan.nextInt();//takes in that time
        int timeFt = time2-time1;//gets the time difference
        int hours = timeFt/100;//finds the hour difference
        double min = timeFt/100;//this and next find the min difference
        int minF = timeFt-(hours*100);
        System.out.println("Time until dinner is "  + hours + " hours and " + minF + " minutes.");//prints time until
    }
}
