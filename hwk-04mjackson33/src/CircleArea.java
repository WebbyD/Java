/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.20 Please note that this program contains 2 classes CircleArea and CircleAreaMain, in the same file. Just 
trying different Java things, hopefully this will keep things simple, you know? ;}
*/


/*import java.util.Scanner;breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods 
 *to read and parse various primitive values.It's widely used to parse text for string and primitive types using regular expression.
 *it also extends Object class and implements Iterator and Closeable interfaces.
 */
import java.util.Scanner;
public class CircleArea 
{

//Declaring instance variables

private double radius;

//Parameterized constructor

public CircleArea(double radius) 
{

this.radius = radius;

}

//Getters and setters

public double getRadius()
{

return radius;

}

public void setRadius(double radius) 
{

this.radius = radius;

}

//This method will calculate the area of the circle.

public double calculateArea() 
{

return Math.PI * radius * radius;

}

}

//Class with a main which will allow you to run this program.
class CircleAreaMain 
{
//Class with a main which will allow you to run this program.
public static void main(String[] args)
{

double radius;

//Creating an Scanner class object which is used to get the inputs entered by the user.



Scanner sc = new Scanner(System.in);

//Getting the input entered by the user.

System.out.print("Enter the radius of the Circle :");

radius=sc.nextDouble();

//Creating an instance of Circle.

CircleArea c=new CircleArea(radius);

//Displaying the area of the Circle.

System.out.printf("Area fo the Circle :%.2f\n",c.calculateArea());

}

}