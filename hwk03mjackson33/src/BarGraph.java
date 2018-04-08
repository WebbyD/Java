/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.16
public class BarGraph 
{
//private variables

    private int height;
    private Bar[] bars;
    private int size;

    public BarGraph(int height)
    {
        this.height = height;
        bars = new Bar[height];
        size = 0;
    }

    public void addBar(int width)
    {
        bars[size++] = new Bar(width);
    }

    public void display() 
    {
        for(int m = 0; m < size; ++m) 
        {
            bars[m].display();
        }
    }
}