/**
 *
 * @author Marcais Jackson
 */
//Chapter 6, Exercise 6.8
//import javax.swing.JDialog; represents a top level window with a border and a title used to take some form of input from the user. It inherits the Dialog class.
import javax.swing.JDialog;
//import javax.swing.JFrame;is an extended version of java.awt.Frame that adds support for the JFC/Swing component architecture.
import javax.swing.JFrame;
/*import javax.swing.JLabel; A display area for a short text string or an image, or both. A label does not react to input events. 
/As a result, it cannot get the keyboard focus. A label can, however, display a keyboard alternative as a convenience for a nearby 
/component that has a keyboard alternative but can't display it. 
**/
import javax.swing.JLabel;
/*import javax.swing.JOptionPane; creates a dialog box that can appear on the computer's desktop to request input from or display messages to 
*the user.
*/
import javax.swing.JOptionPane;
//import javax.swing.JPanel; is a generic lightweight container.
import javax.swing.JPanel;
//import javax.swing.JTextField;is a lightweight component that allows the editing of a single line of text.
import javax.swing.JTextField;

public class ParkingGarage 
{
// Charge for 0 to first Three hours
private float minCharge = 2.0f;
// Charge to be applicable every hour
private float chargePerHour = 0.5f;
// Max charge for 24 hours
private float maxChargePerDay = 10.0f; 

/**

*

* @param numberOfHours

* User has parked the car

*@return total fare for given number of hours

*/

public float calculateTotalCharges(float numberOfHours) 
{

float totalCharge = 0.0f;

if (numberOfHours <= 3) 
{

totalCharge = minCharge;

} else if (numberOfHours > 3 && numberOfHours <= 16)
{

// If user enters floating number like 3.5 he will be charged for 4 hours so ceiling is done to do that.

float remainingHoursToCharge = (float) Math.ceil(numberOfHours - 3.0f);

totalCharge = minCharge + remainingHoursToCharge * chargePerHour;

} 
else if (numberOfHours > 16 && numberOfHours <= 24)
{

totalCharge = maxChargePerDay;

}

System.out.println("Total Charge for yesterday was: " + totalCharge);

return totalCharge;

}

public void displayUserCharges(float totalCharge)
{

String message = "Total Charge";

JFrame parent = new JFrame();

parent.setTitle(message);

JOptionPane.showMessageDialog(parent, "Total charge is = " + totalCharge, message,

JOptionPane.INFORMATION_MESSAGE);

}

//Return number of hours the user has parked in



public float getUsrInput()
{

float hoursEntered = 0;

JTextField hrField = new JTextField(5);

JPanel myPanel = new JPanel();

myPanel.add(new JLabel("Hours:"));

myPanel.add(hrField);

int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter Number of Hours ",

JOptionPane.OK_CANCEL_OPTION);

if (result == JOptionPane.OK_OPTION)
{

hoursEntered = Float.valueOf(hrField.getText());

System.out.println("Number of hours parked: " + hoursEntered);

} 
else if (result == JOptionPane.CANCEL_OPTION) 
{
}

return hoursEntered;

}

// See if user wants to continue, return true: if user wants to continue, otherwise false

public boolean checkContinuation() 
{

Boolean toContinue = false;

JDialog.setDefaultLookAndFeelDecorated(true);

int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",

JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

if (response == JOptionPane.NO_OPTION) 
{

System.out.println("No");

} 
else if (response == JOptionPane.YES_OPTION) 
{

System.out.println("Yes");

return toContinue = true;

} 
else if (response == JOptionPane.CLOSED_OPTION) 
{

System.out.println("JOptionPane closed");

}

return toContinue;

}
}