/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.11 (With main so this will run)
/*import javax.swing.JOptionPane; creates a dialog box that can appear on the computer's desktop to request input from or display messages to 
*the user.
*/
import javax.swing.JOptionPane;
public class SmallestInteger 
{
public static void main(String[] args)
{
//Object for class    
small sm = new small(); 
//Print welcome message
JOptionPane.showMessageDialog(null,"HELLO!!");
//Get array size
int n=Integer.parseInt(JOptionPane.showInputDialog
("Please enter the number of integer values to compare:"));
sm.setN(n);
int[] arr=new int[n];
//Get array elements
for(int k=0;k<n;k++)
{
arr[k]=Integer.parseInt(JOptionPane.showInputDialog
("Enter integers"));
  
}
sm.setArr(arr);
//Get the minimum element
int min=sm.getMin(); 
//Display the value
JOptionPane.showMessageDialog(null,"The smallest integer is: "+ min); 
}
}
