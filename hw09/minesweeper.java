import java.util.*;
/**
 *prints out a minesweeper field
 */
public class minesweeper
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number between 2 and 30");
        int num = scan.nextInt();//stores the number between 2 and 30
        String[][] array = new String[num][num];//sets a num x num sized array
        System.out.println("Enter the number of mines of the board between 1 and " + (num*num));
        int mines = scan.nextInt();//how many mines in the array
        String arryh[][] = populate(array, num,mines);//sets up a new array with the populated from populate method
        //System.out.println(Arrays.toString(nearby(arryh, num)));
        print((nearby(arryh, num)), num);//prints out the field from the method nearby method
    }

    public static String[][] populate(String array[][], int num, int mines)//randomly populates the array with the mines
    {
        int count = 0;
        if(mines>num*num)//what to do if the amount of mines is greater than size of array
            mines=(num*num);
        while(count<mines)
        {
            int left = (int)(Math.random()*num);//random 1
            int right = (int)(Math.random()*num);//random 2
            if(array[left][right]==null)//makes sure the array doesn't contain something
            {
                array[left][right] = "M";
                count++;
            }
            else if(array[right][left]==null)//checks the opposite way because why not
            {
                array[right][left] = "M";
                count++;
            }
        }
        for(int x = 0; x<num; x++)//replaces all instances of null with an empty string
        {
            for(int y = 0; y<num; y++)
            {
                if(array[x][y]==null)
                    array[x][y] = " ";
            }
        }
        //print(array, num);
        return array;
    }

    public static void print(String array[][], int num) //a way to print out the field
    {
        for(int x = 0; x<num;x++)
        {
            for(int y = 0; y<num; y++)
            {
                System.out.print(array[x][y] + " ");
            }
            System.out.println("");
        }
    }

    public static String[][] nearby(String array[][], int num)//populates the array with counting how many mines are nearby
    {
        for(int x = 0; x<num; x++)//goes through the left part of array
        {
            for(int y = 0; y<num; y++)//through the right side
            {
                if(!array[x][y].equalsIgnoreCase("M"))//checks to make sure that there's not a mine
                {
                    //all of these are what to do if it's at a point that is one the edge or corner of the field
                    int count = 0;
                    if(y+1==num&&x==0)
                    {
                        String sideLeft = array[x][y-1];
                        String bottomLeft = array[x+1][y-1];
                        String bottom  = array[x+1][y];
                        if(sideLeft.equals("M"))
                            count++;
                        if(bottomLeft.equals("M"))
                            count++;
                        if(bottom.equals("M"))
                            count++;
                    }
                    else if(y==0&&x==0)
                    {
                        String sideRight = array[x][y+1];
                        String bottom  = array[x+1][y];
                        String bottomRight = array[x+1][y+1];
                        if(sideRight.equals("M"))
                            count++;
                        if(bottomRight.equals("M"))
                            count++;
                        if(bottom.equals("M"))
                            count++;
                    }
                    else if(y==0 && x+1==num)
                    {
                        String top  = array[x-1][y];
                        String topRight = array[x-1][y+1];
                        String sideRight = array[x][y+1];
                        if(top.equals("M"))
                            count++;
                        if(topRight.equals("M"))
                            count++;
                        if(sideRight.equals("M"))
                            count++;
                    }
                    else if(y+1==num&&x+1==num)
                    {
                        String topLeft = array[x-1][y-1];
                        String top  = array[x-1][y];
                        String sideLeft = array[x][y-1];
                        if(sideLeft.equals("M"))
                            count++;
                        if(topLeft.equals("M"))
                            count++;
                        if(top.equals("M"))
                            count++;
                    }
                    else if(x==0 && (y>0 || (y+1)!= num))
                    {
                        String bottomLeft = array[x+1][y-1];
                        String bottom  = array[x+1][y];
                        String bottomRight = array[x+1][y+1];
                        String sideLeft = array[x][y-1];
                        String sideRight = array[x][y+1];
                        if(bottomLeft.equals("M"))
                            count++;
                        if(bottomRight.equals("M"))
                            count++;
                        if(bottom.equals("M"))
                            count++;
                        if(sideLeft.equals("M"))
                            count++;
                        if(sideRight.equals("M"))
                            count++;
                    }
                    else if(x+1==num && (y>0 || y+1 != num))
                    {
                        String topLeft = array[x-1][y-1];
                        String top  = array[x-1][y];
                        String topRight = array[x-1][y+1];
                        String sideLeft = array[x][y-1];
                        String sideRight = array[x][y+1];
                        if(topLeft.equals("M"))
                            count++;
                        if(top.equals("M"))
                            count++;
                        if(topRight.equals("M"))
                            count++;
                        if(sideLeft.equals("M"))
                            count++;
                        if(sideRight.equals("M"))
                            count++;
                    }
                    else if(y+1==num && (x>0 || x+1 != num))
                    {
                        String topLeft = array[x-1][y-1];
                        String sideLeft = array[x][y-1];
                        String bottomLeft = array[x+1][y-1];
                        String top = array[x-1][y];
                        String bottom = array[x+1][y];
                        if(topLeft.equals("M"))
                            count++;
                        if(sideLeft.equals("M"))
                            count++;
                        if(bottomLeft.equals("M"))
                            count++;
                        if(top.equals("M"))
                            count++;
                        if(bottom.equals("M"))
                            count++;
                    }
                    else if(y==0 && (x>0 || x+1 != num))
                    {
                        String topRight = array[x-1][y+1];
                        String sideRight = array[x][y+1];
                        String bottomRight = array[x+1][y+1];
                        String bottom  = array[x+1][y];
                        String top = array[x-1][y];
                        if(topRight.equals("M"))
                            count++;
                        if(sideRight.equals("M"))
                            count++;
                        if(bottomRight.equals("M"))
                            count++;
                        if(bottom.equals("M"))
                            count++;
                        if(top.equals("M"))
                            count++;
                    }
                    else
                    {
                        String topLeft = array[x-1][y-1];
                        String top  = array[x-1][y];
                        String topRight = array[x-1][y+1];
                        String sideLeft = array[x][y-1];
                        String sideRight = array[x][y+1];
                        String bottomLeft = array[x+1][y-1];
                        String bottom  = array[x+1][y];
                        String bottomRight = array[x+1][y+1];
                        if(sideLeft.equals("M"))
                            count++;
                        if(bottomLeft.equals("M"))
                            count++;
                        if(bottom.equals("M"))
                            count++;
                        if(topRight.equals("M"))
                            count++;
                        if(sideRight.equals("M"))
                            count++;
                        if(bottomRight.equals("M"))
                            count++;
                        if(topLeft.equals("M"))
                            count++;
                        if(top.equals("M"))
                            count++;
                    }
                    String countS = String.valueOf(count);
                    array[x][y] = countS;
                }

            }
        }
        return array;
    }
}


