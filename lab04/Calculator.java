import java.util.*;
/*
A class that takes in two numbers and then prints the answer to them with the operator
that is given through a switch statement
*/
public class Calculator
{
    public static void main (String[] args)
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
    }
}