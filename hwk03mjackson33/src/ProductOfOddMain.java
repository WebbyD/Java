/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.12(With main so this will run)
/*import javax.swing.JOptionPane; creates a dialog box that can appear on the computer's desktop to request input from or display messages to 
*the user.
*/
import javax.swing.JOptionPane;
public class ProductOfOddMain extends ProductOfOdd
{
   // I'm Extending ProductOfOdd class which contains getters and setters to set and get the final value.
   public static void main(String args[])
   {
       ProductOfOdd my1 = new ProductOfOdd();
       //Creating object of ProductOfOdd class so that it gives the reference to set and get the value
       int a=1;
       //Intializing a value to 1, so that it can count the odd integers from 1
       for(int m=1;m<=15;m++)
       {
           //For loop contains up to how many odd integers we want
           if(m%2!=0)
           {
               // In this if loop we are checking which is not divisible by 2
               a=a*m;
               //and multiplying m value with a
           }
   }
my1.setCalValue(a);  
//I'm setting the a value so that we can get value at anywhere
JOptionPane.showMessageDialog(null,"The product is " + my1.getCalValue());
//Now I'm getting the value and showing the value in dialogue box in JOptionPane
   }
}
