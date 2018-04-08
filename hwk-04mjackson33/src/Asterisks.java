/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.18 Please note that this program contains 2 classes Asterisks and AsterisksMain, in the same file. Just 
trying different Java things, hopefully this will keep things simple, you know? ;}
*/


/*import java.util.Scanner;breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods 
 *to read and parse various primitive values.It's widely used to parse text for string and primitive types using regular expression.
 *it also extends Object class and implements Iterator and Closeable interfaces.
 */
import java.util.Scanner;
public class Asterisks 
{
//Declarations
private int side;
//Getter
public int getSide() 
{

return side;

}
//Setter
public void setSide(int side) 
{

this.side = side;

}

public Asterisks (int side) 
{

this.side = side;

}
//Show the square
public void displaySquare() 
{

for(int m=0;m<this.side;m++) 
{

System.out.println();

for(int k=0;k<this.side;k++) 
{

System.out.print("*");

}
}
}
}

class AsterisksMain
{
//Class with a main which will allow you to run this program.
public static void main(String args[]) 
{
//Using scanner to get user input
Scanner sc = new Scanner(System.in);

int side;

System.out.println("Please Enter side of the square to be printed");

side = sc.nextInt();

while(side < 0) 
{
//This happens if you enter something like "-1".
System.out.println("You have entered negative value.\nEnter side again!!");

side = sc.nextInt();

}

Asterisks as = new Asterisks(side);

as.displaySquare();

}
} 