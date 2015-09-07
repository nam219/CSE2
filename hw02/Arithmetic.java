import java.text.*;
/**
 * a class that finds the total prices of various items on a shopping trip
 * 
 * @author Nick McIntyre
 * @version homework 2
 */
public class Arithmetic
{
    public static void main(String[] args)
    {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost=2.58;
        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost=2.29;
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost=3.25;
        double tax=0.06;
        
        //sets a variable for each of the total costs inluding tax
        double tSocks = ((nSocks*sockCost)+((nSocks*sockCost)*tax));
        double tGlasses = ((nGlasses*glassCost)+((nGlasses*glassCost)*tax));
        double tEnvelope = ((nEnvelopes*envelopeCost)+((nEnvelopes*envelopeCost)*tax));
        
        //where everything is printed
        System.out.println("This price of the socks is " + formatter.format((nSocks * sockCost)));
        System.out.println("The tax on the socks is " + formatter.format((nSocks * sockCost * tax)));
        System.out.println("This price of the glasses is " + formatter.format((nGlasses * glassCost)));
        System.out.println("The tax on the glasses is " + formatter.format((nGlasses * glassCost * tax)));
        System.out.println("The price of the envelopes is " + formatter.format(((nEnvelopes * envelopeCost))));
        System.out.println("The tax on the envelopes is " + formatter.format(((nEnvelopes * envelopeCost * tax))));
        System.out.println("The total cost of the purchase before tax is " + formatter.format(((nSocks * sockCost) + 
            (nGlasses * glassCost) + (nEnvelopes * envelopeCost))));
        System.out.println("The total cost of the purchase including tax is "+ 
            formatter.format((tSocks+tGlasses+tEnvelope)));
            
        
    }
}
