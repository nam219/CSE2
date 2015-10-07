import java.util.*;
/*
a class that prints a triangle with the size given from the user
*/
public class pyramid 
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What size pyramid?");
        pyramid(scan.nextInt());
    }
    
    public static void printStars(int amount) //a method to print the proper number of start
    {
        for(int x = 0; x< amount; x++)
        {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpace(int amount) //a method to print the proper number of spaces
    {
        for(int x = 0; x< amount; x++)
        {
            System.out.print(" ");
        }
    }
    
    public static void pyramid(int height)
    {
        int size = height;
        int x = (size-1)*2 +1;
        int y = x/2;  // calculate how many spaces to print
        int z = 1;  // initial number of stars to print
        for(int i=0; i<size; i++) //determines how many lines you print
        {
            for(int j=0; j<=y; j++) //determines how many spaces you print
            {
                if(j==0)
                    continue;
                else
                    printSpace(1);
            }
            if(x==height)
                printStars(x);
            else
                printStars(z);
            y--;
            z+=2; //add 2 for the 1,3,5,7 increment
        }
         
 
    }
}