import java.util.*;
/**
 * explanation here
 * 
 * @author Nick McIntyre
 * @version lab 3
 */
 public class Check
 {
     //main method
     public static void main (String[] args)
     {
         Scanner myScanner = new Scanner(System.in);//sets up a new scanner
         System.out.print("Enter the original cost of the check in the form xx.xx: "); //asks for the total bill
         double checkCost = myScanner.nextDouble();//takes the total bill to a double
         System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");//asks for the tip percentage
         double tipPercent = myScanner.nextDouble();//takes the tip percentage
         tipPercent /=100; //convert percent into a decimal value
         System.out.print("Enter the number of people who went out to dinner: "); //asks for total number of people
         int numPeople = myScanner.nextInt();//takes in number of people
         double totalCost;//stores total cost
         double costPerPerson;//total cost per person
         int dollars, //whole dollar amount of cost
         dimes, pennies; //for storing digits
         //to the right of the decimal point
         //for the cost$
         totalCost = checkCost * (1 + tipPercent);//sets the total cost
         costPerPerson = totalCost / numPeople;//calculates cost per person
         //get the whole amount, dropping decimal fraction
         dollars=(int)costPerPerson;//sets it to dollars
         //get dimes amount, e.g.,
         // (int)(6.73 * 10) % 10 >67 % 10 > 7
         // where the % (mod) operator returns the remainder
         // after the division: 583%100 >83, 27%5 >2
         dimes=(int)(costPerPerson * 10) % 10;//the dimes (10s place)
         pennies=(int)(costPerPerson * 100) % 10; //the pennies (1s place)
         System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies); //prints out the cost per person
     }
 }