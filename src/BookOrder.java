import java.text.DecimalFormat;

// TODO: Auto-generated Javadoc
/**
 * ---------------------------------------------------------------------------
 * File name: BookOrder.java
 * Project name: Project4
 * ---------------------------------------------------------------------------
 * Creator's name and email: Justin Adams, adamsjl3@goldmail.etsu.edu
 * Course:  CSCI 1250-003
 * Creation Date: Nov 21, 2015
 * ---------------------------------------------------------------------------
 */

/**
 * Book Order Class For Make An Invoice For Customer
 *
 * <hr>
 * Date created: Nov 21, 2015
 * <hr>
 * @author Justin Adams
 */
public class BookOrder
{
	 private String author;			//Name Of Author
	 private String title;			//Title Of Book
	 private int quantity;			//Quantity Of Books
	 private double costPerBook;	//cost of ONE book
	 private String orderDate;		//Order Date Of Invoice
	 private double weight;			//weight of the book in ounces
	 private char type;				// possible values:   R   -for rush (1-3 day delivery),  O – overnight, P – parcel post,
									//F –  FedEx , U – UPS,  N- 2-3 weeks//F –  FedEx , U – UPS,  N- 2-3 weeks
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Nov 21, 2015 .
	*/
	
	public BookOrder ( )
	{
	}//End BookOrder ( )
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Nov 21, 2015 .
	 *
	 * @param author the author
	 * @param title the title
	 */
	public BookOrder (String author, String title)
	{
		super ( );
		setAuthor(author);
		setTitle(title);
	}//End BookOrder (String,String)
	
	/**
	 * Constructor        
	 * 
	 * <hr>
	 * Date created: Nov 21, 2015 .
	 *
	 * @param author the author
	 * @param title the title
	 * @param quantity the quantity
	 * @param costPerBook the cost per book
	 * @param orderDate the order date
	 * @param weight the weight
	 * @param type the type
	 */						
	public BookOrder (	String author, String title, int quantity,
		                  	double costPerBook, String orderDate, double weight,
							char type)
	{
		super ( );
		setAuthor(author);
		setTitle(title);
		setQuantity(quantity);
		setCostPerBook(costPerBook);
		setOrderDate(orderDate);
		setWeight(weight);
		setType(type);
	}//End BookOrder (String,String,int,double,String,double,char)			
	
	/**
	 * Copy Constructor        
	 * 
	 * <hr>
	 * Date created: Nov 21, 2015 .
	 *
	 * @param order the order
	 */
	public BookOrder (BookOrder order)
	{
		this.author=order.author;
		this.title = order.title;
		this.quantity = order.quantity;
		this.costPerBook = order.costPerBook;
		this.orderDate = order.orderDate;
		this.weight = order.weight;
		this.type = order.type;
	}//End BookOrder (BookOrder) 
	
	/**
	 * Gets the author.
	 *
	 * @return author
	 */
	public String getAuthor ( )
	{
		return author;
	}//End getAuthor ( )
	
	/**
	 * Sets the author.
	 *
	 * @param author the author to set
	 */
	public void setAuthor (String author)
	{
		if (author.length() > 0)
			this.author=author;
	}//End setAuthor (String)
	
	/**
	 * Gets the title.
	 *
	 * @return title
	 */
	public String getTitle ( )
	{
		return title;
	}//End getTitle ()
	
	/**
	 * Sets the title.
	 *
	 * @param title the title to set
	 */
	public void setTitle (String title)
	{
		if (title.length() > 0)
		this.title = title;
	}//End setTitle (String)
	
	/**
	 * Gets the quantity.
	 *
	 * @return quantity
	 */
	public int getQuantity ( )
	{
		return quantity;
	}//End getQuantity 
	
	/**
	 * Sets the quantity.
	 *
	 * @param quantity the quantity to set
	 */
	public void setQuantity (int quantity)
	{
		if (quantity >= 0)
		this.quantity = quantity;
	}//End setQuantity (int)
	
	/**
	 * Gets the cost per book.
	 *
	 * @return costPerBook
	 */
	public double getCostPerBook ( )
	{
		return costPerBook;
	}//End getCostPerBook()
	
	/**
	 * Sets the cost per book.
	 *
	 * @param costPerBook the costPerBook to set
	 */
	public void setCostPerBook (double costPerBook)
	{
		if (costPerBook >= 0)
		this.costPerBook = costPerBook;
	}//End setCostPerBook(double)
	
	/**
	 * Gets the order date.
	 *
	 * @return orderDate
	 */
	public String getOrderDate ( )
	{
		return orderDate;
	}//End getOrderDate ()
	
	/**
	 * Sets the order date.
	 *
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate (String orderDate)
	{
		if (orderDate.length() > 0)
		this.orderDate = orderDate;
	}//End setOrderDate (String)
	
	/**
	 * Gets the weight.
	 *
	 * @return weight
	 */
	public double getWeight ( )
	{
		return weight;
	}//End getWeight()
	
	/**
	 * Sets the weight.
	 *
	 * @param weight the weight to set
	 */
	public void setWeight (double weight)
	{
		if (weight >= 0)
		this.weight = weight;
	}//End setWeight(double)
	
	/**
	 * Gets the type.
	 *
	 * @return type
	 */
	public char getType ( )
	{
		return type;
	}//End getType()
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType (char type)
	{
		String strType;		//Hold  Value Of type For UpperCase Method
		char cUpType;		//Hold UpperCase Value Of type
		strType = Character.toString(type);
		strType = strType.toUpperCase();
		cUpType = strType.charAt(0);
		switch (cUpType)
		{
		case 'R':
		case 'O':
		case 'P':
		case 'F':
		case 'U':
			this.type = cUpType;
			break;
		default:
			this.type = 'N';
		}
		
	}//End setType(char)
	
	/**
	 * Assign values.
	 *
	 * @param quantity the quantity
	 * @param costPerBook the cost per book
	 * @param orderDate the order date
	 * @param weight the weight
	 * @param type the type
	 */
	public void assignValues( int quantity,double costPerBook, String orderDate, double weight,
								char type)
	{
		setQuantity(quantity);
		setCostPerBook(costPerBook);
		setOrderDate(orderDate);
		setWeight(weight);
		setType(type);
	}//End assignValues(int,double,String,double,char)
	
	/**
	 * Adjust quantity.
	 *
	 * @param adjust the adjust
	 * @return iValid
	 */
	public int adjustQuantity(int adjust)
	{
		
		int zero =quantity+adjust;
		if (zero >= 0)
		{
				this.quantity+=adjust;
		}
		return this.quantity;
	}
	/**
	 * Total weight.
	 *
	 * @return the double
	 */
	public double totalWeight()
	{
		double dTotalWeight;		//Total Weight Of Books In Ounces
		dTotalWeight = quantity * weight;
		return dTotalWeight;
		
	}//End totalWeight()
	
	/**
	 * Calc cost.
	 *
	 * @return the double
	 */
	public double calcCost()
	{
		double dTotalCost;			//Total Cost Of Books
		dTotalCost = (quantity * costPerBook);
		return dTotalCost;
	}//End calcCost()
	
	/**
	 * Shipping.
	 *
	 * @return the double
	 */
	public double shipping ()
	{
		double dTotalShipping = 0;	//Total Cost Of Shipping
		switch(type)
		{
			case 'R':
				dTotalShipping = (totalWeight()*0.3);
				break;
			case 'O':
				dTotalShipping = (totalWeight()*0.5);
				break;
			case 'P':
				dTotalShipping = (totalWeight()*0.1);
				break;
			case 'F':
				dTotalShipping = (totalWeight()*0.25);
				break;
			case 'U':
				dTotalShipping = (totalWeight()*0.3);
				break;
			case 'N':
				dTotalShipping = (totalWeight()*0.05);
				break;
		}
		return dTotalShipping;
	}//End shipping ()
	
	/**
	 * Total cost.
	 *
	 * @return the double
	 */
	public double totalCost ()
	{
		double dTotalCost;			//Total Cost Of All Items
		dTotalCost = (shipping ()+calcCost());
		return dTotalCost;
	}//End totalCost ()
	
	/**
	 * Invoice.
	 *
	 * @return the string
	 */
	public String invoice()
	{
		String info = new String(); //Hold String Object Address To Return To Main
		DecimalFormat money = new DecimalFormat("$#,##0.00");
		info = 
		("\n\n**********INVOICE**********"
		+"\n\nOrder Date: " + orderDate
		+"\n\n       Title: " + title
		+"\n      Author: " + author
		+"\nCost of Book: " + money.format(costPerBook)
		+"\n    Quantity: " + quantity
		+"\n      Weight: " + weight
		+"\n    Shipping: " + type
		+"\n\n\t   Sub-Total: " + money.format(calcCost())
		+"\n\t    Shipping: " + money.format(shipping ())
		+"\n\t       Total: " + money.format(totalCost ())
		+"\n\n**********INVOICE**********\n");
		return info;
		
	}//End Invoice()
	
	/**
	 * Equals.
	 *
	 * @param book the book
	 * @return true, if successful
	 */
	public boolean equals(BookOrder book)
	{
	boolean blnResults = true;	//True Or False Value For Method
	if (!this.title.equals(book.title))
	{
		blnResults = false;
	}
	if (!this.author.equals(book.author))
	{
		blnResults = false;
	}
	if (this.quantity != book.quantity)
	{
		blnResults = false;
	}
	if (this.costPerBook != book.costPerBook)
	{
		blnResults = false;
	}
	if (this.weight != book.weight)
	{
		blnResults = false;
	}
	if (!this.orderDate.equals(book.orderDate))
	{
		blnResults = false;
	}
	if (this.type !=(book.type))
	{
		blnResults = false;
	}
	return blnResults;
	}//End Equals(BookOrder)
}//End BookOrder()