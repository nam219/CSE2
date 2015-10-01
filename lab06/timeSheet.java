/*
a program to find the total pay of a number of emplyees
*/
import java.util.*;
public class timeSheet
{
    public static void main (String[] args)
    {
        
        Scanner scan = new Scanner(System.in);//new scanner
        System.out.println("Please enter the number of employees");//asksfor number of employees
        int num = scan.nextInt();
        double overallPay = 0;
        for(int x=1;x<num+1;x++)//goes through this loops once for each employee
        {
            System.out.println("Please enter the pay/hour in cents for employee " + x);//asks for the emplyee pay
            int pay = scan.nextInt();
            int total = 0;
            for(int y = 1; y<6; y++)//goes through for the hours worked for each day
            {
                System.out.println("Enter hours worked on day " + y);
                total+=scan.nextInt();//adds to total hours for the week
            }
            overallPay+=(pay*total);//computes the total pay
        }
        overallPay = overallPay/100;//converts it to dollars from cents
        System.out.println("The overall pay is $" + overallPay);
    }
}