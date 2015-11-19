/**
 * a class to set and find area of a rectangle
 */
public class Rectangle
{
    double width;
    double height;
    public void setWidth(double x)//sets width
    {
        width = x;
    }
    public void setHeight(double x)//sets height
    {
        height = x;
    }
    public double getArea()//gets the area; returns a double
    {
        return width*height;
    }
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();//new rectangle object
        r1.setHeight(5.3);//sets height
        r1.setWidth(7.3);//sets width
        System.out.println(r1.getArea());//prints the area
    }
}
