/**
 *
 * @author Marcais Jackson
 */
//Chapter 6, Exercise 6.8(With main so this will run)
import javax.swing.JOptionPane;
public class ParkingGarageMain 
{

public static void main(String args[]) 
{
// Instantiate Parking Garage class.
ParkingGarage pg = new ParkingGarage(); 

calculateAndDisplayCharges(pg);

}

//Recursively gets user input and display charges.

//Instance of Parking Garage class.

private static Boolean calculateAndDisplayCharges(ParkingGarage pg) 
{
// Get the input from user.
float hours = pg.getUsrInput(); 

Boolean toContinue = false;

System.out.println("");

if (hours <= 0.0 || hours > 24.0) 
{

JOptionPane.showMessageDialog(null, "Hours should be Between 1 to 24 !");

calculateAndDisplayCharges(pg);

} 
else 
{
// Get totalCharge from ParkingGarage class
float totalCharge = pg.calculateTotalCharges(hours); 
// call method to display the total Charge
pg.displayUserCharges(totalCharge); 

toContinue = pg.checkContinuation();

if (toContinue) 
{
// Repeat the process
toContinue = calculateAndDisplayCharges(pg); 

} 
else 
{

}

}

return toContinue;

}
}