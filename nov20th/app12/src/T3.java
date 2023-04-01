import java.util.Date;
import java.util.Calendar;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.ParseException;
class T3 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		SimpleDateFormat sdf = new SimpleDateFormat("E-dd/MMMM/yyyy",Locale.ITALY);
		//dd/MMM/yyyy
		//"E-"
		String s1  = sdf.format(d1);
		System.out.println(s1);
		try
		{
			Date d2 = sdf.parse(s1);
			System.out.println(d2);
		}
		catch (ParseException ex)
		{
			ex.printStackTrace();
		}
	}
}
/*
DateFormat can be used formating the date according to country language
*/