import java.util.*;
/**
 * finds the area of many different shapes
 * 
 */
public class areas
{
    /*
     * gets the area of a circle
     */
    private static double area(int radius)
    {
        return Math.PI*(radius*radius);
    }
    /*
     * gets the area of a rectangle
     */
    private static double area(int length, int width)
    {
        return length*width;
    }
    /*
     * gets the area of a trepezoid
     */
    private static double area(int height, int base1, int base2)
    {
        return height*base1*base2;
    }
    /*
     * the main method
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean going = true;
        while(going)//keeps it going until person types exit
        {
            System.out.println("Enter shape you want to find the area of: Circle, Rectangle, or Trapezoid. Type Exit to exit");
            String x = scan.next();
            if(x.equalsIgnoreCase("circle"))//if input is circle
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the radius");//radius
                int y = sc.nextInt();
                System.out.println(area(y));//calls circle method
            }
            else if(x.equalsIgnoreCase("rectangle"))//if rectagnle
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the length");//length
                int y = sc.nextInt();
                System.out.println("Enter the width");//width
                int z = sc.nextInt();
                System.out.println(area(y, z));//calls rectable method
            }
            else if(x.equalsIgnoreCase("trapezoid"))//if trapezoid
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the height");//height
                int h = sc.nextInt();
                System.out.println("Enter the first base");//base 1
                int b1 = sc.nextInt();
                System.out.println("Enter the second base");//base2
                int b2 = sc.nextInt();
                System.out.println(area(h,b1,b2));//calls trapezoid method
            }
            else if(x.equalsIgnoreCase("exit"))//if user wants to exit program
            {
                going = false;//sets loop variable to false
                break;
            }
            else//in case its not a valid input
            {
                System.out.println("Please enter a valid shape");//tells them its not a valid input
            }
        }
    }
}
