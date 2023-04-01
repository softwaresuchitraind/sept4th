import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.text.ParseException;
class T3 
{
	public static void main(String[] args) 
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.YEAR,-5);
		Date d1 = cal.getTime();
		System.out.println(d1);
		SimpleDateFormat sdf = 
			new SimpleDateFormat("E-dd/MMMM/yyyy",Locale.ITALY);
		String s1 = sdf.format(d1);
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
while converting date to String we have to use parse() that
is ParseException type.
parseException is one of the checked exception

Sun Nov 24 16:13:23 IST 2013
dom-24/novembre/2013
Sun Nov 24 00:00:00 IST 2013
*/