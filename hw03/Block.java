import java.util.*;
/**
 * finds the volume and surface area of a block of user inputted dimensions
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Block
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);//sets up scanner
        System.out.println("Enter the length of the block");//asks for length
        double length = scan.nextDouble();//takes in lenght
        System.out.println("Enter the width of the block");//asks for width
        double width = scan.nextDouble();//takes in width
        System.out.println("Enter the height of the block");//asks for height
        double height = scan.nextDouble();//takes in height
        double volume = length*width*height;//computes the volume of given dimensions
        double surfaceA = (2*length*width)+(2*width*height)+(2*height*length);//computes the serface area of given dimensions
        //print out the volume and surface area
        System.out.println("The volume of the block of dimensions " + length + " x " + width +" x "+ height + " is " + volume);
        System.out.println("The surface area of the block is " + surfaceA);
    }
}
