/**
 *
 * @author Marcais Jackson
 */
//Chapter 4, Exercise 4.18
import java.util.*;
//This part of the code enables everything in the non-main class to be tested.
class creditlimitcalculatormain 
{
public static void main(String[] args) 
{

Scanner sc=new Scanner(System.in);
//Do not enter decimals or it will cause errors. Just enter whole numbers only.
System.out.println("Enter account number:");
int ac=sc.nextInt();
System.out.println("Enter begining balance:");
int begbal=sc.nextInt();
System.out.println("Enter total items charged:");
int totitems=sc.nextInt();
System.out.println("Enter total credits applied:");
int totcredit=sc.nextInt();
System.out.println("Enter credit limit:");
int limit=sc.nextInt();
CreditLimitCalculator c=new CreditLimitCalculator(ac,begbal,totitems,totcredit,limit);
System.out.println("new balance is:"+c.getnewbalance());
c.limitexceeds();
}
}
//This is the non-main class. The main class "class creditlimitcalculatormain" takes all of this and creates results.
public class CreditLimitCalculator 
{
//Declarations for the credit limit calculator.   
int accountnumber;
int balancebegining;
int totalitemscharged;
int totalcreditapplied;
int creditlimit;
int newbalance;
//Constructor for credit limit calculator.
CreditLimitCalculator(int accountnumber,int balancebegining,int totalitemsncharged,int totalcreditapplied,int creditlimit)
{
/*This can be used inside the Method or constructor of Class. It(this) works as a reference to the current 
**Object whose Method or constructor is being invoked.
*/    
this.accountnumber=accountnumber;
this.balancebegining=balancebegining;
this.totalitemscharged=totalitemscharged;
this.totalcreditapplied=totalcreditapplied;
this.creditlimit=creditlimit;
}
public int getnewbalance()
{
this.newbalance= this.balancebegining+totalitemscharged-totalcreditapplied;
return newbalance;
}
public void limitexceeds()
{
if(this.newbalance>this.creditlimit)
System.out.println("Credit limit exceeded:");
else
System.out.println("Credit limit not exceeded:");
}
}
