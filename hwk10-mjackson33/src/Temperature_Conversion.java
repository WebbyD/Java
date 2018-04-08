/**
 *
 * @author Marcais Jackson
 */
//Chapter 12, exercise 12.12
//import java.text.*; provides classes and interfaces for handling text, dates, numbers, and messages in a manner independent of natural languages.
import java.awt.event.*;
/**import java.awt.event.ActionListener; is for processing an action event implements this interface, and the object created with that class 
*is registered with a component, using the component's addActionListener method. When the action event occurs, that object's actionPerformed method 
* is invoked.
*/
import java.awt.event.ActionListener;
//import javax.swing.JFrame; adds support for the JFC/Swing component architecture and is an extended version of java.awt.Frame.
import javax.swing.JFrame;
//import javax.swing.JPanel; is a generic lightweight container. 
import javax.swing.JPanel;
/**import javax.swing.JButton; is an implementation of a "push" button. Also, buttons can be controlled to some degree, by Actions 
 * and using an Action with a button has many benefits beyond directly configuring a button.
 */ 
import javax.swing.JButton;
/**import javax.swing.JLabel; can show either text, an image, or both. Label's contents are aligned by setting the vertical and horizontal 
*alignment in its display area.
*/
import javax.swing.JLabel;
//import javax.swing.JTextField; is a component which allows the editing of a single line of text.
import javax.swing.JTextField;
public class Temperature_Conversion extends JFrame
{
  
    private JPanel panel;
    private JButton farenheitButton;
    private JTextField farenheitField;
    private JLabel displayLabel, outputLabel;
    String input;
    double farenheit;
    double celcius;
  

    public Temperature_Conversion()
    {
        super ("Convert Farenheit to Celcius");
        displayPanel();
        add(panel);
       // TemperatureConversion textfield = new TemperatureConversion();
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setSize(400,200);
        super.setVisible(true);
      
    }
  
    private void displayPanel()
    {
        displayLabel = new JLabel ("Hello!!Please enter your Fahrenheit temperature.:");
        farenheitField = new JTextField(10);
        farenheitButton = new JButton ("Convert to Celcius");
       outputLabel = new JLabel ("");
     
        farenheitButton.addActionListener(new CalculateFahrenheit());
      
      
        panel = new JPanel();
        //panel.setLayout(new GridLayout(3,6));
        panel.add(displayLabel);
        panel.add(farenheitField);
        panel.add(farenheitButton);
       panel.add(outputLabel);
    }
  
    private class CalculateFahrenheit implements ActionListener
    {
      
        public void converFtoC(ActionEvent event)
        {
          
            input = farenheitField.getText();
            farenheit = Double.parseDouble(input);
          
            celcius = (5*farenheit - 160)/9; 
            outputLabel.setText("\n\nFarenheit in Celcius "
                    +farenheit+" is "+celcius);
        }

        @Override
        public void actionPerformed(ActionEvent event) 
        {
            converFtoC(event);
        }
    }

    public static void main(String args[]) 
    {
      Temperature_Conversion textfield = new Temperature_Conversion();
    }
  }