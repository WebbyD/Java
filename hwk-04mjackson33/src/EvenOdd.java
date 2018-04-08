/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.17 Please note that this program contains 2 classes EvenOdd and EvenOddMain, in the same file. Just 
trying different Java things, hopefully this will keep things simple, you know? ;}
*/

/*import java.util.Scanner;breaks the input into tokens using a delimiter that is whitespace by default. It provides many methods 
 *to read and parse various primitive values.It's widely used to parse text for string and primitive types using regular expression.
 *it also extends Object class and implements Iterator and Closeable interfaces.
 */
import java.util.Scanner;
public class EvenOdd 
{
//Declarations    
private int number;
public EvenOdd() 
{
this.number = 0;
}
//Getter
public int getNumber() 
{
return number;
}
//Setter
public void setNumber(int number)
{
this.number = number;
}
public boolean isEven() 
{
//The Arithmetic Operator % divides left-hand operand by right-hand operand and returns the remainder.   
if (number % 2 == 0) 
{
return true;
} 
else 
{
return false;
}
}
}

//Class with a main which will allow you to run this program.
class EvenOddMain 
{
public static void main(String[] args) 
{
//Using scanner to get user input
Scanner userInput = new Scanner(System.in);
while(true) 
{
//This will ask the user to input numbers, press enter to determine if it's even or odd. Enter 0 when you're done.    
System.out.print("Enter an integers (0 to exit): ");
int inputNumber = userInput.nextInt();
//Enter 0 and you'll exit the program.
if (inputNumber == 0) 
{
System.out.println("Exit!");
break;
}
EvenOdd evenodd = new EvenOdd();
evenodd.setNumber(inputNumber);
System.out.println(evenodd.getNumber() + " is "+(evenodd.isEven() ? "Even Number" : "Odd Number"));
}
userInput.close();
}
}