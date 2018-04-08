/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.32 (With main so this will run) Please note that this program contains 3 classes: DistanceCalculatorMain,Point and 
DistanceCalculator but not in the same file like some of the previous exercises. Just trying different Java things, hopefully this will keep 
things simple, you know? ;}
*/

/*import java.util.Scanner;breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods 
 *to read and parse various primitive values.It's widely used to parse text for string and primitive types using regular expression.
 *it also extends Object class and implements Iterator and Closeable interfaces.
 */
import java.util.Scanner;
//Main class to get the inputs and calculate the distance between the coordinates.
public class DistanceCalculatorMain  
{
public static void main(String[] args) 
{
//Use the Scanner to read the input from the user.
Scanner inputScanner = new Scanner(System.in);
System.out.println("Program to find distance between 2 co-ordinates");

//Get each of the co-ordinates
System.out.print("1st Coordinate. Enter X: ");
String firstX = inputScanner.next();
System.out.print("1st Coordinate. Enter Y: ");
String firstY = inputScanner.next();
System.out.print("2nd Coordinate. Enter X: ");
String secondX = inputScanner.next();
System.out.print("2nd Coordinate. Enter Y: ");
String secondY = inputScanner.next();
//Create the Point object for each of the pairs
Point firstPoint = new Point(Double.parseDouble(firstX), Double.parseDouble(firstY));
Point secondPoint = new Point(Double.parseDouble(secondX), Double.parseDouble(secondY));
//Create DistanceCalculator object and calculate distance.
DistanceCalculator dCalc = new DistanceCalculator(firstPoint, secondPoint);
double distance = dCalc.getDistanceBetweenPoints();
//Finally, print the result!
System.out.println("Distance between (" + firstX + ", " + firstY + ") & (" + secondX + ", " + secondY + ") = " + distance);
//Close the scanner object
inputScanner.close();
}
}



