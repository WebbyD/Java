/**
 *
 * @author Marcais Jackson
 */
/*Chapter 6, Exercise 6.19 
*/

public class CharSquare 
{
//Declarations variable

private int side;
//As required we have defined one more variable fillCharacter which will store character entered by user.
private char fillCharacter;

//Getters and setters for side.

public int getSide()

{

return side;

}

public void setSide(int side)

{

this.side = side;

}

/*This constructor has taken only one variable as we have added one more variabale I have added one 
*more argument in this constructor to assign that value to fill Character.
*/

public CharSquare  (int side,char fillCharacter)

{

this.side = side;

this.fillCharacter=fillCharacter;

}

//Getters and setters for fillCharacter variable.

public char getFillCharacter() 
{

return fillCharacter;

}

public void setFillCharacter(char fillCharacter) 
{

this.fillCharacter = fillCharacter;

}

//Show the square

public void displaySquare()

{

for(int m=0;m<this.side;m++)

{

System.out.println();

for(int k=0;k<this.side;k++)

{
//Here in this instead of * we are printing the user entered characters.
System.out.print(fillCharacter);

}

}
}
}