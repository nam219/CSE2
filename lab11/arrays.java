import java.util.*;
/**
 * Sorts multiple arrays and then combines them
 * 
 * 
 */
public class arrays
{
    public static void main(String[] args)
    {
        int arr[] = new int[20];//new int array
        for(int x = 0; x<arr.length; x++)//fills it with random numbers
        {
            arr[x] = (int)(Math.random()*100);
        }
        sort(arr);//sorts the array
        for(int x = 0; x<arr.length; x++)//prints it
        {
            System.out.println(arr[x]);
        }
        int arr2[] = new int[10];//new int array
        for(int x = 0; x<arr2.length; x++)//put random numbers in it
        {
            arr2[x] = (int)(Math.random()*100);
        }
        sort(arr2);//sorts it
        for(int x = 0; x<arr2.length; x++)//prints it
        {
            System.out.println(arr2[x]);
        }
        int arr3[] = new int[30];//new array to hold 1 and 2 combined
        for(int x = 0; x<arr.length; x++)//adds the first array to it
        {
            arr3[x] = arr[x];
        }
        for(int x = 0; x<arr2.length; x++)//adds the second array to it
        {
            arr3[arr.length-1+x] = arr2[x];
        }
        sort(arr3);//sorts it
        for(int x = 0; x<arr3.length; x++)//prints it
        {
            System.out.println(arr3[x]);
        }
    }

    public static void sort(int x[])//method to sort the int array
    {
        Arrays.sort(x); //sorts the array
    }
}
