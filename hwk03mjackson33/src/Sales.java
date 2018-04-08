/**
 *
 * @author Marcais Jackson
 */
//Chapter 5, Exercise 5.17(With main so this will run)

/*INSTRUCTIONS:Keep on adding products and quantity by pressing Ok then press Cancel only to view result. 
Cancel will not add your final value. So press OK before cancel to add final value!!!*/

//import java.math.BigDecimal; Provides operations for arithmetic, scale manipulation, rounding, comparison, hashing, and format conversion.
import java.math.BigDecimal;
//import java.util.HashMap; provides all of the optional map operations, and permits null values and the null key.
import java.util.HashMap;
//import java.util.Map;represents a mapping between a key and a value. The Map interface is not a subtype of the Collection interface.
import java.util.Map;
//import javax.swing.Box;provides several class methods that are useful for containers using BoxLayout -- even non-Box containers. 
import javax.swing.Box;
/*import javax.swing.JLabel; A display area for a short text string or an image, or both. A label does not react to input events. 
/As a result, it cannot get the keyboard focus. A label can, however, display a keyboard alternative as a convenience for a nearby 
/component that has a keyboard alternative but can't display it. 
**/
import javax.swing.JLabel;
/*import javax.swing.JOptionPane; creates a dialog box that can appear on the computer's desktop to request input from or display messages to 
*the user.
*/
import javax.swing.JOptionPane;

import javax.swing.JPanel;
//import javax.swing.JTextField;is a lightweight component that allows the editing of a single line of text.
import javax.swing.JTextField;


public class Sales 
{

public static final String PRODUCT_1 = "Product 1";

public static final String PRODUCT_2 = "Product 2";

public static final String PRODUCT_3 = "Product 3";

public static final String PRODUCT_4 = "Product 4";

public static final String PRODUCT_5 = "Product 5";

static BigDecimal sum = new BigDecimal("0.0");

public static void main(String[] args) 
{

// List of products

Map<String, Product> productMap = new HashMap<String, Product>() 
{

{

put(PRODUCT_1, new Product(PRODUCT_1, new BigDecimal("2.98")));

put(PRODUCT_2, new Product(PRODUCT_2, new BigDecimal("4.50")));

put(PRODUCT_3, new Product(PRODUCT_3, new BigDecimal("9.98")));

put(PRODUCT_4, new Product(PRODUCT_4, new BigDecimal("4.49")));

put(PRODUCT_5, new Product(PRODUCT_5, new BigDecimal("6.87")));

}

};

JTextField productName = new JTextField(1);

JTextField productQuantity = new JTextField(5);

JPanel myPanel = new JPanel();

myPanel.add(new JLabel("Product Name (Please select. 1/2/3/4/5):"));

myPanel.add(productName);
 // a spacer
myPanel.add(Box.createHorizontalStrut(15)); 

myPanel.add(new JLabel("Product Quantity in number:"));

myPanel.add(productQuantity);

while (true) 
{

// To change JOptionPane text

int result = JOptionPane.showConfirmDialog(null, myPanel, "Please Enter Product and Quantity, when done adding press cancle to display result.",

JOptionPane.OK_CANCEL_OPTION);

if (result == JOptionPane.OK_OPTION) 
{

calculateTotal(productName, productQuantity, productMap);

} 
else 
{

System.out.println("Total is : $" + sum);

break;

}

}

}

private static void calculateTotal(JTextField productName, JTextField productQuantity,

Map<String, Product> productMap) 
{

BigDecimal price = null;

switch (productName.getText()) 
{

case "1":

price = productMap.get(PRODUCT_1).getPrice();

break;

case "2":

price = productMap.get(PRODUCT_2).getPrice();

break;

case "3":

price = productMap.get(PRODUCT_3).getPrice();

break;

case "4":

price = productMap.get(PRODUCT_4).getPrice();

break;

case "5":

price = productMap.get(PRODUCT_5).getPrice();

break;

}

sum = sum.add(price.multiply(new BigDecimal(productQuantity.getText())));

productName.setText("");

productQuantity.setText("");

}
}
