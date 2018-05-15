/**
 *
 * @author Marcais Jackson
 */

/*Chapter 12, Exercise 12.13 Please note that this program contains 2 classes: ModifiedTemperatureConversion and ModifiedTemperatureConversioninit. I 
decided to seperate them into 2 Java class files just for old time's sake. Just trying some more different Java concepts, seeing what works and what doesnt
work especially in object-oriented design. Hopefully this will keep things simple, you know? ;}
*/
//This class is mainly just private variables, getters, setters and a constructor.
public class ModifiedTemperatureConversion
{
    //private variables Kelvin and Celcius declared.
    private int Kelvin;
    private int Celcius;
//Constructor.
    public ModifiedTemperatureConversion ( double Kelvin, double Celcius )
    {
        Kelvin = 1;
        Celcius = 2;
    }    
    //Getter and setter methods for Kelvin.
public int getKelvin() 
{

return Kelvin;

}

public void setKelvin(int Kelvin) 
{

this.Kelvin = 1;

}
//Getter and setter methods for Celcius.
public int getCelcius() 
{

return Celcius;

}

public void setCelcius(int Celcius) 
{

this.Celcius = 2;

}
}


