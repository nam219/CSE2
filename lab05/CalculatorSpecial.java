import java.util.*;
/*
A class that takes in two numbers and then prints the answer to them with the operator
that is given through a switch statement
keeps going until told to stop
*/
public class CalculatorSpecial
{
    public static void main (String[] args)
    {
        boolean x = true;
        while(x)//keeps going until user wants to stop
        {
            Scanner scan = new Scanner(System.in);//sets up a scanner
            System.out.println("Enter a number");//asks for 1st number
            double num1 = scan.nextDouble();//stores the first number
            System.out.println("Enter another number");//asks for num 2
            double num2 = scan.nextDouble();//stores it
            System.out.println("Enter the operation you want to preform on these numbers");//asks for the operation
            String op = scan.next();//sets it
            switch(op)//switch statement which figures out which operator is inputted and then preforms the operation
            {
                case "+"://if addition
                    System.out.println(num1 + " + "+ num2 + " = "+(num1+num2));
                    break;
                case "-"://if subtraction
                    System.out.println(num1 + " - " +num2 + " = " +(num1-num2));
                    break;
                case "*"://if multiplication
                    System.out.println(num1 + " * " +num2 + " = " +(num1*num2));
                    break;
                case "/"://if division
                    System.out.println(num1 + " / " +num2 + " = " +(num1/num2));
                    break;
                default://if a input other than a normal operator
                    System.out.println("Illegal Operator");
                    break;
            }
            System.out.println("Would you like to go again? Type n or N to stop.");//asks if wants to keep going
            if(scan.next().equalsIgnoreCase("n")) //takes in answer
                x = false; //exits loop
        }
        
    }
}