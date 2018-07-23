import java.util.*;
 
public class GetCurrentDateAndTime
{
 
   
    int day;
	int month; 
	int year;
	GregorianCalendar date = new GregorianCalendar();
	  
	public String date()
	{
		String update;
		day = date.get(Calendar.DAY_OF_MONTH);
		month = date.get(Calendar.MONTH);
		year = date.get(Calendar.YEAR);
		update = ("Current date is  "+(month+1)+"/"+day+"/"+year);
		return update;
	}//End date()
}//End GetCurrentDateAndTime()