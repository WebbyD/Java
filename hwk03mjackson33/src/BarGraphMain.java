/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.16(With main so this will run)
import java.util.Scanner;
//This class will utilize the data from the Bar and BarGraph classes to run and produce results. 
public class BarGraphMain 
{
public static void main(String[] args) 
    {
        
        Scanner in = new Scanner(System.in);
        //For this, enter 5 whole numbers.
        System.out.print("Enter 5 numbers: ");
        BarGraph barGraph = new BarGraph(5);
        for(int x = 0; x < 5; ++x) 
        {
            barGraph.addBar(in.nextInt());
        }
        barGraph.display();
    }

}