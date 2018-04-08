/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.17 
//import java.math.BigDecimal; Provides operations for arithmetic, scale manipulation, rounding, comparison, hashing, and format conversion.
import java.math.BigDecimal;
public class Product  
{

String name;

BigDecimal price;

public Product(String name, BigDecimal price) 
{

super();

this.name = name;

this.price = price;

}
//Getters for names
public String getName() 
{

return name;

}
//Setters for names
public void setName(String name) 
{

this.name = name;

}
//Getters for price
public BigDecimal getPrice()
{

return price;

}
//Setters for price
public void setPrice(BigDecimal price) 
{

this.price = price;

}
}