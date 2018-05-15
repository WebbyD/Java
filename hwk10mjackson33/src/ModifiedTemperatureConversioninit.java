/**
 *
 * @author Marcais Jackson
 */

/*Chapter 12, Exercise 12.13 Please note that this program contains 2 classes: ModifiedTemperatureConversion and ModifiedTemperatureConversioninit. I 
decided to seperate them into 2 Java class files just for old time's sake. Just trying some more different Java concepts, seeing what works and what doesnt
work especially in object-oriented design. Hopefully this will keep things simple, you know? ;}
*/
//import javax.swing.*; provides a set of "lightweight" (all-Java language) parts that, to the highest degree possible, work the same on all platforms.
import javax.swing.*;
//import java.awt.*; contains all of the classes for creating user interfaces and for painting graphics and images.
import java.awt.*;
//import java.awt.event.*; provides interfaces and classes for dealing with different types of events fired by AWT components.
import java.awt.event.*;
//import java.text.*; provides classes and interfaces for handling text, dates, numbers, and messages in a manner independent of natural languages.
import java.text.*;
public class ModifiedTemperatureConversioninit extends JApplet implements ActionListener 
{
    
//This creates a new TextField, which allows the editing of a single line text. 
JTextField txtInput;
/**This creates a JLabel instance with no image and with an empty string for the title and is used to display a single line of read only text. The text can
 * be changed by an application but a user cannot edit it directly.
 */
JLabel lblResult;
//Creates an unselected radio button with no text and is used to choose one option from multiple options.
JRadioButton rbCelcius, rbKelvin;
 
@Override
/*The init method is the first method called in an Applet or JApplet. When an applet is loaded by the Java plugin of a browser or by an applet viewer, it 
will first call the Applet.init method. So this file can run.
 */
public void init()
{
 
Container conpane = getContentPane();
conpane.setLayout (new FlowLayout());
 
txtInput = new JTextField("",10);
conpane.add(txtInput);
//This is kinda like a simple print statement but in this case, its for a GUI, like buttons and windows. :) 
rbCelcius= new JRadioButton ("to Celcius", true);
conpane.add(rbCelcius);
 
rbKelvin = new JRadioButton("to Kelvin", false);
conpane.add(rbKelvin);
 
ButtonGroup selection = new ButtonGroup();
selection.add(rbCelcius);
selection.add(rbKelvin);
 
JButton button = new JButton ("OK");
button.addActionListener(this);
conpane.add(button);
lblResult= new JLabel ("Please enter your Fahrenheit temperature, choose an option to convert and then click OK.");
conpane.add(lblResult);
}
 
@Override
public void actionPerformed(ActionEvent e) 
{
 
DecimalFormat df = new DecimalFormat ("#.##");
double ferenheit = Double.parseDouble(txtInput.getText());
double answer = 0.0;
 
answer = ((5.0/9.0)*(ferenheit - 32.0));
 
if (rbKelvin.isSelected())
answer += 273.15;
 
lblResult.setText(String.valueOf(df.format(answer)));
 
}
}