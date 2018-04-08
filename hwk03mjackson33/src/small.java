/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.11
public class small 
{
//private variables
private int n;
private int arr[];

//Setter
void setN(int n)
{
this.n=n;
}
void setArr(int arr[])
{
this.arr=arr;
}
//Getter
int getN()
{
return n;
}
int getArr(int m)
{
return arr[m];
}
//Find minimum value function
int getMin()
{
int min=getArr(0);
for(int m=1;m<getN();m++)
{
if(getArr(m)<min)
min=getArr(m);
}
return min; 
}
}