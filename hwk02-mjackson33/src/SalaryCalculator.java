/**
 *
 * @author Marcais Jackson
 */
//Chapter 4, Exercise 4.20
/*import javax.swing.JOptionPane; creates a dialog box that can appear on the computer's desktop to request input from or display messages to 
/*the user. I thought I'd try it out because.....I just wanted to try something new and I'm glad I did. :) :) :)
*/
import javax.swing.JOptionPane;
class SalaryCalculator
{
public static void main(String args[])
{

double rate;

int hours, count = 0;

String input;

// Creating array of employees for storing info of the 3 employees.

Employee employees[] = new Employee[3];

while(count < 3)
{

// Reading hours worked.

input =JOptionPane.showInputDialog("Enter number of hours worked by employee #" + count + ":" );

System.out.println(input);
//Integer.parseInt(???); is used to get the primitive data type of a certain String. parseXxx() is a static method and can have 1 or 2 arguments.
hours = Integer.parseInt(input);

// Reading the hourly rate.

input =JOptionPane.showInputDialog("Enter hourly rate of employee #" + count + ":" );
//
rate = Double.parseDouble(input);
System.out.println(rate);

// Setting the values.
employees[count] = new Employee();
employees[count].setHours(hours);
employees[count].setHourlyRate(rate);

count++;

}

String result = "";

result = "Pay for Employee #1 " + String.valueOf(employees[0].calculatePay() + "\n");
result += "Pay for Employee #2 " + String.valueOf(employees[1].calculatePay()+ "\n");
result += "Pay for Employee #3 " + String.valueOf(employees[2].calculatePay()+ "\n");

JOptionPane.showMessageDialog(null, result, "Pay",JOptionPane.INFORMATION_MESSAGE );

}
}



class Employee
{

private double hourlyRate;
private int hours;
public double getHourlyRate() 
{

return hourlyRate;

}

public void setHourlyRate(double hourlyRate) 
{

this.hourlyRate = hourlyRate;

}

public int getHours() 
{

return hours;

}

public void setHours(int hours) 
{

this.hours = hours;

}

public double calculatePay()
{

double pay;

if(hours < 40)

pay = hours * hourlyRate;

else
{

pay = 40 * hourlyRate;

pay += (hours - 40) * hourlyRate / 2;

}

return pay;
}
}