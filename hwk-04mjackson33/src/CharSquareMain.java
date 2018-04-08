/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.19(With main so this will run)
*/
/*import java.util.Scanner;breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods 
 *to read and parse various primitive values.It's widely used to parse text for string and primitive types using regular expression.
 *it also extends Object class and implements Iterator and Closeable interfaces.
 */
import java.util.Scanner;
public class CharSquareMain 
{
//Class with a main which will allow you to run this program.
public static void main(String args[])
{
//Using scanner to get user input.
Scanner sc = new Scanner(System.in);
//To hold the number of sides to be printed.
int side;
//To hold character to be printed in each side.
char fill;
//Prompting the user to enter fill haracter such as #, $ * etc.
System.out.println("Please enter Fill character");
fill = sc.next().charAt( 0 );
//Asking user to enter no of sides.
System.out.println("Please the enter side of the square to be printed");
//Reading into sc
side = sc.nextInt();

while(side < 0)
{
//This happens if you enter something like "-1".
System.out.println("You have entered a negative value.\nEnter side again!!");

side = sc.nextInt();

}
//Creating constructor from  using its parameterized constructor.
CharSquare as = new CharSquare(side,fill);
//Calling siaplaySquare() method to display the square with use entered character.
as.displaySquare();

}
}