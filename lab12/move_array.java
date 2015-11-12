import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Nick McIntyre on 11/12/2015.
 * a program to move the value at a inputted index to the end of the array
 */
public class move_array
{
    public static void main (String[] args)
    {
        int size;//size of the array
        int move;//which one to move
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick the size of the array");
        size = scan.nextInt();
        try//makes sure the size is not less than 0
        {
            if(size<0)
                throw new Exception("Negative numbers are not allowed");//throws the exception if needed
        }
        catch(Exception e)//catches the exception
        {
            System.out.println(e);
            //size = -1*size;
        }
        int array[] = new int[size];//creates the array
        for(int x = 0; x<array.length; x++)//populates it
            array[x] = (int)(Math.random()*100);
        System.out.print("The current array is " + Arrays.toString(array) + "\n");
        System.out.println("Enter the index of the array to be moved");
        move = scan.nextInt();//what index will be moved
        try//makes sure its within the length-1 of the array
        {

            if(move<0||move>=array.length)
                throw new Exception("Please enter a valid index number");
            else
            {
                int x = array[move];
                for(int y = move; y<array.length-1; y++)
                {
                    array[y] = array[y+1];
                }
                array[array.length-1] = x;
            }
        }
        catch (Exception e)//catches te exception
        {
            System.out.println(e);
            /*int x = array[move];
            for(int y = move; y<array.length-1; y++)
            {
                array[y] = array[y+1];
            }
            array[array.length-1] = x;*/
        }
        System.out.print("Final array " + Arrays.toString(array));
    }

}
