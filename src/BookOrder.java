import java.text.DecimalFormat;

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
 * Enter type purpose here
 *
 * <hr>
 * Date created: Nov 21, 2015
 * <hr>
 * @author Justin Adams
 */
public class BookOrder
{
 	String author;
	String title;
 	int quantity;
 	double costPerBook;		//cost of ONE book
 	String orderDate;
 	double weight;			//weight of the book in ounces
	char type;				// possible values:   R   -for rush (1-3 day delivery),  O – overnight, P – parcel post,
							//F –  FedEx , U – UPS,  N- 2-3 weeks//F –  FedEx , U – UPS,  N- 2-3 weeks
	
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Nov 21, 2015 
	 *
	 * 
	 */
	
	public BookOrder ( )
	{
	}
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Nov 21, 2015 
	 *
	 * 
	 * @param author
	 * @param title
	 */
	public BookOrder (String author, String title)
	{
		super ( );
		setAuthor(author);
		setTitle(title);
	}
	/**
	 * Constructor        
	 *
	 * <hr>
	 * Date created: Nov 21, 2015 
	 *
	 * 
	 * @param author
	 * @param title
	 * @param quantity					 
	 * @param costPerBook
	 * @param orderDate
	 * @param weight
	 * @param type
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
	}				
	/**
	 * Copy Constructor        
	 *
	 * <hr>
	 * Date created: Nov 21, 2015 
	 *
	 * 
	 */
	public BookOrder (BookOrder order)
	{
		this.author=order.author;
		this.title = order.title;
		this.quantity = order.quantity;
		this.costPerBook = order.costPerBook;
		this.orderDate = order.orderDate;
		this.weight = order.weight;
	}
	/**
	 * @return author
	 */
	public String getAuthor ( )
	{
		return author;
	}

	
	/**
	 * @param author the author to set
	 */
	public void setAuthor (String author)
	{
		if (author.length() > 0)
			this.author=author;
	}

	
	/**
	 * @return title
	 */
	public String getTitle ( )
	{
		return title;
	}

	
	/**
	 * @param title the title to set
	 */
	public void setTitle (String title)
	{
		if (title.length() > 0)
		this.title = title;
	}

	
	/**
	 * @return quantity
	 */
	public int getQuantity ( )
	{
		
		return quantity;
	}

	
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity (int quantity)
	{
		if (quantity >= 0)
		this.quantity = quantity;
	}

	
	/**
	 * @return costPerBook
	 */
	public double getCostPerBook ( )
	{
		return costPerBook;
	}

	
	/**
	 * @param costPerBook the costPerBook to set
	 */
	public void setCostPerBook (double costPerBook)
	{
		if (costPerBook >= 0)
		this.costPerBook = costPerBook;
	}

	
	/**
	 * @return orderDate
	 */
	public String getOrderDate ( )
	{
		return orderDate;
	}

	
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate (String orderDate)
	{
		if (orderDate.length() > 0)
		this.orderDate = orderDate;
	}

	
	/**
	 * @return weight
	 */
	public double getWeight ( )
	{
		return weight;
	}

	
	/**
	 * @param weight the weight to set
	 */
	public void setWeight (double weight)
	{
		if (weight >= 0)
		this.weight = weight;
	}

	
	/**
	 * @return type
	 */
	public char getType ( )
	{
		return type;
	}//End getType()
	/**
	 * @param type the type to set
	 * @return 
	 */
	public void setType (char type)
	{
		int iX;					//Counter
		String strType; 
		char[] errorCheck = {'r','R','o','O','p','P','f','F','u','U','n','N'};
		for(iX = 0;iX<errorCheck.length;iX++)
		{
			if (errorCheck[iX]!= type);
			{
				strType = "n";
			}
			strType = Character.toString(type);
			strType = strType.toUpperCase();
			this.type = strType.charAt(0);
		}
	}//End setType()
	public void assignValues( int quantity,double costPerBook, String orderDate, double weight,
								char type)
	{
		setQuantity(quantity);
		setCostPerBook(costPerBook);
		setOrderDate(orderDate);
		setWeight(weight);
		setType(type);
	}//End assignValues(int,double,String,double,char)
	public int adjustQuantity(int adjust)
	{
		int iValid = -1;		//User Input Was Assigned
		if (quantity != 0);
		{
			if (adjust > 0)
			{
				quantity++;
				iValid = adjust;
			}
			else 
			{
				quantity--;
				iValid = adjust;
			}
		}	
		return iValid;	
	}//End adjustQuantity(int)
	public double totalWeight()
	{
		double dTotalWeight;		//Total Weight Of Books In Ounces
		dTotalWeight = quantity * weight;
		return dTotalWeight;
		
	}//End totalWeight()
	public double calcCost()
	{
		double dTotalCost;			//Total Cost Of Books
		dTotalCost = (quantity * costPerBook);
		return dTotalCost;
	}//End calcCost()
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
	public double totalCost ()
	{
		double dTotalCost;			//Total Cost Of All Items
		dTotalCost = (shipping ()+calcCost());
		return dTotalCost;
	}//End totalCost ()
	public String invoice()
	{
		String info = new String();
		DecimalFormat money = new DecimalFormat("$#,##0.00");
		info = 
		("\n\n**********INVOICE**********"
		+"\n\nOrder Date:"
		+"\n\n       Title: " + title
		+"\n      Author: " + author
		+"\nCost of Book: " + money.format(costPerBook)
		+"\n    Quantity: " + quantity
		+"\n      Weight: " + weight
		+"\n\n\t   Sub-Total: " + money.format(calcCost())
		+"\n\t    Shipping: " + money.format(shipping ())
		+"\n\t       Total: " + money.format(totalCost ())
		+"\n\n**********INVOICE**********");
		return info;
		
	}
	public boolean equals(BookOrder book)
	{
	boolean blnResults = true;	
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
	}
}//End Equals(BookOrder)