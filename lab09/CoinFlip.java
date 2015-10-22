import java.lang.Math;
import java.util.Scanner;
/**
 * a program to flip a coin
 */
public class CoinFlip
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);//new scanner
        boolean cont = true;
        while(cont)//keeps asking until user inputs number greater than 100
        {
            System.out.println("Enter a number of times to flip the coin");
            int x = scan.nextInt();
            if(x>100)
                cont = false;
            else
                System.out.println(flip(x));//prints out the approiate flip method
        }
    }

    public static String flip()//for a single flip
    {
        double x = Math.random();//random number to find flip
        if(x>.5)//what the flip equals
            return "Heads: 1\nTails: 0";
        else
            return "Heads: 0\nTails: 1";
    }

    public static String flip(int n)//for more than 1 flip
    {
        int heads = 0;
        int tails = 0;
        if(n==0)//if 0 will cal other flip method
            return flip();
        else//if more than 0
        {
            for(int x = 0; x<n; x++)//to find flip for the number of times asked
            {
                double flip = Math.random();//random number for flip
                if(flip>.5)
                    heads++;
                else
                    tails++;
            }
            return "Heads: " + heads + "\nTails: " + tails;//returns the flips in string format
        }
    }
}
