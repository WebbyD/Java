/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.32 Please note that this program contains 3 classes: DistanceCalculatorMain,Point and DistanceCalculator
but not in the same file like some of the previous exercises. Just trying different Java things, hopefully this will keep things simple, you know? ;}
*/
 
//Class to find distance between two coordinates.
public class DistanceCalculator 
{
private Point firstPoint;
private Point secondPoint;
public DistanceCalculator(Point newFirstPoint, Point newSecondPoint) 
{
firstPoint = newFirstPoint;
secondPoint = newSecondPoint;
}
//Getters and Setters
public Point getFirstPoint() 
{
return firstPoint;
}
public void setFirstPoint(Point newFirstPoint) 
{
firstPoint = newFirstPoint;
}
public Point getSecondPoint()
{
return secondPoint;
}
public void setSecondPoint(Point newSecondPoint) 
{
secondPoint = newSecondPoint;
}
public double getDistanceBetweenPoints() 
{
//Distance = √ Math.pow((x2−x1), 2) + Math.pow((y2−y1), 2)
double xDiff = secondPoint.getX() - firstPoint.getX();
double yDiff = secondPoint.getY() - firstPoint.getY();
double squareXDiff = Math.pow(xDiff, 2);
double squareYDiff = Math.pow(yDiff, 2);
double sumSquares = squareXDiff + squareYDiff;
return Math.sqrt(sumSquares);
}
}






