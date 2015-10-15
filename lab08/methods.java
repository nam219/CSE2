//a class to calculate different mean and median using methods
import java.util.*;
public class methods
{
    private static double median(double[] x)//method to calculate the median of a set of numbers
    {
        Arrays.sort(x);//makes sure its in order for the calculation
        double first = x[(x.length/2)];
        double second = x[(x.length/2)+1];
        return ((first+second)/2)-1;//finds median
    }
    private static double mean(double [] arr)//method to calculate the mean of a set of numbers
    {
        double tot = 0;
        int count = 0;
        for(int x=0; x<arr.length; x++)//totals the numbers and counts how many there are
        {
            tot+=arr[x];
            count++;
        }
        return tot/count;//returns it
    }
    public static void main(String[] args)
    {
        double[] arr = new double[10];//stores the inputs
        Scanner scan = new Scanner(System.in);
        for(int x = 0; x<10; x++)//asks for input
        {
            System.out.println("Enter number " + (x+1) + " of 10");
            arr[x] = scan.nextDouble();
        }
        //prints out the mean and median using the methods above
        System.out.println("The mean of the entered numbers is " + mean(arr));
        System.out.println("The meadian of the entered numbers is " + median(arr));
    }
}