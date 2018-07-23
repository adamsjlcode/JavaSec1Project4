import java.text.DecimalFormat;

/**
 * ---------------------------------------------------------------------------
 * File name: Proj4.java
 * Project name: Project4
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1250-003
 * Creation Date: Nov 21, 2015
 * ---------------------------------------------------------------------------
 */

/**
 * Driver Program For Book Order Class
 *
 * <hr>
 * Date created: Nov 21, 2015
 * <hr>
 * @author Justin Adams
 */
public class Proj4 
{

	/**
	 * Main Method For Book Order Class         
	 *
	 * <hr>
	 * Date created: Nov 21, 2015
	 *
	 * <hr>
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String strInfo;			//Holds Invoice Of Book Class For Display
		boolean blnTruth;		//Holds Assignment Value
		int iVaild;				//Holds Second Assignment Value
		BookOrder b1 = new BookOrder("J.Rowling","Harry Potter",3,25.00,"11/21/15",3,'f');
		BookOrder b2 = new BookOrder("J.Rowling","Harry Potter Part 2");
		BookOrder b3 = new BookOrder();
		BookOrder b4 = new BookOrder(b1);
		Utility u1 = new Utility();
		DecimalFormat money = new DecimalFormat("$#,##0.00");
		strInfo = b1.invoice();
		u1.theProgrammerInfo("Project 4 + 5");
		System.out.print ("\nBook Order One " + strInfo + "\nAll Value Constructor\n");
		u1.pressEnterToContinue();
		strInfo = b2.invoice();
		System.out.print ("\nBook Order Two: " + strInfo + "\nTitle And Author Constructor\n");
		u1.pressEnterToContinue();
		strInfo = b3.invoice();
		System.out.print ("\nBook Order Three No Arg: " + strInfo + "\nNull Constructor\n");
		u1.pressEnterToContinue();
		strInfo = b4.invoice();
		System.out.print ("\nBook Order Four Copy Of One: " + strInfo + "\nCopy Constructor\n");
		u1.pressEnterToContinue();
		
		blnTruth = b1.equals(b4);
		System.out.print ("Book Order One Equals Book Order Four: " + blnTruth);
		u1.pressEnterToContinue();
		
		blnTruth = b1.equals(b3);		
		System.out.print ("Book Order One Equals Book Order Three: " + blnTruth);
		u1.pressEnterToContinue();
		
		System.out.print ("Book Order One Author: " + b1.getAuthor ( ));
		u1.pressEnterToContinue();
		b1.setAuthor ("Rowling");
		System.out.print ("Book Order One New Author: " + b1.getAuthor ( ));
		u1.pressEnterToContinue();

		System.out.print ("Book Order One Title: " + b1.getTitle ( ));
		u1.pressEnterToContinue();
		b1.setTitle ("Sorcerer's Stone");		
		System.out.print ("Book Order One New Title: " + b1.getTitle ( ));
		u1.pressEnterToContinue();
		
		System.out.print ("Book Order One Quantity: " + b1.getQuantity ( ));
		u1.pressEnterToContinue();
		b1.setQuantity (1);		
		System.out.print ("Book Order One New Quantity: " + b1.getQuantity ( ));
		u1.pressEnterToContinue();
		
		System.out.print ("Book Order One CostPerBook: " +  money.format(b1.getCostPerBook( )));
		u1.pressEnterToContinue();
		b1.setCostPerBook(1);		
		System.out.print ("Book Order One New CostPerBook: " +  money.format(b1.getCostPerBook ( )));
		u1.pressEnterToContinue();

		System.out.print ("Book Order One OrderDate: " + b1.getOrderDate( ));
		u1.pressEnterToContinue();
		b1.setOrderDate("11/30/15");		
		System.out.print ("Book Order One New OrderDate: " + b1.getOrderDate ( ));
		u1.pressEnterToContinue();
		
		System.out.print ("Book Order One Weight: " + b1.getWeight( ));
		u1.pressEnterToContinue();
		b1.setWeight(5);		
		System.out.print ("Book Order One New Weight: " + b1.getWeight ( ));
		u1.pressEnterToContinue();
		
		b1.setType('x');
		strInfo=b1.invoice();
		System.out.print ("Book Order One Set Type to 'x' And Display"
						+ " All New Values For Book One: " + strInfo);
		u1.pressEnterToContinue();
		
		iVaild = b1.adjustQuantity(1);
		System.out.print ("Adjust Book Order One Quantity By Plus One: " + b1.getQuantity ( ));
		u1.pressEnterToContinue();		
		
		iVaild = b1.adjustQuantity(-2);
		System.out.print ("Adjust Book Order One Quantity By Negative Two: " + b1.getQuantity ( ));
		u1.pressEnterToContinue();
		
		iVaild = b1.adjustQuantity(-5);
		System.out.print ("Adjust Book Order One Quantity Past Zero: " + b1.getQuantity ( ));
		u1.pressEnterToContinue();
		
		b1.assignValues(3,25.00,"11/21/15",3,'f');
		strInfo=b1.invoice();
		System.out.print ("Book Order One Assign All New Values For "
				+ "WeightOrder, Date, CostPerBook, Quantity "
				+ "And Display Invoice" + strInfo);
		System.out.print ("\n\nClear Screen?\n\n");
		u1.pressEnterToContinue();
		u1.clearScreen();
	}//End Main(String)

}//End Proj4.java
