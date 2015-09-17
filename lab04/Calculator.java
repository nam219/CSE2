import java.util.*;
public class Calculator
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double num1 = scan.nextDouble();
        System.out.println("Enter another number");
        double num2 = scan.nextDouble();
        System.out.println("Enter the operation you want to preform on these numbers");
        String op = scan.next();
        switch(op)
        {
            case "+":
                System.out.println(num1 + " + "+ num2 + " = "+(num1+num2));
                break;
            case "-":
                System.out.println(num1 + " - " +num2 + " = " +(num1-num2));
                break;
            case "*":
                System.out.println(num1 + " * " +num2 + " = " +(num1*num2));
                break;
            case "/":
                System.out.println(num1 + " / " +num2 + " = " +(num1/num2));
                break;
            default:
                System.out.println("Illegal Operator");
            
        }
    }
}