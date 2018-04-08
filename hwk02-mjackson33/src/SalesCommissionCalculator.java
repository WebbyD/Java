/**
 *
 * @author Marcais Jackson
 */
//Chapter 4, Exercise 4.19
/*import javax.swing.JOptionPane; creates a dialog box that can appear on the computer's desktop to request input from or display messages to 
/*the user. I thought I'd try it out and I'm glad I did. :) :) :)
*/
import javax.swing.JOptionPane;
//This is the non-main class.
class Sales
{
private double firstItemSale, secondItemSale, thirdItemSale, fourthItemSale;
//Getters and setters below for the Items and it's amount sold.
public double getFirstItemSale()
{

return firstItemSale;

}

public void setFirstItemSale(double firstItemSale) 
{

this.firstItemSale = firstItemSale;

}

public double getSecondItemSale()
{

return secondItemSale;

}

public void setSecondItemSale(double secondItemSale) 
{

this.secondItemSale = secondItemSale;

}

public double getThirdItemSale() 
{

return thirdItemSale;

}

public void setThirdItemSale(double thirdItemSale) 
{

this.thirdItemSale = thirdItemSale;

}

public double getFourthItemSale() 
{

return fourthItemSale;

}

public void setFourthItemSale(double fourthItemSale) 
{

this.fourthItemSale = fourthItemSale;

}

public double getTotalCommission()
{

return (firstItemSale + secondItemSale + thirdItemSale + fourthItemSale) * 0.09;

}
}

class SalesCommissionCalculatorMain
{
//This part of the code enables everything in the non-main class to be tested.    
public static void main(String args[])
{
//Declaring the required variables.
double gross = 0.0, earnings;

int product = 0, number;

String input;

Sales s = new Sales();

while ( product < 4 )

{
product++;

// Read number from user as a string.

input =JOptionPane.showInputDialog("Enter number sold of product #" + product + ":" );

// Converts numbers from type String to type int.

number = Integer.parseInt( input );

//Calculating the sales.

if ( product == 1 )

s.setFirstItemSale(number * 239.99);

else if ( product == 2 )

s.setSecondItemSale(number * 129.75);

else if ( product == 3 )

s.setThirdItemSale(number * 99.95);

else if ( product == 4 )

s.setFourthItemSale(number * 350.89);

}

earnings = s.getTotalCommission() + 200;

//Printing the result.

String result = "Weekly Earnings: " + earnings;

JOptionPane.showMessageDialog(null, result, "Sales",JOptionPane.INFORMATION_MESSAGE );

}
}