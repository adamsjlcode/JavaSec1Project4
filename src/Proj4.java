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
 * Enter type purpose here
 *
 * <hr>
 * Date created: Nov 21, 2015
 * <hr>
 * @author Justin Adams
 */
public class Proj4
{

	/**
	 * Enter method description here         
	 *
	 * <hr>
	 * Date created: Nov 21, 2015
	 *
	 * <hr>
	 * @param args
	 */
	public static void main (String [ ] args)
	{
		String strInfo;
		
		BookOrder b1 = new BookOrder("J.Rowling","Harry Potter",3,25.00,"11/21/15",3,'f');
		BookOrder b2 = new BookOrder("J.Rowling","Harry Potter Part 2");
		BookOrder b3 = new BookOrder();
		BookOrder b4 = new BookOrder(b1);
		
		
		
		strInfo=b1.invoice();
		System.out.print (strInfo);
		strInfo=b2.invoice();
		System.out.print (strInfo);
		strInfo=b3.invoice();
		System.out.print (strInfo);
		strInfo=b4.invoice();
		System.out.print (strInfo);

	}

}
