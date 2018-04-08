/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.32 Please note that this program contains 3 classes: DistanceCalculatorMain,Point and DistanceCalculator
but not in the same file like some of the previous exercises. Just trying different Java things, hopefully this will keep things simple, you know? ;}
*/

//A class to denote a coordinate in 2-D space (i.e. along X & Y axis)
public class Point 
{
private double x;
private double y;
public Point(double newX, double newY) 
{
x = newX;
y = newY;
}
//Getters and Setters for the member variables
public double getX() 
{
return x;
}
public void setX(double newX) 
{
x = newX;
}
public double getY() 
{
return y;
}
public void setY(double newY) 
{
y = newY;
}
}