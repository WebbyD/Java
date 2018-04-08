/**
 *
 * @author Marcais Jackson
 */
//Chapter 4, Exercise 4.17
/**HashMap uses a hashtable to implement the Map interface. This allows the execution time of basic operations, such as get( ) and put( ), to 
      **remain constant even for large sets.
      */
import java.util.HashMap;
import java.util.Scanner;



class GasMilege 
{

//Map to store miles and gallons for each trip.

//Miles as key and gallons as value.
private HashMap<Integer,Integer> milesToGallonMap ;

//Number of trips done.
private int numberOfTrips;

private int count;

//Default constructor to initialize instance variables
public GasMilege()
{

milesToGallonMap = new HashMap<>();

numberOfTrips=0;

count=1;

}

//Setter method for numberOfTrips.

public void setNumberOfTrips(int numberOfTrips) 
{
/*This can be used inside the Method or constructor of Class. It(this) works as a reference to the current 
**Object whose Method or constructor is being invoked.
*/
this.numberOfTrips = numberOfTrips;

}

//Setter method for setMilesToGallonMap
public void setMilesToGallonMap(HashMap<Integer, Integer> milesToGallonMap) 
{

this.milesToGallonMap = milesToGallonMap;

}

public HashMap<Integer, Integer> getMilesToGallonMap() 
{

return milesToGallonMap;

}

//Method to calcualte milege for each trip
public void calculateMilege()
{

System.out.println("Below is the milege information for "+numberOfTrips+" trips\n");

//Iterate through hashmap that holds miles and gallon data for each trip.
for(int mile : milesToGallonMap.keySet() )
{

int miles = mile;

int fuel = milesToGallonMap.get(mile);

double mileges=(double)miles/fuel;

System.out.println("Milege for trip "+count+": "+mileges+" miles/gallon");

count++;

}

}

}
//This class has the main method need to run this program. :)
class GasMilegeMain 
{

private static int noOfTrips=0;

public static void main(String args[])
{

GasMilege milege = new GasMilege();

Scanner s = new Scanner(System.in);

System.out.println("Enter number Of trips done: ");

noOfTrips=s.nextInt();

milege.setNumberOfTrips(noOfTrips);

for(int m=0;m<noOfTrips;m++)
{

System.out.println("Enter miles for trip "+(m+1));

int miles=s.nextInt();

System.out.println("Enter gallons of fuel for trip "+(m+1));

int gallons = s.nextInt();

HashMap<Integer, Integer> tempMap=milege.getMilesToGallonMap();

tempMap.put(miles, gallons);

milege.setMilesToGallonMap(tempMap);

}

milege.calculateMilege();
}
}
