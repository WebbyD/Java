/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.16
public class Bar 
 {
//private variables
    private int size;

    public Bar(int size) 
    {
        this.size = size;
    }
//Getters
    public int getSize() 
    {
        return size;
    }
//Setters
    public void setSize(int size) 
    {
        this.size = size;
    }

    public void display() 
    {
        for(int m = 0; m < size; ++m)
        {
            //The class with a main will print out asterisks according to the 5 numbers you give.
            System.out.print("*");
        }
        System.out.println();
    }

}
