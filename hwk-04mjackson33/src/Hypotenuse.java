/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.15 Please note that this program contains 3 classes Hypotenuse, HypotenuseA1 and HypotenuseMain, in the same file. Just 
trying different Java things, hopefully this will keep things simple, you know? ;}
*/

/*import java.util.Scanner;breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods 
 *to read and parse various primitive values.It's widely used to parse text for string and primitive types using regular expression.
 *it also extends Object class and implements Iterator and Closeable interfaces.
 */
import java.util.Scanner; 

public class Hypotenuse 
{

double side1,side2,hyp;
//Function to get input from user.  
void getdata() 
{
//Using scanner to get user input.   
Scanner input = new Scanner(System.in);
//Enter something like "1 2"
System.out.println("Please enter the lengths of two sides of the right triangle to find the hypotenuse:");
side1=input.nextDouble();
side2=input.nextDouble();
hyp = hypotenuse(side1,side2); 
input.close();
  
}
double hypotenuse(double m,double k)
{
double c;
//Using math method pow.
c=( (Math.pow(m,2)) + (Math.pow(k,2)) ); 
//Using math method sqrt.
return (Math.sqrt(c)); 
}
}
//Inheriting class Hypotenuse into HypotenuseA1. So class setters can use the member variables and member functions of base class, getters and setters.
class HypotenuseA1  extends Hypotenuse  
{
  
void display()
{
System.out.println("Hypotenuse is:"+hyp);
}
}

//Class with a main which will allow you to run this program.
class HypotenuseMain 
{

public static void main(String args[]) 
{
//Object of the derived class, HypotenuseA1.
HypotenuseA1 h2=new HypotenuseA1(); 
//Calling base class method
h2.getdata(); 

h2.display();
}
} 


