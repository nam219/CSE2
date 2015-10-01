import java.util.*;
/*
This is a class that finds the average grade for given numbers. Exit with 999
*/
public class averageGrade
{
    public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);//sets up a new scanner
            boolean stillGoing = true;
            double gradeT = 0;
            int count = 0;
            while(stillGoing)//while loop using the whileGoing variable to see if should keep going
            {
                System.out.println("Enter a Grade");//asks for grade
                double grade = scan.nextDouble();//stores grade
                if(grade==999)//checks if exit number
                {
                    stillGoing = false;
                }
                else if(grade>100||grade<0)//makes sure the number is a valid grade
                {
                    System.out.println("Please Enter a Valid Grade");
                    continue;
                }
                else//adds to the total count and adds to the variable counting the amount of grades entered
                {
                    //System.out.println(gradeT + " - " + grade);
                    gradeT+=grade;
                    //System.out.println(gradeT + " - " + grade);
                    count++;
                }
            }
            double avgG = gradeT/count;//finds average grade
            System.out.println("The average grade is " + avgG);//prints out the average grade
            //System.out.println(gradeT);
            //System.out.println(count);
        }
}