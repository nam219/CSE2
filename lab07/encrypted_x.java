/* 
a program to print out an encrypted x with the number of lines given thorugh user input
*/
import java.util.*;
public class encrypted_x
{
    public static void xSquare(int size)//method to print out the x
    {
        int n = size;
        for(int x = 0; x<size; x++)//number of vertical lines
        {
            for(int y = 0; y<size; y++)//number of horizontal lines
            {
                if(y==n || y==(size-n))//this is so that it will print a whitespace in the correct location for the x
                {
                    System.out.print(" ");
                   
                }
                else
                    System.out.print("*");
            }
            System.out.println("");
            n--;
                
        }

    }

    public static void main (String[] args)
    {
        int num = 0;
        boolean isV = false;//if its a valid number
        while(!isV)//keeps going until a valid number is entered
        {
            System.out.println("Enter a number from 0-100");
            Scanner scan = new Scanner(System.in);
            int holder = scan.nextInt();
            if(holder>100||holder<0)//checks if valid
                continue;
            else
            {
                num+=holder;
                isV = true;
            }
        }
        xSquare(num);//calls other method with the correct valid number of lines
    }
}