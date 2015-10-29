/**
 * stores and prints all values of an array with a randomly
 * generated amount of numbers from 0-100
 * */
 public class Average
 {
     public static void main(String[] args)
     {
         int sum = 0;
         double average;
         int n = (int)(Math.random()*100);//random number for the amount of elements in array arr
         int arr[] = new int[n];//initalizes arr with a random number of elements
         for(int x=0; x<arr.length; x++)//populates the array with a number from 0-100
             arr[x] = (int)(Math.random()*100);
         for(int x = 0; x<arr.length; x++)//prints out all elements in the array
             System.out.println(arr[x]);
         for(int x = 0; x<arr.length; x++)//find the sum of all elements in array
            sum+=arr[x];
        average = sum/(arr.length-1);//gets the average of the array
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
        for(int x = 0; x<arr.length; x++)//prints out element if it is greater than the average of the array
            if(arr[x]>average)
                System.out.println(arr[x]);
        
     }
     
 }